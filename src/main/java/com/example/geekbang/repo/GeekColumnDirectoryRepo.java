package com.example.geekbang.repo;

import cn.hutool.core.collection.CollectionUtil;
import com.example.geekbang.entity.GeekColumnDirectory;
import com.example.geekbang.entity.GeekColumnDirectoryExample;
import com.example.geekbang.mapper.GeekColumnDirectoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qilihui
 * @date 2021/10/10 12:28 上午
 */
@Repository
@AllArgsConstructor(onConstructor_ = @Autowired)
public class GeekColumnDirectoryRepo {
    private final GeekColumnDirectoryMapper geekColumnDirectoryMapper;

    public int insert(GeekColumnDirectory geekColumnDirectory) {
        return geekColumnDirectoryMapper.insert(geekColumnDirectory);
    }

    public GeekColumnDirectory selectByColumnSkuAndChapterIdAndDirectoryId(GeekColumnDirectory geekColumnDirectory) {
        GeekColumnDirectoryExample example = new GeekColumnDirectoryExample();
        example.createCriteria()
                .andColumnSkuEqualTo(geekColumnDirectory.getColumnSku())
                .andChapterIdEqualTo(geekColumnDirectory.getChapterId())
                .andDirectoryIdEqualTo(geekColumnDirectory.getDirectoryId());
        List<GeekColumnDirectory> directoryList = geekColumnDirectoryMapper.selectByExample(example);
        if (CollectionUtil.isNotEmpty(directoryList)) {
            return directoryList.get(0);
        }
        return null;
    }

    public List<GeekColumnDirectory> selectByColumnSku(int sku) {
        GeekColumnDirectoryExample example = new GeekColumnDirectoryExample();
        example.createCriteria()
                .andColumnSkuEqualTo(sku);
        return geekColumnDirectoryMapper.selectByExample(example);
    }
}
