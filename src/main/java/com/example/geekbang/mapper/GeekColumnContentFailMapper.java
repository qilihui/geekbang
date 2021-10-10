package com.example.geekbang.mapper;

import com.example.geekbang.entity.GeekColumnContentFail;
import com.example.geekbang.entity.GeekColumnContentFailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeekColumnContentFailMapper {
    long countByExample(GeekColumnContentFailExample example);

    int deleteByExample(GeekColumnContentFailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GeekColumnContentFail record);

    int insertSelective(GeekColumnContentFail record);

    List<GeekColumnContentFail> selectByExample(GeekColumnContentFailExample example);

    GeekColumnContentFail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GeekColumnContentFail record, @Param("example") GeekColumnContentFailExample example);

    int updateByExample(@Param("record") GeekColumnContentFail record, @Param("example") GeekColumnContentFailExample example);

    int updateByPrimaryKeySelective(GeekColumnContentFail record);

    int updateByPrimaryKey(GeekColumnContentFail record);
}