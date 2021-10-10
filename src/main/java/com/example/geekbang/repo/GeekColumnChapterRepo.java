package com.example.geekbang.repo;

import cn.hutool.core.collection.CollectionUtil;
import com.example.geekbang.entity.GeekColumnChapter;
import com.example.geekbang.entity.GeekColumnChapterExample;
import com.example.geekbang.mapper.GeekColumnChapterMapper;
import com.example.geekbang.mapper.custom.GeekColumnChapterCustomMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qilihui
 * @date 2021/10/9 23:16
 */
@Repository
@AllArgsConstructor(onConstructor_ = @Autowired)
public class GeekColumnChapterRepo {
    private final GeekColumnChapterMapper geekColumnChapterMapper;
    private final GeekColumnChapterCustomMapper geekColumnChapterCustomMapper;

    public int insert(GeekColumnChapter geekColumnChapter) {
        return geekColumnChapterMapper.insert(geekColumnChapter);
    }

    public GeekColumnChapter selectByColumnSkuAndChapterId(GeekColumnChapter geekColumnChapter) {
        GeekColumnChapterExample example = new GeekColumnChapterExample();
        example.createCriteria()
                .andColumnSkuEqualTo(geekColumnChapter.getColumnSku())
                .andChapterIdEqualTo(geekColumnChapter.getChapterId());
        List<GeekColumnChapter> chapterList = geekColumnChapterMapper.selectByExample(example);
        if (CollectionUtil.isNotEmpty(chapterList)) {
            return chapterList.get(0);
        }
        return null;
    }

    public List<GeekColumnChapter> selectByColumnSku(int columnSku) {
        GeekColumnChapterExample example = new GeekColumnChapterExample();
        example.createCriteria()
                .andColumnSkuEqualTo(columnSku);
        return geekColumnChapterMapper.selectByExample(example);
    }

    public List<GeekColumnChapter> selectAll() {
        GeekColumnChapterExample example = new GeekColumnChapterExample();
        return geekColumnChapterMapper.selectByExample(example);
    }

    public List<Integer> selectGroupByColumnSku() {
        return geekColumnChapterCustomMapper.selectGroupByColumnSku();
    }
}
