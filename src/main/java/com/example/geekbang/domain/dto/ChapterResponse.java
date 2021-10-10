package com.example.geekbang.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author qilihui
 * @date 2021/10/9 23:14
 */
@NoArgsConstructor
@Data
public class ChapterResponse {

    private List<?> error;
    private List<?> extra;
    private List<DataDTO> data;
    private Integer code;

    @NoArgsConstructor
    @Data
    public static class DataDTO {
        private Integer sourceId;
        private String title;
        private Integer articleCount;
        private String id;
    }
}
