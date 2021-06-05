package com.woniu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public EmpExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andEmpidIsNull() {
            addCriterion("empid is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("empid is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(Integer value) {
            addCriterion("empid =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(Integer value) {
            addCriterion("empid <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(Integer value) {
            addCriterion("empid >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("empid >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(Integer value) {
            addCriterion("empid <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("empid <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<Integer> values) {
            addCriterion("empid in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<Integer> values) {
            addCriterion("empid not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(Integer value1, Integer value2) {
            addCriterion("empid between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("empid not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("empname is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("empname is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("empname =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("empname <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("empname >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("empname >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("empname <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("empname <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("empname like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("empname not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("empname in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("empname not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("empname between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("empname not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpsexIsNull() {
            addCriterion("empsex is null");
            return (Criteria) this;
        }

        public Criteria andEmpsexIsNotNull() {
            addCriterion("empsex is not null");
            return (Criteria) this;
        }

        public Criteria andEmpsexEqualTo(String value) {
            addCriterion("empsex =", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotEqualTo(String value) {
            addCriterion("empsex <>", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexGreaterThan(String value) {
            addCriterion("empsex >", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexGreaterThanOrEqualTo(String value) {
            addCriterion("empsex >=", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexLessThan(String value) {
            addCriterion("empsex <", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexLessThanOrEqualTo(String value) {
            addCriterion("empsex <=", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexLike(String value) {
            addCriterion("empsex like", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotLike(String value) {
            addCriterion("empsex not like", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexIn(List<String> values) {
            addCriterion("empsex in", values, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotIn(List<String> values) {
            addCriterion("empsex not in", values, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexBetween(String value1, String value2) {
            addCriterion("empsex between", value1, value2, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotBetween(String value1, String value2) {
            addCriterion("empsex not between", value1, value2, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpageIsNull() {
            addCriterion("empage is null");
            return (Criteria) this;
        }

        public Criteria andEmpageIsNotNull() {
            addCriterion("empage is not null");
            return (Criteria) this;
        }

        public Criteria andEmpageEqualTo(Integer value) {
            addCriterion("empage =", value, "empage");
            return (Criteria) this;
        }

        public Criteria andEmpageNotEqualTo(Integer value) {
            addCriterion("empage <>", value, "empage");
            return (Criteria) this;
        }

        public Criteria andEmpageGreaterThan(Integer value) {
            addCriterion("empage >", value, "empage");
            return (Criteria) this;
        }

        public Criteria andEmpageGreaterThanOrEqualTo(Integer value) {
            addCriterion("empage >=", value, "empage");
            return (Criteria) this;
        }

        public Criteria andEmpageLessThan(Integer value) {
            addCriterion("empage <", value, "empage");
            return (Criteria) this;
        }

        public Criteria andEmpageLessThanOrEqualTo(Integer value) {
            addCriterion("empage <=", value, "empage");
            return (Criteria) this;
        }

        public Criteria andEmpageIn(List<Integer> values) {
            addCriterion("empage in", values, "empage");
            return (Criteria) this;
        }

        public Criteria andEmpageNotIn(List<Integer> values) {
            addCriterion("empage not in", values, "empage");
            return (Criteria) this;
        }

        public Criteria andEmpageBetween(Integer value1, Integer value2) {
            addCriterion("empage between", value1, value2, "empage");
            return (Criteria) this;
        }

        public Criteria andEmpageNotBetween(Integer value1, Integer value2) {
            addCriterion("empage not between", value1, value2, "empage");
            return (Criteria) this;
        }

        public Criteria andEmpphoneIsNull() {
            addCriterion("empphone is null");
            return (Criteria) this;
        }

        public Criteria andEmpphoneIsNotNull() {
            addCriterion("empphone is not null");
            return (Criteria) this;
        }

        public Criteria andEmpphoneEqualTo(String value) {
            addCriterion("empphone =", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneNotEqualTo(String value) {
            addCriterion("empphone <>", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneGreaterThan(String value) {
            addCriterion("empphone >", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneGreaterThanOrEqualTo(String value) {
            addCriterion("empphone >=", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneLessThan(String value) {
            addCriterion("empphone <", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneLessThanOrEqualTo(String value) {
            addCriterion("empphone <=", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneLike(String value) {
            addCriterion("empphone like", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneNotLike(String value) {
            addCriterion("empphone not like", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneIn(List<String> values) {
            addCriterion("empphone in", values, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneNotIn(List<String> values) {
            addCriterion("empphone not in", values, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneBetween(String value1, String value2) {
            addCriterion("empphone between", value1, value2, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneNotBetween(String value1, String value2) {
            addCriterion("empphone not between", value1, value2, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpaddressIsNull() {
            addCriterion("empaddress is null");
            return (Criteria) this;
        }

        public Criteria andEmpaddressIsNotNull() {
            addCriterion("empaddress is not null");
            return (Criteria) this;
        }

        public Criteria andEmpaddressEqualTo(String value) {
            addCriterion("empaddress =", value, "empaddress");
            return (Criteria) this;
        }

        public Criteria andEmpaddressNotEqualTo(String value) {
            addCriterion("empaddress <>", value, "empaddress");
            return (Criteria) this;
        }

        public Criteria andEmpaddressGreaterThan(String value) {
            addCriterion("empaddress >", value, "empaddress");
            return (Criteria) this;
        }

        public Criteria andEmpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("empaddress >=", value, "empaddress");
            return (Criteria) this;
        }

        public Criteria andEmpaddressLessThan(String value) {
            addCriterion("empaddress <", value, "empaddress");
            return (Criteria) this;
        }

        public Criteria andEmpaddressLessThanOrEqualTo(String value) {
            addCriterion("empaddress <=", value, "empaddress");
            return (Criteria) this;
        }

        public Criteria andEmpaddressLike(String value) {
            addCriterion("empaddress like", value, "empaddress");
            return (Criteria) this;
        }

        public Criteria andEmpaddressNotLike(String value) {
            addCriterion("empaddress not like", value, "empaddress");
            return (Criteria) this;
        }

        public Criteria andEmpaddressIn(List<String> values) {
            addCriterion("empaddress in", values, "empaddress");
            return (Criteria) this;
        }

        public Criteria andEmpaddressNotIn(List<String> values) {
            addCriterion("empaddress not in", values, "empaddress");
            return (Criteria) this;
        }

        public Criteria andEmpaddressBetween(String value1, String value2) {
            addCriterion("empaddress between", value1, value2, "empaddress");
            return (Criteria) this;
        }

        public Criteria andEmpaddressNotBetween(String value1, String value2) {
            addCriterion("empaddress not between", value1, value2, "empaddress");
            return (Criteria) this;
        }

        public Criteria andEmpdateIsNull() {
            addCriterion("empdate is null");
            return (Criteria) this;
        }

        public Criteria andEmpdateIsNotNull() {
            addCriterion("empdate is not null");
            return (Criteria) this;
        }

        public Criteria andEmpdateEqualTo(Date value) {
            addCriterion("empdate =", value, "empdate");
            return (Criteria) this;
        }

        public Criteria andEmpdateNotEqualTo(Date value) {
            addCriterion("empdate <>", value, "empdate");
            return (Criteria) this;
        }

        public Criteria andEmpdateGreaterThan(Date value) {
            addCriterion("empdate >", value, "empdate");
            return (Criteria) this;
        }

        public Criteria andEmpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("empdate >=", value, "empdate");
            return (Criteria) this;
        }

        public Criteria andEmpdateLessThan(Date value) {
            addCriterion("empdate <", value, "empdate");
            return (Criteria) this;
        }

        public Criteria andEmpdateLessThanOrEqualTo(Date value) {
            addCriterion("empdate <=", value, "empdate");
            return (Criteria) this;
        }

        public Criteria andEmpdateIn(List<Date> values) {
            addCriterion("empdate in", values, "empdate");
            return (Criteria) this;
        }

        public Criteria andEmpdateNotIn(List<Date> values) {
            addCriterion("empdate not in", values, "empdate");
            return (Criteria) this;
        }

        public Criteria andEmpdateBetween(Date value1, Date value2) {
            addCriterion("empdate between", value1, value2, "empdate");
            return (Criteria) this;
        }

        public Criteria andEmpdateNotBetween(Date value1, Date value2) {
            addCriterion("empdate not between", value1, value2, "empdate");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("deptid is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("deptid is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Integer value) {
            addCriterion("deptid =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Integer value) {
            addCriterion("deptid <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Integer value) {
            addCriterion("deptid >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptid >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Integer value) {
            addCriterion("deptid <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Integer value) {
            addCriterion("deptid <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Integer> values) {
            addCriterion("deptid in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Integer> values) {
            addCriterion("deptid not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Integer value1, Integer value2) {
            addCriterion("deptid between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("deptid not between", value1, value2, "deptid");
            return (Criteria) this;
        }
    }

    /**
     */
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