package com.example.geekbang.mapper.custom;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author qilihui
 * @date 2021/10/10 12:46 上午
 */
public interface GeekColumnChapterCustomMapper {
    @Select("select column_sku from g_column_chapter group by column_sku")
    List<Integer> selectGroupByColumnSku();
}
