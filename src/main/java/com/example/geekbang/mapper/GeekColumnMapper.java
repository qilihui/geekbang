package com.example.geekbang.mapper;

import com.example.geekbang.entity.GeekColumn;
import com.example.geekbang.entity.GeekColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeekColumnMapper {
    long countByExample(GeekColumnExample example);

    int deleteByExample(GeekColumnExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GeekColumn record);

    int insertSelective(GeekColumn record);

    List<GeekColumn> selectByExample(GeekColumnExample example);

    GeekColumn selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GeekColumn record, @Param("example") GeekColumnExample example);

    int updateByExample(@Param("record") GeekColumn record, @Param("example") GeekColumnExample example);

    int updateByPrimaryKeySelective(GeekColumn record);

    int updateByPrimaryKey(GeekColumn record);
}