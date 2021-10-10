package com.example.geekbang.service;

import com.example.geekbang.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author qilihui
 * @date 2021/10/10 1:03 上午
 */
class ColumnDirectoryServiceTest extends BaseTest {

    @Autowired
    private ColumnDirectoryService columnDirectoryService;

    @Test
    void processAll() {
        columnDirectoryService.processAll();
    }
}