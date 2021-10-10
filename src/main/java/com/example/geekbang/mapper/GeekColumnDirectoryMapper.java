package com.example.geekbang.mapper;

import com.example.geekbang.entity.GeekColumnDirectory;
import com.example.geekbang.entity.GeekColumnDirectoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeekColumnDirectoryMapper {
    long countByExample(GeekColumnDirectoryExample example);

    int deleteByExample(GeekColumnDirectoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GeekColumnDirectory record);

    int insertSelective(GeekColumnDirectory record);

    List<GeekColumnDirectory> selectByExample(GeekColumnDirectoryExample example);

    GeekColumnDirectory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GeekColumnDirectory record, @Param("example") GeekColumnDirectoryExample example);

    int updateByExample(@Param("record") GeekColumnDirectory record, @Param("example") GeekColumnDirectoryExample example);

    int updateByPrimaryKeySelective(GeekColumnDirectory record);

    int updateByPrimaryKey(GeekColumnDirectory record);
}