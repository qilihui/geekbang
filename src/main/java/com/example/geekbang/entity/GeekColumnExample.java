package com.example.geekbang.entity;

import java.util.ArrayList;
import java.util.List;

public class GeekColumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GeekColumnExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("subtitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("subtitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("subtitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("subtitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("subtitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("subtitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("subtitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("subtitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("subtitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("subtitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("subtitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("subtitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("subtitle not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCurrCountIsNull() {
            addCriterion("curr_count is null");
            return (Criteria) this;
        }

        public Criteria andCurrCountIsNotNull() {
            addCriterion("curr_count is not null");
            return (Criteria) this;
        }

        public Criteria andCurrCountEqualTo(Integer value) {
            addCriterion("curr_count =", value, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountNotEqualTo(Integer value) {
            addCriterion("curr_count <>", value, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountGreaterThan(Integer value) {
            addCriterion("curr_count >", value, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("curr_count >=", value, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountLessThan(Integer value) {
            addCriterion("curr_count <", value, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountLessThanOrEqualTo(Integer value) {
            addCriterion("curr_count <=", value, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountIn(List<Integer> values) {
            addCriterion("curr_count in", values, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountNotIn(List<Integer> values) {
            addCriterion("curr_count not in", values, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountBetween(Integer value1, Integer value2) {
            addCriterion("curr_count between", value1, value2, "currCount");
            return (Criteria) this;
        }

        public Criteria andCurrCountNotBetween(Integer value1, Integer value2) {
            addCriterion("curr_count not between", value1, value2, "currCount");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlIsNull() {
            addCriterion("catalog_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlIsNotNull() {
            addCriterion("catalog_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlEqualTo(String value) {
            addCriterion("catalog_pic_url =", value, "catalogPicUrl");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlNotEqualTo(String value) {
            addCriterion("catalog_pic_url <>", value, "catalogPicUrl");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlGreaterThan(String value) {
            addCriterion("catalog_pic_url >", value, "catalogPicUrl");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("catalog_pic_url >=", value, "catalogPicUrl");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlLessThan(String value) {
            addCriterion("catalog_pic_url <", value, "catalogPicUrl");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlLessThanOrEqualTo(String value) {
            addCriterion("catalog_pic_url <=", value, "catalogPicUrl");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlLike(String value) {
            addCriterion("catalog_pic_url like", value, "catalogPicUrl");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlNotLike(String value) {
            addCriterion("catalog_pic_url not like", value, "catalogPicUrl");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlIn(List<String> values) {
            addCriterion("catalog_pic_url in", values, "catalogPicUrl");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlNotIn(List<String> values) {
            addCriterion("catalog_pic_url not in", values, "catalogPicUrl");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlBetween(String value1, String value2) {
            addCriterion("catalog_pic_url between", value1, value2, "catalogPicUrl");
            return (Criteria) this;
        }

        public Criteria andCatalogPicUrlNotBetween(String value1, String value2) {
            addCriterion("catalog_pic_url not between", value1, value2, "catalogPicUrl");
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