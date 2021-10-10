package com.example.geekbang.service;

import com.alibaba.fastjson.JSON;
import com.example.geekbang.domain.dto.LabelSku;
import com.example.geekbang.domain.dto.LabelSkuResponse;
import com.example.geekbang.entity.GeekColumn;
import com.example.geekbang.repo.GeekColumnRepo;
import com.example.geekbang.tool.HttpTool;
import com.google.common.io.CharStreams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author qilihui
 * @date 2021/10/9 5:18 下午
 */
@Service
@Slf4j
public class ColumnService {
    private List<LabelSku.Data.List> lableSkuList;
    private static final String URL = "https://time.geekbang.org/serv/v3/column/info";

    @Autowired
    private GeekColumnRepo geekColumnRepo;

    @PostConstruct
    public void init() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("/gkColumn.json");
        String text = CharStreams.toString(new InputStreamReader(inputStream, "UTF-8"));
        LabelSku labelSku = JSON.parseObject(text, LabelSku.class);
        lableSkuList = labelSku.getData().getList().stream()
                .sorted(Comparator.comparing(LabelSku.Data.List::getColumnSku))
                .collect(Collectors.toList());
    }

    public void processAll() {
        log.info("ColumnService#processAll lableSkuList.size:{}", lableSkuList.size());
        for (LabelSku.Data.List list : lableSkuList) {
            try {
                parseToDb(list.getColumnSku());
                log.error("ColumnService#processAll done columnSku:{}", list.getColumnSku());
            } catch (Exception e) {
                log.error("ColumnService#processAll 失败 columnSku:{}", list.getColumnSku(), e);
            }
        }
        log.info("ColumnService#processAll 执行完成");
    }

    public void parseToDb(int columnSku) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("product_id", columnSku);
        map.put("with_recommend_article", false);
        LabelSkuResponse response = HttpTool.post(URL, map, LabelSkuResponse.class);
        LabelSkuResponse.Data data = response.getData();

        GeekColumn column = geekColumnRepo.selectByColumnSku(columnSku);
        if (Objects.nonNull(column)) {
            column.setCount(data.getArticle().getCount());
            column.setCurrCount(data.getArticle().getCountPub());
            geekColumnRepo.updateByPrimaryKeySelective(column);
            return;
        }
        GeekColumn iColumn = new GeekColumn();
        iColumn.setColumnSku(columnSku);
        iColumn.setTitle(data.getTitle());
        iColumn.setSubtitle(data.getSubtitle());
        iColumn.setCount(data.getArticle().getCount());
        iColumn.setCurrCount(data.getArticle().getCountPub());
        iColumn.setCatalogPicUrl(data.getColumn().getCatalogPicUrl());
        geekColumnRepo.insert(iColumn);
    }
}
