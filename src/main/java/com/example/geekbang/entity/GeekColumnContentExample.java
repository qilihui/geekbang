package com.example.geekbang.entity;

import java.util.ArrayList;
import java.util.List;

public class GeekColumnContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GeekColumnContentExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andColumnSkuIsNull() {
            addCriterion("column_sku is null");
            return (Criteria) this;
        }

        public Criteria andColumnSkuIsNotNull() {
            addCriterion("column_sku is not null");
            return (Criteria) this;
        }

        public Criteria andColumnSkuEqualTo(Integer value) {
            addCriterion("column_sku =", value, "columnSku");
            return (Criteria) this;
        }

        public Criteria andColumnSkuNotEqualTo(Integer value) {
            addCriterion("column_sku <>", value, "columnSku");
            return (Criteria) this;
        }

        public Criteria andColumnSkuGreaterThan(Integer value) {
            addCriterion("column_sku >", value, "columnSku");
            return (Criteria) this;
        }

        public Criteria andColumnSkuGreaterThanOrEqualTo(Integer value) {
            addCriterion("column_sku >=", value, "columnSku");
            return (Criteria) this;
        }

        public Criteria andColumnSkuLessThan(Integer value) {
            addCriterion("column_sku <", value, "columnSku");
            return (Criteria) this;
        }

        public Criteria andColumnSkuLessThanOrEqualTo(Integer value) {
            addCriterion("column_sku <=", value, "columnSku");
            return (Criteria) this;
        }

        public Criteria andColumnSkuIn(List<Integer> values) {
            addCriterion("column_sku in", values, "columnSku");
            return (Criteria) this;
        }

        public Criteria andColumnSkuNotIn(List<Integer> values) {
            addCriterion("column_sku not in", values, "columnSku");
            return (Criteria) this;
        }

        public Criteria andColumnSkuBetween(Integer value1, Integer value2) {
            addCriterion("column_sku between", value1, value2, "columnSku");
            return (Criteria) this;
        }

        public Criteria andColumnSkuNotBetween(Integer value1, Integer value2) {
            addCriterion("column_sku not between", value1, value2, "columnSku");
            return (Criteria) this;
        }

        public Criteria andDirectoryIdIsNull() {
            addCriterion("directory_id is null");
            return (Criteria) this;
        }

        public Criteria andDirectoryIdIsNotNull() {
            addCriterion("directory_id is not null");
            return (Criteria) this;
        }

        public Criteria andDirectoryIdEqualTo(Integer value) {
            addCriterion("directory_id =", value, "directoryId");
            return (Criteria) this;
        }

        public Criteria andDirectoryIdNotEqualTo(Integer value) {
            addCriterion("directory_id <>", value, "directoryId");
            return (Criteria) this;
        }

        public Criteria andDirectoryIdGreaterThan(Integer value) {
            addCriterion("directory_id >", value, "directoryId");
            return (Criteria) this;
        }

        public Criteria andDirectoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("directory_id >=", value, "directoryId");
            return (Criteria) this;
        }

        public Criteria andDirectoryIdLessThan(Integer value) {
            addCriterion("directory_id <", value, "directoryId");
            return (Criteria) this;
        }

        public Criteria andDirectoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("directory_id <=", value, "directoryId");
            return (Criteria) this;
        }

        public Criteria andDirectoryIdIn(List<Integer> values) {
            addCriterion("directory_id in", values, "directoryId");
            return (Criteria) this;
        }

        public Criteria andDirectoryIdNotIn(List<Integer> values) {
            addCriterion("directory_id not in", values, "directoryId");
            return (Criteria) this;
        }

        public Criteria andDirectoryIdBetween(Integer value1, Integer value2) {
            addCriterion("directory_id between", value1, value2, "directoryId");
            return (Criteria) this;
        }

        public Criteria andDirectoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("directory_id not between", value1, value2, "directoryId");
            return (Criteria) this;
        }

        public Criteria andAudioUrlIsNull() {
            addCriterion("audio_url is null");
            return (Criteria) this;
        }

        public Criteria andAudioUrlIsNotNull() {
            addCriterion("audio_url is not null");
            return (Criteria) this;
        }

        public Criteria andAudioUrlEqualTo(String value) {
            addCriterion("audio_url =", value, "audioUrl");
            return (Criteria) this;
        }

        public Criteria andAudioUrlNotEqualTo(String value) {
            addCriterion("audio_url <>", value, "audioUrl");
            return (Criteria) this;
        }

        public Criteria andAudioUrlGreaterThan(String value) {
            addCriterion("audio_url >", value, "audioUrl");
            return (Criteria) this;
        }

        public Criteria andAudioUrlGreaterThanOrEqualTo(String value) {
            addCriterion("audio_url >=", value, "audioUrl");
            return (Criteria) this;
        }

        public Criteria andAudioUrlLessThan(String value) {
            addCriterion("audio_url <", value, "audioUrl");
            return (Criteria) this;
        }

        public Criteria andAudioUrlLessThanOrEqualTo(String value) {
            addCriterion("audio_url <=", value, "audioUrl");
            return (Criteria) this;
        }

        public Criteria andAudioUrlLike(String value) {
            addCriterion("audio_url like", value, "audioUrl");
            return (Criteria) this;
        }

        public Criteria andAudioUrlNotLike(String value) {
            addCriterion("audio_url not like", value, "audioUrl");
            return (Criteria) this;
        }

        public Criteria andAudioUrlIn(List<String> values) {
            addCriterion("audio_url in", values, "audioUrl");
            return (Criteria) this;
        }

        public Criteria andAudioUrlNotIn(List<String> values) {
            addCriterion("audio_url not in", values, "audioUrl");
            return (Criteria) this;
        }

        public Criteria andAudioUrlBetween(String value1, String value2) {
            addCriterion("audio_url between", value1, value2, "audioUrl");
            return (Criteria) this;
        }

        public Criteria andAudioUrlNotBetween(String value1, String value2) {
            addCriterion("audio_url not between", value1, value2, "audioUrl");
            return (Criteria) this;
        }

        public Criteria andAudioTitleIsNull() {
            addCriterion("audio_title is null");
            return (Criteria) this;
        }

        public Criteria andAudioTitleIsNotNull() {
            addCriterion("audio_title is not null");
            return (Criteria) this;
        }

        public Criteria andAudioTitleEqualTo(String value) {
            addCriterion("audio_title =", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleNotEqualTo(String value) {
            addCriterion("audio_title <>", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleGreaterThan(String value) {
            addCriterion("audio_title >", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleGreaterThanOrEqualTo(String value) {
            addCriterion("audio_title >=", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleLessThan(String value) {
            addCriterion("audio_title <", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleLessThanOrEqualTo(String value) {
            addCriterion("audio_title <=", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleLike(String value) {
            addCriterion("audio_title like", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleNotLike(String value) {
            addCriterion("audio_title not like", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleIn(List<String> values) {
            addCriterion("audio_title in", values, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleNotIn(List<String> values) {
            addCriterion("audio_title not in", values, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleBetween(String value1, String value2) {
            addCriterion("audio_title between", value1, value2, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleNotBetween(String value1, String value2) {
            addCriterion("audio_title not between", value1, value2, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTimeIsNull() {
            addCriterion("audio_time is null");
            return (Criteria) this;
        }

        public Criteria andAudioTimeIsNotNull() {
            addCriterion("audio_time is not null");
            return (Criteria) this;
        }

        public Criteria andAudioTimeEqualTo(String value) {
            addCriterion("audio_time =", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeNotEqualTo(String value) {
            addCriterion("audio_time <>", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeGreaterThan(String value) {
            addCriterion("audio_time >", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeGreaterThanOrEqualTo(String value) {
            addCriterion("audio_time >=", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeLessThan(String value) {
            addCriterion("audio_time <", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeLessThanOrEqualTo(String value) {
            addCriterion("audio_time <=", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeLike(String value) {
            addCriterion("audio_time like", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeNotLike(String value) {
            addCriterion("audio_time not like", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeIn(List<String> values) {
            addCriterion("audio_time in", values, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeNotIn(List<String> values) {
            addCriterion("audio_time not in", values, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeBetween(String value1, String value2) {
            addCriterion("audio_time between", value1, value2, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeNotBetween(String value1, String value2) {
            addCriterion("audio_time not between", value1, value2, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlIsNull() {
            addCriterion("audio_download_url is null");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlIsNotNull() {
            addCriterion("audio_download_url is not null");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlEqualTo(String value) {
            addCriterion("audio_download_url =", value, "audioDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlNotEqualTo(String value) {
            addCriterion("audio_download_url <>", value, "audioDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlGreaterThan(String value) {
            addCriterion("audio_download_url >", value, "audioDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("audio_download_url >=", value, "audioDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlLessThan(String value) {
            addCriterion("audio_download_url <", value, "audioDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlLessThanOrEqualTo(String value) {
            addCriterion("audio_download_url <=", value, "audioDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlLike(String value) {
            addCriterion("audio_download_url like", value, "audioDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlNotLike(String value) {
            addCriterion("audio_download_url not like", value, "audioDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlIn(List<String> values) {
            addCriterion("audio_download_url in", values, "audioDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlNotIn(List<String> values) {
            addCriterion("audio_download_url not in", values, "audioDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlBetween(String value1, String value2) {
            addCriterion("audio_download_url between", value1, value2, "audioDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andAudioDownloadUrlNotBetween(String value1, String value2) {
            addCriterion("audio_download_url not between", value1, value2, "audioDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andChapterIdIsNull() {
            addCriterion("chapter_id is null");
            return (Criteria) this;
        }

        public Criteria andChapterIdIsNotNull() {
            addCriterion("chapter_id is not null");
            return (Criteria) this;
        }

        public Criteria andChapterIdEqualTo(Integer value) {
            addCriterion("chapter_id =", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotEqualTo(Integer value) {
            addCriterion("chapter_id <>", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThan(Integer value) {
            addCriterion("chapter_id >", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapter_id >=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThan(Integer value) {
            addCriterion("chapter_id <", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThanOrEqualTo(Integer value) {
            addCriterion("chapter_id <=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdIn(List<Integer> values) {
            addCriterion("chapter_id in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotIn(List<Integer> values) {
            addCriterion("chapter_id not in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdBetween(Integer value1, Integer value2) {
            addCriterion("chapter_id between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chapter_id not between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleIsNull() {
            addCriterion("article_sharetitle is null");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleIsNotNull() {
            addCriterion("article_sharetitle is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleEqualTo(String value) {
            addCriterion("article_sharetitle =", value, "articleSharetitle");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleNotEqualTo(String value) {
            addCriterion("article_sharetitle <>", value, "articleSharetitle");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleGreaterThan(String value) {
            addCriterion("article_sharetitle >", value, "articleSharetitle");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_sharetitle >=", value, "articleSharetitle");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleLessThan(String value) {
            addCriterion("article_sharetitle <", value, "articleSharetitle");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleLessThanOrEqualTo(String value) {
            addCriterion("article_sharetitle <=", value, "articleSharetitle");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleLike(String value) {
            addCriterion("article_sharetitle like", value, "articleSharetitle");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleNotLike(String value) {
            addCriterion("article_sharetitle not like", value, "articleSharetitle");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleIn(List<String> values) {
            addCriterion("article_sharetitle in", values, "articleSharetitle");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleNotIn(List<String> values) {
            addCriterion("article_sharetitle not in", values, "articleSharetitle");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleBetween(String value1, String value2) {
            addCriterion("article_sharetitle between", value1, value2, "articleSharetitle");
            return (Criteria) this;
        }

        public Criteria andArticleSharetitleNotBetween(String value1, String value2) {
            addCriterion("article_sharetitle not between", value1, value2, "articleSharetitle");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}