package com.example.geekbang.service;

import com.example.geekbang.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author qilihui
 * @date 2021/10/9 11:51 下午
 */
class ColumnChapterServiceTest extends BaseTest {
    @Autowired
    private ColumnChapterService columnChapterService;

    @Test
    void processAll() {
        columnChapterService.processAll();
    }
}