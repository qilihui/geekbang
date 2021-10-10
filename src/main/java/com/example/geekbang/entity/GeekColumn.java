package com.example.geekbang.entity;

public class GeekColumn {
    private Long id;

    private Integer columnSku;

    private String title;

    private String subtitle;

    private Integer count;

    private Integer currCount;

    private String catalogPicUrl;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCurrCount() {
        return currCount;
    }

    public void setCurrCount(Integer currCount) {
        this.currCount = currCount;
    }

    public String getCatalogPicUrl() {
        return catalogPicUrl;
    }

    public void setCatalogPicUrl(String catalogPicUrl) {
        this.catalogPicUrl = catalogPicUrl == null ? null : catalogPicUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", columnSku=").append(columnSku);
        sb.append(", title=").append(title);
        sb.append(", subtitle=").append(subtitle);
        sb.append(", count=").append(count);
        sb.append(", currCount=").append(currCount);
        sb.append(", catalogPicUrl=").append(catalogPicUrl);
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
        GeekColumn other = (GeekColumn) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getColumnSku() == null ? other.getColumnSku() == null : this.getColumnSku().equals(other.getColumnSku()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSubtitle() == null ? other.getSubtitle() == null : this.getSubtitle().equals(other.getSubtitle()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getCurrCount() == null ? other.getCurrCount() == null : this.getCurrCount().equals(other.getCurrCount()))
            && (this.getCatalogPicUrl() == null ? other.getCatalogPicUrl() == null : this.getCatalogPicUrl().equals(other.getCatalogPicUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getColumnSku() == null) ? 0 : getColumnSku().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getCurrCount() == null) ? 0 : getCurrCount().hashCode());
        result = prime * result + ((getCatalogPicUrl() == null) ? 0 : getCatalogPicUrl().hashCode());
        return result;
    }
}