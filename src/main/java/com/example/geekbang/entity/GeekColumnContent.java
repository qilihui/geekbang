package com.example.geekbang.entity;

public class GeekColumnContent {
    private Long id;

    private Integer columnSku;

    private Integer directoryId;

    private String audioUrl;

    private String audioTitle;

    private String audioTime;

    private String audioDownloadUrl;

    private Integer chapterId;

    private String articleTitle;

    private String articleSharetitle;

    private String articleContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getColumnSku() {
        return columnSku;
    }

    public void setColumnSku(Integer columnSku) {
        this.columnSku = columnSku;
    }

    public Integer getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(Integer directoryId) {
        this.directoryId = directoryId;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl == null ? null : audioUrl.trim();
    }

    public String getAudioTitle() {
        return audioTitle;
    }

    public void setAudioTitle(String audioTitle) {
        this.audioTitle = audioTitle == null ? null : audioTitle.trim();
    }

    public String getAudioTime() {
        return audioTime;
    }

    public void setAudioTime(String audioTime) {
        this.audioTime = audioTime == null ? null : audioTime.trim();
    }

    public String getAudioDownloadUrl() {
        return audioDownloadUrl;
    }

    public void setAudioDownloadUrl(String audioDownloadUrl) {
        this.audioDownloadUrl = audioDownloadUrl == null ? null : audioDownloadUrl.trim();
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleSharetitle() {
        return articleSharetitle;
    }

    public void setArticleSharetitle(String articleSharetitle) {
        this.articleSharetitle = articleSharetitle == null ? null : articleSharetitle.trim();
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", columnSku=").append(columnSku);
        sb.append(", directoryId=").append(directoryId);
        sb.append(", audioUrl=").append(audioUrl);
        sb.append(", audioTitle=").append(audioTitle);
        sb.append(", audioTime=").append(audioTime);
        sb.append(", audioDownloadUrl=").append(audioDownloadUrl);
        sb.append(", chapterId=").append(chapterId);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", articleSharetitle=").append(articleSharetitle);
        sb.append(", articleContent=").append(articleContent);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GeekColumnContent other = (GeekColumnContent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getColumnSku() == null ? other.getColumnSku() == null : this.getColumnSku().equals(other.getColumnSku()))
            && (this.getDirectoryId() == null ? other.getDirectoryId() == null : this.getDirectoryId().equals(other.getDirectoryId()))
            && (this.getAudioUrl() == null ? other.getAudioUrl() == null : this.getAudioUrl().equals(other.getAudioUrl()))
            && (this.getAudioTitle() == null ? other.getAudioTitle() == null : this.getAudioTitle().equals(other.getAudioTitle()))
            && (this.getAudioTime() == null ? other.getAudioTime() == null : this.getAudioTime().equals(other.getAudioTime()))
            && (this.getAudioDownloadUrl() == null ? other.getAudioDownloadUrl() == null : this.getAudioDownloadUrl().equals(other.getAudioDownloadUrl()))
            && (this.getChapterId() == null ? other.getChapterId() == null : this.getChapterId().equals(other.getChapterId()))
            && (this.getArticleTitle() == null ? other.getArticleTitle() == null : this.getArticleTitle().equals(other.getArticleTitle()))
            && (this.getArticleSharetitle() == null ? other.getArticleSharetitle() == null : this.getArticleSharetitle().equals(other.getArticleSharetitle()))
            && (this.getArticleContent() == null ? other.getArticleContent() == null : this.getArticleContent().equals(other.getArticleContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getColumnSku() == null) ? 0 : getColumnSku().hashCode());
        result = prime * result + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        result = prime * result + ((getAudioUrl() == null) ? 0 : getAudioUrl().hashCode());
        result = prime * result + ((getAudioTitle() == null) ? 0 : getAudioTitle().hashCode());
        result = prime * result + ((getAudioTime() == null) ? 0 : getAudioTime().hashCode());
        result = prime * result + ((getAudioDownloadUrl() == null) ? 0 : getAudioDownloadUrl().hashCode());
        result = prime * result + ((getChapterId() == null) ? 0 : getChapterId().hashCode());
        result = prime * result + ((getArticleTitle() == null) ? 0 : getArticleTitle().hashCode());
        result = prime * result + ((getArticleSharetitle() == null) ? 0 : getArticleSharetitle().hashCode());
        result = prime * result + ((getArticleContent() == null) ? 0 : getArticleContent().hashCode());
        return result;
    }
}