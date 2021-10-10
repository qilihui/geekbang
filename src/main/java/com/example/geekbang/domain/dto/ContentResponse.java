package com.example.geekbang.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author qilihui
 * @date 2021/10/10 1:15 上午
 */
@NoArgsConstructor
@Data
public class ContentResponse {

    private List<?> error;
    private List<?> extra;
    private Data data;
    private Integer code;

    @NoArgsConstructor
    @lombok.Data
    public static class Data {
        private String sku;
        private String authorName;
        private String articleCover;
        private String audioUrl;
        private String chapterId;
        private String audioDubber;
        private String audioTime;
        private String articleContent;
        private Integer productId;
        private String articleSubtitle;
        private String audioDownloadUrl;
        private Integer id;
        private String articleTitle;
        private String articleSharetitle;
        private String articleSummary;
    }
}
