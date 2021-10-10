package com.example.geekbang.service;

import com.example.geekbang.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author qilihui
 * @date 2021/10/9 8:51 下午
 */
class ColumnServiceTest extends BaseTest {

    @Autowired
    private ColumnService columnService;

    @Test
    void processAll() {
        columnService.processAll();
    }
}