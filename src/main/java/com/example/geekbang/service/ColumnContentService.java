package com.example.geekbang.service;

import cn.hutool.core.collection.CollectionUtil;
import com.example.geekbang.domain.dto.ContentResponse;
import com.example.geekbang.entity.GeekColumn;
import com.example.geekbang.entity.GeekColumnContent;
import com.example.geekbang.entity.GeekColumnContentFail;
import com.example.geekbang.entity.GeekColumnDirectory;
import com.example.geekbang.exception.BizException;
import com.example.geekbang.mapper.GeekColumnContentFailMapper;
import com.example.geekbang.repo.GeekColumnContentRepo;
import com.example.geekbang.repo.GeekColumnDirectoryRepo;
import com.example.geekbang.repo.GeekColumnRepo;
import com.example.geekbang.tool.HttpTool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author qilihui
 * @date 2021/10/9 9:17 下午
 */
@Service
@Slf4j
public class ColumnContentService {
    private static final String URL = "https://time.geekbang.org/serv/v1/article";
    @Autowired
    private GeekColumnRepo geekColumnRepo;
    @Autowired
    private GeekColumnDirectoryRepo geekColumnDirectoryRepo;
    @Autowired
    private GeekColumnContentRepo geekColumnContentRepo;
    @Resource
    private GeekColumnContentFailMapper geekColumnContentFailMapper;

    private static final int STARTID = 0;

    public GeekColumnContent getBySkuAndDir(Integer sku, Integer dir) {
        GeekColumnContent content = new GeekColumnContent();
        content.setColumnSku(sku);
        content.setDirectoryId(dir);
        return geekColumnContentRepo.selectBLOBsByColumnSkuAndDirectoryId(content);
    }

    public void processAll() {
        List<GeekColumn> columnSkuList = geekColumnRepo.selectAll();
        columnSkuList = columnSkuList.stream().filter(geekColumn -> geekColumn.getColumnSku() >= STARTID).collect(Collectors.toList());
        log.info("ColumnContentService#processAll chapterList.size:{}", columnSkuList.size());
        if (CollectionUtil.isEmpty(columnSkuList)) {
            return;
        }
        int i = 0;
        for (GeekColumn columnSku : columnSkuList) {
            ++i;
            processDirectory(columnSku.getColumnSku());
            log.info("ColumnContentService#processAll id:{} sku:{} 抓取完成{}/{} ", columnSku.getId(), columnSku.getColumnSku(), i, columnSkuList.size());
        }
        log.info("ColumnContentService#processAll 执行完成");
    }

    public void processDirectory(int sku) {
        List<GeekColumnDirectory> directoryList = geekColumnDirectoryRepo.selectByColumnSku(sku);
        log.info("ColumnContentService#processDirectory start-sku:{} 专栏下文章总数:{}", sku, directoryList.size());
        int i = 0;
        for (GeekColumnDirectory directory : directoryList) {
            ++i;
            try {
                GeekColumnContent tmp = new GeekColumnContent();
                tmp.setColumnSku(sku);
                tmp.setDirectoryId(directory.getDirectoryId());
                GeekColumnContent content = geekColumnContentRepo.selectByColumnSkuAndDirectoryId(tmp);
                if (Objects.nonNull(content)) {
                    log.error("ColumnContentService#parseToDb 已存在:{}", content);
                    continue;
                }
                parseToDb(directory.getDirectoryId());
                log.info("ColumnContentService#processDirectory done sku:{} directory:{} 抓取完成{}/{}", sku, directory.getDirectoryId(), i, directoryList.size());
            } catch (BizException e) {
                log.error("ColumnContentService#processDirectory sku:{} directory:{}", sku, directory.getDirectoryId(), e);
                throw e;
            } catch (Exception e) {
                log.error("ColumnContentService#processDirectory columnSku:{} directorId:{}", sku, directory.getDirectoryId(), e);
                GeekColumnContentFail fail = new GeekColumnContentFail();
                fail.setSku(sku);
                fail.setDirectoryId(directory.getDirectoryId());
                try {
                    geekColumnContentFailMapper.insert(fail);
                } catch (Exception exception) {
                    log.error("ColumnContentService#processDirectory geekColumnContentFailMapper.insert失败 columnSku:{} directorId:{}", sku, directory.getDirectoryId(), e);
                }
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void parseToDb(int directoryId) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", directoryId);
        map.put("include_neighbors", true);
        map.put("is_freelyread", true);

        ContentResponse response = HttpTool.post(URL, map, ContentResponse.class);
        if (response.getCode() != 0) {
            log.error("ColumnContentService#parseToDb token过期");
            throw new BizException("token过期");
        }
        ContentResponse.Data data = response.getData();
        GeekColumnContent content = new GeekColumnContent();
        content.setColumnSku(Integer.valueOf(data.getSku()));
        content.setDirectoryId(directoryId);
        content.setAudioUrl(data.getAudioUrl());
        content.setAudioTime(data.getAudioTime());
        content.setAudioDownloadUrl(data.getAudioDownloadUrl());
        content.setChapterId(Integer.valueOf(data.getChapterId()));
        content.setArticleContent(data.getArticleContent());
        content.setArticleTitle(data.getArticleTitle());
        content.setArticleSharetitle(data.getArticleSharetitle());
        geekColumnContentRepo.insert(content);
    }
}
