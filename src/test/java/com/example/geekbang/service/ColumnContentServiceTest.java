package com.example.geekbang.service;

import com.example.geekbang.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author qilihui
 * @date 2021/10/10 2:17 上午
 */
class ColumnContentServiceTest extends BaseTest {
    @Autowired
    private ColumnContentService columnContentService;

    @Test
    void processAll() {
        columnContentService.processAll();
    }
}