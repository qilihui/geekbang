package com.example.geekbang.service;

import cn.hutool.core.collection.CollectionUtil;
import com.example.geekbang.domain.dto.ChapterResponse;
import com.example.geekbang.entity.GeekColumn;
import com.example.geekbang.entity.GeekColumnChapter;
import com.example.geekbang.repo.GeekColumnChapterRepo;
import com.example.geekbang.repo.GeekColumnRepo;
import com.example.geekbang.tool.HttpTool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @author qilihui
 * @date 2021/10/9 9:17 下午
 */
@Service
@Slf4j
public class ColumnChapterService {
    private static final String URL = "https://time.geekbang.org/serv/v1/chapters";
    @Autowired
    private GeekColumnRepo geekColumnRepo;
    @Autowired
    private GeekColumnChapterRepo geekColumnChapterRepo;

    public void processAll() {
        List<GeekColumn> columnList = geekColumnRepo.selectAll();
        log.info("ColumnChapterService#processAll columnList.size:{}", columnList.size());
        if (CollectionUtil.isEmpty(columnList)) {
            return;
        }
        for (GeekColumn column : columnList) {
            try {
                parseToDb(column.getColumnSku());
            } catch (Exception e) {
                log.error("ColumnChapterService#processAll column.getColumnSku:{}", column.getColumnSku(), e);
            }
        }
        log.info("ColumnChapterService#processAll 执行完成");
    }

    public void parseToDb(int columnSku) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("cid", columnSku);
        ChapterResponse response = HttpTool.post(URL, map, ChapterResponse.class);
        List<ChapterResponse.DataDTO> data = response.getData();

        for (ChapterResponse.DataDTO dto : data) {
            GeekColumnChapter tmp = new GeekColumnChapter();
            tmp.setColumnSku(columnSku);
            tmp.setChapterId(Integer.valueOf(dto.getId()));
            GeekColumnChapter chapter = geekColumnChapterRepo.selectByColumnSkuAndChapterId(tmp);
            if (Objects.nonNull(chapter)) {
                log.error("ColumnChapterService#parseToDb 已存在 GeekColumnChapter:{}", chapter);
                continue;
            }
            chapter = new GeekColumnChapter();
            chapter.setColumnSku(columnSku);
            chapter.setChapterId(Integer.valueOf(dto.getId()));
            chapter.setSourceId(dto.getSourceId());
            chapter.setTitle(dto.getTitle());
            chapter.setArticleCount(dto.getArticleCount());
            geekColumnChapterRepo.insert(chapter);
        }
    }
}
