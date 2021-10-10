package com.example.geekbang.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author qilihui
 * @date 2021/10/9 6:37 下午
 */
@NoArgsConstructor
@Data
public class LabelSku {

    private List<?> error;
    private List<?> extra;
    private Data data;
    private Integer code;

    @NoArgsConstructor
    @lombok.Data
    public static class Data {
        private java.util.List<List> list;
        private Page page;

        @NoArgsConstructor
        @lombok.Data
        public static class Page {
            private Integer count;
        }

        @NoArgsConstructor
        @lombok.Data
        public static class List {
            private Integer subCount;
            private Boolean isVip;
            private Integer columnType;
            private Integer id;
            private Integer columnPriceMarket;
            private Integer columnPriceFirst;
            private Integer topLevel;
            private Integer lastAid;
            private Boolean hadSub;
            private Integer priceType;
            private Boolean isExperience;
            private Integer columnCtime;
            private Integer columnSku;
            private Integer columnGroupbuy;
            private Integer columnPrice;
            private Integer isChannel;
            private Integer lastChapterId;
            private Boolean isRealSub;
        }
    }
}
