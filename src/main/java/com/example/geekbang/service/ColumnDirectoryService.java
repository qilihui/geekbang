package com.example.geekbang.service;

import cn.hutool.core.collection.CollectionUtil;
import com.example.geekbang.domain.dto.DirectoryResponse;
import com.example.geekbang.entity.GeekColumn;
import com.example.geekbang.entity.GeekColumnDirectory;
import com.example.geekbang.repo.GeekColumnChapterRepo;
import com.example.geekbang.repo.GeekColumnDirectoryRepo;
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
public class ColumnDirectoryService {
    private static final String URL = "https://time.geekbang.org/serv/v1/column/articles";
    @Autowired
    private GeekColumnRepo geekColumnRepo;
    @Autowired
    private GeekColumnChapterRepo geekColumnChapterRepo;
    @Autowired
    private GeekColumnDirectoryRepo geekColumnDirectoryRepo;

    public void processAll() {
        List<GeekColumn> columnSkuList = geekColumnRepo.selectAll();
        log.info("ColumnDirectoryService#processAll chapterList.size:{}", columnSkuList.size());
        if (CollectionUtil.isEmpty(columnSkuList)) {
            return;
        }
        for (GeekColumn columnSku : columnSkuList) {
            try {
                parseToDb(columnSku.getColumnSku());
            } catch (Exception e) {
                log.error("ColumnDirectoryService#processAll columnSku:{}", columnSku);
            }
        }
        log.info("ColumnDirectoryService#processAll 执行完成");
    }

    public void parseToDb(int columnSku) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("cid", columnSku);
        map.put("size", 1000);
        map.put("prev", 0);
        map.put("order", "earliest");
        map.put("sample", false);

        DirectoryResponse response = HttpTool.post(URL, map, DirectoryResponse.class);
        List<DirectoryResponse.Data.List> directoryList = response.getData().getList();
        log.info("ColumnDirectoryService#parseToDb DirectoryResponse.Data.List.size:{}", directoryList.size());
        for (DirectoryResponse.Data.List dir : directoryList) {
            GeekColumnDirectory tmp = new GeekColumnDirectory();
            tmp.setColumnSku(columnSku);
            tmp.setChapterId(Integer.valueOf(dir.getChapterId()));
            tmp.setDirectoryId(dir.getId());
            GeekColumnDirectory insert = geekColumnDirectoryRepo.selectByColumnSkuAndChapterIdAndDirectoryId(tmp);
            if (Objects.nonNull(insert)) {
                log.error("ColumnDirectoryService#parseToDb 已存在 GeekColumnDirectory:{}", insert);
                continue;
            }
            insert = new GeekColumnDirectory();
            insert.setColumnSku(columnSku);
            insert.setChapterId(Integer.valueOf(dir.getChapterId()));
            insert.setDirectoryId(dir.getId());
            insert.setArticleTitle(dir.getArticleTitle());
            insert.setArticleSummary(dir.getArticleSummary());
            insert.setAudioTime(dir.getAudioTime());
            insert.setAudioTitle(dir.getAudioTitle());
            insert.setAudioUrl(dir.getAudioUrl());
            geekColumnDirectoryRepo.insert(insert);
        }
    }
}
