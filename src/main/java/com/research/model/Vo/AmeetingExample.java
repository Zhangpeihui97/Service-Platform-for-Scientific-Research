package com.research.model.Vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AmeetingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmeetingExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andParticipantIsNull() {
            addCriterion("paticipant is null");
            return (Criteria) this;
        }

        public Criteria andParticipantIsNotNull() {
            addCriterion("paticipant is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantEqualTo(String value) {
            addCriterion("paticipant =", value, "paticipant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotEqualTo(String value) {
            addCriterion("paticipant <>", value, "paticipant");
            return (Criteria) this;
        }

        public Criteria andPaticipantGreaterThan(String value) {
            addCriterion("paticipant >", value, "paticipant");
            return (Criteria) this;
        }

        public Criteria andParticipantGreaterThanOrEqualTo(String value) {
            addCriterion("paticipant >=", value, "paticipant");
            return (Criteria) this;
        }

        public Criteria andParticipantLessThan(String value) {
            addCriterion("paticipant <", value, "paticipant");
            return (Criteria) this;
        }

        public Criteria andParticipantLessThanOrEqualTo(String value) {
            addCriterion("paticipant <=", value, "paticipant");
            return (Criteria) this;
        }

        public Criteria andParticipantLike(String value) {
            addCriterion("paticipant like", value, "paticipant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotLike(String value) {
            addCriterion("paticipant not like", value, "paticipant");
            return (Criteria) this;
        }

        public Criteria andParticipantIn(List<String> values) {
            addCriterion("paticipant in", values, "paticipant");
            return (Criteria) this;
        }

        public Criteria andPaticipantNotIn(List<String> values) {
            addCriterion("paticipant not in", values, "paticipant");
            return (Criteria) this;
        }

        public Criteria andParticipantBetween(String value1, String value2) {
            addCriterion("paticipant between", value1, value2, "paticipant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotBetween(String value1, String value2) {
            addCriterion("paticipant not between", value1, value2, "paticipant");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTimeFormularIsNull() {
            addCriterion("time_formular is null");
            return (Criteria) this;
        }

        public Criteria andTimeFormularIsNotNull() {
            addCriterion("time_formular is not null");
            return (Criteria) this;
        }

        public Criteria andTimeFormularEqualTo(String value) {
            addCriterion("time_formular =", value, "timeFormular");
            return (Criteria) this;
        }

        public Criteria andTimeFormularNotEqualTo(String value) {
            addCriterion("time_formular <>", value, "timeFormular");
            return (Criteria) this;
        }

        public Criteria andTimeFormularGreaterThan(String value) {
            addCriterion("time_formular >", value, "timeFormular");
            return (Criteria) this;
        }

        public Criteria andTimeFormularGreaterThanOrEqualTo(String value) {
            addCriterion("time_formular >=", value, "timeFormular");
            return (Criteria) this;
        }

        public Criteria andTimeFormularLessThan(String value) {
            addCriterion("time_formular <", value, "timeFormular");
            return (Criteria) this;
        }

        public Criteria andTimeFormularLessThanOrEqualTo(String value) {
            addCriterion("time_formular <=", value, "timeFormular");
            return (Criteria) this;
        }

        public Criteria andTimeFormularLike(String value) {
            addCriterion("time_formular like", value, "timeFormular");
            return (Criteria) this;
        }

        public Criteria andTimeFormularNotLike(String value) {
            addCriterion("time_formular not like", value, "timeFormular");
            return (Criteria) this;
        }

        public Criteria andTimeFormularIn(List<String> values) {
            addCriterion("time_formular in", values, "timeFormular");
            return (Criteria) this;
        }

        public Criteria andTimeFormularNotIn(List<String> values) {
            addCriterion("time_formular not in", values, "timeFormular");
            return (Criteria) this;
        }

        public Criteria andTimeFormularBetween(String value1, String value2) {
            addCriterion("time_formular between", value1, value2, "timeFormular");
            return (Criteria) this;
        }

        public Criteria andTimeFormularNotBetween(String value1, String value2) {
            addCriterion("time_formular not between", value1, value2, "timeFormular");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTimeSIsNull() {
            addCriterion("time_s is null");
            return (Criteria) this;
        }

        public Criteria andTimeSIsNotNull() {
            addCriterion("time_s is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSEqualTo(Date value) {
            addCriterionForJDBCDate("time_s =", value, "timeS");
            return (Criteria) this;
        }

        public Criteria andTimeSNotEqualTo(Date value) {
            addCriterionForJDBCDate("time_s <>", value, "timeS");
            return (Criteria) this;
        }

        public Criteria andTimeSGreaterThan(Date value) {
            addCriterionForJDBCDate("time_s >", value, "timeS");
            return (Criteria) this;
        }

        public Criteria andTimeSGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_s >=", value, "timeS");
            return (Criteria) this;
        }

        public Criteria andTimeSLessThan(Date value) {
            addCriterionForJDBCDate("time_s <", value, "timeS");
            return (Criteria) this;
        }

        public Criteria andTimeSLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_s <=", value, "timeS");
            return (Criteria) this;
        }

        public Criteria andTimeSIn(List<Date> values) {
            addCriterionForJDBCDate("time_s in", values, "timeS");
            return (Criteria) this;
        }

        public Criteria andTimeSNotIn(List<Date> values) {
            addCriterionForJDBCDate("time_s not in", values, "timeS");
            return (Criteria) this;
        }

        public Criteria andTimeSBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_s between", value1, value2, "timeS");
            return (Criteria) this;
        }

        public Criteria andTimeSNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_s not between", value1, value2, "timeS");
            return (Criteria) this;
        }

        public Criteria andTimeEIsNull() {
            addCriterion("time_e is null");
            return (Criteria) this;
        }

        public Criteria andTimeEIsNotNull() {
            addCriterion("time_e is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEEqualTo(Date value) {
            addCriterionForJDBCDate("time_e =", value, "timeE");
            return (Criteria) this;
        }

        public Criteria andTimeENotEqualTo(Date value) {
            addCriterionForJDBCDate("time_e <>", value, "timeE");
            return (Criteria) this;
        }

        public Criteria andTimeEGreaterThan(Date value) {
            addCriterionForJDBCDate("time_e >", value, "timeE");
            return (Criteria) this;
        }

        public Criteria andTimeEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_e >=", value, "timeE");
            return (Criteria) this;
        }

        public Criteria andTimeELessThan(Date value) {
            addCriterionForJDBCDate("time_e <", value, "timeE");
            return (Criteria) this;
        }

        public Criteria andTimeELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_e <=", value, "timeE");
            return (Criteria) this;
        }

        public Criteria andTimeEIn(List<Date> values) {
            addCriterionForJDBCDate("time_e in", values, "timeE");
            return (Criteria) this;
        }

        public Criteria andTimeENotIn(List<Date> values) {
            addCriterionForJDBCDate("time_e not in", values, "timeE");
            return (Criteria) this;
        }

        public Criteria andTimeEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_e between", value1, value2, "timeE");
            return (Criteria) this;
        }

        public Criteria andTimeENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_e not between", value1, value2, "timeE");
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