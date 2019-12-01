package org.zsy.alertsystem.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExMessageExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNull() {
            addCriterion("system_id is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("system_id is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(Long value) {
            addCriterion("system_id =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(Long value) {
            addCriterion("system_id <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(Long value) {
            addCriterion("system_id >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("system_id >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(Long value) {
            addCriterion("system_id <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(Long value) {
            addCriterion("system_id <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<Long> values) {
            addCriterion("system_id in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<Long> values) {
            addCriterion("system_id not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(Long value1, Long value2) {
            addCriterion("system_id between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(Long value1, Long value2) {
            addCriterion("system_id not between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andRankIdIsNull() {
            addCriterion("rank_id is null");
            return (Criteria) this;
        }

        public Criteria andRankIdIsNotNull() {
            addCriterion("rank_id is not null");
            return (Criteria) this;
        }

        public Criteria andRankIdEqualTo(Integer value) {
            addCriterion("rank_id =", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotEqualTo(Integer value) {
            addCriterion("rank_id <>", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdGreaterThan(Integer value) {
            addCriterion("rank_id >", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_id >=", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdLessThan(Integer value) {
            addCriterion("rank_id <", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdLessThanOrEqualTo(Integer value) {
            addCriterion("rank_id <=", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdIn(List<Integer> values) {
            addCriterion("rank_id in", values, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotIn(List<Integer> values) {
            addCriterion("rank_id not in", values, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdBetween(Integer value1, Integer value2) {
            addCriterion("rank_id between", value1, value2, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_id not between", value1, value2, "rankId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andExDescriptionIsNull() {
            addCriterion("ex_description is null");
            return (Criteria) this;
        }

        public Criteria andExDescriptionIsNotNull() {
            addCriterion("ex_description is not null");
            return (Criteria) this;
        }

        public Criteria andExDescriptionEqualTo(String value) {
            addCriterion("ex_description =", value, "exDescription");
            return (Criteria) this;
        }

        public Criteria andExDescriptionNotEqualTo(String value) {
            addCriterion("ex_description <>", value, "exDescription");
            return (Criteria) this;
        }

        public Criteria andExDescriptionGreaterThan(String value) {
            addCriterion("ex_description >", value, "exDescription");
            return (Criteria) this;
        }

        public Criteria andExDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ex_description >=", value, "exDescription");
            return (Criteria) this;
        }

        public Criteria andExDescriptionLessThan(String value) {
            addCriterion("ex_description <", value, "exDescription");
            return (Criteria) this;
        }

        public Criteria andExDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ex_description <=", value, "exDescription");
            return (Criteria) this;
        }

        public Criteria andExDescriptionLike(String value) {
            addCriterion("ex_description like", value, "exDescription");
            return (Criteria) this;
        }

        public Criteria andExDescriptionNotLike(String value) {
            addCriterion("ex_description not like", value, "exDescription");
            return (Criteria) this;
        }

        public Criteria andExDescriptionIn(List<String> values) {
            addCriterion("ex_description in", values, "exDescription");
            return (Criteria) this;
        }

        public Criteria andExDescriptionNotIn(List<String> values) {
            addCriterion("ex_description not in", values, "exDescription");
            return (Criteria) this;
        }

        public Criteria andExDescriptionBetween(String value1, String value2) {
            addCriterion("ex_description between", value1, value2, "exDescription");
            return (Criteria) this;
        }

        public Criteria andExDescriptionNotBetween(String value1, String value2) {
            addCriterion("ex_description not between", value1, value2, "exDescription");
            return (Criteria) this;
        }

        public Criteria andExOccurtimeIsNull() {
            addCriterion("ex_occurtime is null");
            return (Criteria) this;
        }

        public Criteria andExOccurtimeIsNotNull() {
            addCriterion("ex_occurtime is not null");
            return (Criteria) this;
        }

        public Criteria andExOccurtimeEqualTo(Date value) {
            addCriterion("ex_occurtime =", value, "exOccurtime");
            return (Criteria) this;
        }

        public Criteria andExOccurtimeNotEqualTo(Date value) {
            addCriterion("ex_occurtime <>", value, "exOccurtime");
            return (Criteria) this;
        }

        public Criteria andExOccurtimeGreaterThan(Date value) {
            addCriterion("ex_occurtime >", value, "exOccurtime");
            return (Criteria) this;
        }

        public Criteria andExOccurtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ex_occurtime >=", value, "exOccurtime");
            return (Criteria) this;
        }

        public Criteria andExOccurtimeLessThan(Date value) {
            addCriterion("ex_occurtime <", value, "exOccurtime");
            return (Criteria) this;
        }

        public Criteria andExOccurtimeLessThanOrEqualTo(Date value) {
            addCriterion("ex_occurtime <=", value, "exOccurtime");
            return (Criteria) this;
        }

        public Criteria andExOccurtimeIn(List<Date> values) {
            addCriterion("ex_occurtime in", values, "exOccurtime");
            return (Criteria) this;
        }

        public Criteria andExOccurtimeNotIn(List<Date> values) {
            addCriterion("ex_occurtime not in", values, "exOccurtime");
            return (Criteria) this;
        }

        public Criteria andExOccurtimeBetween(Date value1, Date value2) {
            addCriterion("ex_occurtime between", value1, value2, "exOccurtime");
            return (Criteria) this;
        }

        public Criteria andExOccurtimeNotBetween(Date value1, Date value2) {
            addCriterion("ex_occurtime not between", value1, value2, "exOccurtime");
            return (Criteria) this;
        }

        public Criteria andExCreatetimeIsNull() {
            addCriterion("ex_createtime is null");
            return (Criteria) this;
        }

        public Criteria andExCreatetimeIsNotNull() {
            addCriterion("ex_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andExCreatetimeEqualTo(Date value) {
            addCriterion("ex_createtime =", value, "exCreatetime");
            return (Criteria) this;
        }

        public Criteria andExCreatetimeNotEqualTo(Date value) {
            addCriterion("ex_createtime <>", value, "exCreatetime");
            return (Criteria) this;
        }

        public Criteria andExCreatetimeGreaterThan(Date value) {
            addCriterion("ex_createtime >", value, "exCreatetime");
            return (Criteria) this;
        }

        public Criteria andExCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ex_createtime >=", value, "exCreatetime");
            return (Criteria) this;
        }

        public Criteria andExCreatetimeLessThan(Date value) {
            addCriterion("ex_createtime <", value, "exCreatetime");
            return (Criteria) this;
        }

        public Criteria andExCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ex_createtime <=", value, "exCreatetime");
            return (Criteria) this;
        }

        public Criteria andExCreatetimeIn(List<Date> values) {
            addCriterion("ex_createtime in", values, "exCreatetime");
            return (Criteria) this;
        }

        public Criteria andExCreatetimeNotIn(List<Date> values) {
            addCriterion("ex_createtime not in", values, "exCreatetime");
            return (Criteria) this;
        }

        public Criteria andExCreatetimeBetween(Date value1, Date value2) {
            addCriterion("ex_createtime between", value1, value2, "exCreatetime");
            return (Criteria) this;
        }

        public Criteria andExCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ex_createtime not between", value1, value2, "exCreatetime");
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