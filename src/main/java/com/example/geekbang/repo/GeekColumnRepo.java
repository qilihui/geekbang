package com.example.geekbang.repo;

import cn.hutool.core.collection.CollectionUtil;
import com.example.geekbang.entity.GeekColumn;
import com.example.geekbang.entity.GeekColumnExample;
import com.example.geekbang.mapper.GeekColumnMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qilihui
 * @date 2021/10/9 7:11 下午
 */
@Repository
@AllArgsConstructor(onConstructor_ = @Autowired)
public class GeekColumnRepo {
    private final GeekColumnMapper geekColumnMapper;

    public int insert(GeekColumn geekColumn) {
        return geekColumnMapper.insert(geekColumn);
    }

    public int updateByColumnSkuSelective(GeekColumn geekColumn) {
        GeekColumnExample example = new GeekColumnExample();
        example.createCriteria().andColumnSkuEqualTo(geekColumn.getColumnSku());
        return geekColumnMapper.updateByExampleSelective(geekColumn, example);
    }

    public int updateByPrimaryKeySelective(GeekColumn geekColumn) {
        return geekColumnMapper.updateByPrimaryKeySelective(geekColumn);
    }

    public GeekColumn selectByColumnSku(Integer columnSku) {
        GeekColumnExample example = new GeekColumnExample();
        example.createCriteria().andColumnSkuEqualTo(columnSku);
        List<GeekColumn> geekColumns = geekColumnMapper.selectByExample(example);
        if (CollectionUtil.isNotEmpty(geekColumns)) {
            return geekColumns.get(0);
        }
        return null;
    }

    public List<GeekColumn> selectAll() {
        GeekColumnExample example = new GeekColumnExample();
        return geekColumnMapper.selectByExample(example);
    }
}
