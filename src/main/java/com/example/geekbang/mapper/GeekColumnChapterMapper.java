package com.example.geekbang.mapper;

import com.example.geekbang.entity.GeekColumnChapter;
import com.example.geekbang.entity.GeekColumnChapterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeekColumnChapterMapper {
    long countByExample(GeekColumnChapterExample example);

    int deleteByExample(GeekColumnChapterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GeekColumnChapter record);

    int insertSelective(GeekColumnChapter record);

    List<GeekColumnChapter> selectByExample(GeekColumnChapterExample example);

    GeekColumnChapter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GeekColumnChapter record, @Param("example") GeekColumnChapterExample example);

    int updateByExample(@Param("record") GeekColumnChapter record, @Param("example") GeekColumnChapterExample example);

    int updateByPrimaryKeySelective(GeekColumnChapter record);

    int updateByPrimaryKey(GeekColumnChapter record);
}