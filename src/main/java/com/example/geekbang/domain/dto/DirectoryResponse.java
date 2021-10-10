package com.example.geekbang.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author qilihui
 * @date 2021/10/10 12:54 上午
 */
@NoArgsConstructor
@Data
public class DirectoryResponse {

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
            private Boolean more;
        }

        @NoArgsConstructor
        @lombok.Data
        public static class List {
            private String chapterId;
            private String articleSubtitle;
            private String audioDownloadUrl;
            private Integer id;
            private String articleCover;
            private String articleTitle;
            private Boolean includeAudio;
            private java.util.List<?> subtitles;
            private Boolean hadFreelyread;
            private Boolean isVideoPreview;
            private String articleSummary;
            private Boolean columnHadSub;
            private String audioDubber;
            private String columnCover;
            private String articleSharetitle;
            private Integer columnId;
            private String audioMd5;
            private String audioTime;
            private String audioTitle;
            private Boolean articleCouldPreview;
            private AudioTimeArr audioTimeArr;
            private Integer audioSize;
            private Integer columnSku;
            private String authorIntro;
            private Offline offline;
            private String audioUrl;
            private Boolean isRequired;
            private String columnBgcolor;
            private Long score;
            private Integer articleCtime;
            private String authorName;

            @NoArgsConstructor
            @lombok.Data
            public static class AudioTimeArr {
                private String m;
                private String s;
                private String h;
            }

            @NoArgsConstructor
            @lombok.Data
            public static class Offline {
                private String fileName;
                private String downloadUrl;
            }
        }
    }
}
