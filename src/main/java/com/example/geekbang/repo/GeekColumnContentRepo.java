package com.example.geekbang.repo;

import cn.hutool.core.collection.CollectionUtil;
import com.example.geekbang.entity.GeekColumnContent;
import com.example.geekbang.entity.GeekColumnContentExample;
import com.example.geekbang.mapper.GeekColumnContentMapper;
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
public class GeekColumnContentRepo {
    private final GeekColumnContentMapper geekColumnContentMapper;

    public int insert(GeekColumnContent geekColumnContent) {
        return geekColumnContentMapper.insert(geekColumnContent);
    }

    public GeekColumnContent selectByColumnSkuAndDirectoryId(GeekColumnContent geekColumnDirectory) {
        GeekColumnContentExample example = new GeekColumnContentExample();
        example.createCriteria()
                .andColumnSkuEqualTo(geekColumnDirectory.getColumnSku())
                .andDirectoryIdEqualTo(geekColumnDirectory.getDirectoryId());
        List<GeekColumnContent> contentList = geekColumnContentMapper.selectByExample(example);
        if (CollectionUtil.isNotEmpty(contentList)) {
            return contentList.get(0);
        }
        return null;
    }

    public GeekColumnContent selectBLOBsByColumnSkuAndDirectoryId(GeekColumnContent geekColumnDirectory) {
        GeekColumnContentExample example = new GeekColumnContentExample();
        example.createCriteria()
                .andColumnSkuEqualTo(geekColumnDirectory.getColumnSku())
                .andDirectoryIdEqualTo(geekColumnDirectory.getDirectoryId());
        List<GeekColumnContent> contentList = geekColumnContentMapper.selectByExampleWithBLOBs(example);
        if (CollectionUtil.isNotEmpty(contentList)) {
            return contentList.get(0);
        }
        return null;
    }
}
