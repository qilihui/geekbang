package com.example.geekbang.controller;

import com.example.geekbang.entity.GeekColumn;
import com.example.geekbang.entity.GeekColumnContent;
import com.example.geekbang.entity.GeekColumnDirectory;
import com.example.geekbang.service.ColumnContentService;
import com.example.geekbang.service.ColumnDirectoryService;
import com.example.geekbang.service.ColumnService;
import com.example.geekbang.tool.Result;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qilihui
 * @date 2021/11/11 7:46 下午
 */
@RestController
@AllArgsConstructor(onConstructor_ = @Autowired)
@RequestMapping("/api/column")
public class ApiController {
    private final ColumnService columnService;
    private final ColumnDirectoryService columnDirectoryService;
    private final ColumnContentService columnContentService;

    @RequestMapping("/all")
    public Result getAllColumn() {
        List<GeekColumn> columnList = columnService.getAllColumn();
        return Result.success(columnList);
    }

    @RequestMapping("/{sku}")
    public Result getDirBySku(@PathVariable("sku") Integer sku) {
        List<GeekColumnDirectory> directoryList = columnDirectoryService.getBySku(sku);
        return Result.success(directoryList);
    }

    @RequestMapping("/{sku}/{dir}")
    public Result getDirBySku(@PathVariable("sku") Integer sku, @PathVariable("dir") Integer dir) {
        GeekColumnContent content = columnContentService.getBySkuAndDir(sku, dir);
        return Result.success(content);
    }
}
