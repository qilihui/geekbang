package com.example.geekbang.entity;

public class GeekColumnDirectory {
    private Long id;

    private Integer columnSku;

    private Integer chapterId;

    private Integer directoryId;

    private String articleTitle;

    private String articleSummary;

    private String audioTime;

    private String audioTitle;

    private String audioUrl;

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

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(Integer directoryId) {
        this.directoryId = directoryId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary == null ? null : articleSummary.trim();
    }

    public String getAudioTime() {
        return audioTime;
    }

    public void setAudioTime(String audioTime) {
        this.audioTime = audioTime == null ? null : audioTime.trim();
    }

    public String getAudioTitle() {
        return audioTitle;
    }

    public void setAudioTitle(String audioTitle) {
        this.audioTitle = audioTitle == null ? null : audioTitle.trim();
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl == null ? null : audioUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", columnSku=").append(columnSku);
        sb.append(", chapterId=").append(chapterId);
        sb.append(", directoryId=").append(directoryId);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", articleSummary=").append(articleSummary);
        sb.append(", audioTime=").append(audioTime);
        sb.append(", audioTitle=").append(audioTitle);
        sb.append(", audioUrl=").append(audioUrl);
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
        GeekColumnDirectory other = (GeekColumnDirectory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getColumnSku() == null ? other.getColumnSku() == null : this.getColumnSku().equals(other.getColumnSku()))
            && (this.getChapterId() == null ? other.getChapterId() == null : this.getChapterId().equals(other.getChapterId()))
            && (this.getDirectoryId() == null ? other.getDirectoryId() == null : this.getDirectoryId().equals(other.getDirectoryId()))
            && (this.getArticleTitle() == null ? other.getArticleTitle() == null : this.getArticleTitle().equals(other.getArticleTitle()))
            && (this.getArticleSummary() == null ? other.getArticleSummary() == null : this.getArticleSummary().equals(other.getArticleSummary()))
            && (this.getAudioTime() == null ? other.getAudioTime() == null : this.getAudioTime().equals(other.getAudioTime()))
            && (this.getAudioTitle() == null ? other.getAudioTitle() == null : this.getAudioTitle().equals(other.getAudioTitle()))
            && (this.getAudioUrl() == null ? other.getAudioUrl() == null : this.getAudioUrl().equals(other.getAudioUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getColumnSku() == null) ? 0 : getColumnSku().hashCode());
        result = prime * result + ((getChapterId() == null) ? 0 : getChapterId().hashCode());
        result = prime * result + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        result = prime * result + ((getArticleTitle() == null) ? 0 : getArticleTitle().hashCode());
        result = prime * result + ((getArticleSummary() == null) ? 0 : getArticleSummary().hashCode());
        result = prime * result + ((getAudioTime() == null) ? 0 : getAudioTime().hashCode());
        result = prime * result + ((getAudioTitle() == null) ? 0 : getAudioTitle().hashCode());
        result = prime * result + ((getAudioUrl() == null) ? 0 : getAudioUrl().hashCode());
        return result;
    }
}