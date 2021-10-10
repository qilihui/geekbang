package com.example.geekbang.mapper;

import com.example.geekbang.entity.GeekColumnContent;
import com.example.geekbang.entity.GeekColumnContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeekColumnContentMapper {
    long countByExample(GeekColumnContentExample example);

    int deleteByExample(GeekColumnContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GeekColumnContent record);

    int insertSelective(GeekColumnContent record);

    List<GeekColumnContent> selectByExampleWithBLOBs(GeekColumnContentExample example);

    List<GeekColumnContent> selectByExample(GeekColumnContentExample example);

    GeekColumnContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GeekColumnContent record, @Param("example") GeekColumnContentExample example);

    int updateByExampleWithBLOBs(@Param("record") GeekColumnContent record, @Param("example") GeekColumnContentExample example);

    int updateByExample(@Param("record") GeekColumnContent record, @Param("example") GeekColumnContentExample example);

    int updateByPrimaryKeySelective(GeekColumnContent record);

    int updateByPrimaryKeyWithBLOBs(GeekColumnContent record);

    int updateByPrimaryKey(GeekColumnContent record);
}