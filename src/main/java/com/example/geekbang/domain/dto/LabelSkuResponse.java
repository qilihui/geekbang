package com.example.geekbang.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qilihui
 * @date 2021/10/9 8:13 下午
 */
@NoArgsConstructor
@Data
public class LabelSkuResponse {

    private Integer code;
    private Data data;

    @NoArgsConstructor
    @lombok.Data
    public static class Data {
        private Integer id;
        private String title;
        private String subtitle;
        private Article article;
        private Column column;

        @NoArgsConstructor
        @lombok.Data
        public static class Article {
            private Integer id;
            private Integer count;
            private Integer countReq;
            private Integer countPub;
        }

        @NoArgsConstructor
        @lombok.Data
        public static class Column {
            private String catalogPicUrl;
        }
    }
}
