package net.yuanmomo.searchrescue.web.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaseInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String limitStartAndEnd = "0,1";

    public LeaseInfoCriteria() {
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

    public void setLimitStartAndEnd(String limitStartAndEnd) {
        this.limitStartAndEnd=limitStartAndEnd;
    }

    public String getLimitStartAndEnd() {
        return limitStartAndEnd;
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

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andBeaconidIsNull() {
            addCriterion("beaconID is null");
            return (Criteria) this;
        }

        public Criteria andBeaconidIsNotNull() {
            addCriterion("beaconID is not null");
            return (Criteria) this;
        }

        public Criteria andBeaconidEqualTo(Long value) {
            addCriterion("beaconID =", value, "beaconid");
            return (Criteria) this;
        }

        public Criteria andBeaconidNotEqualTo(Long value) {
            addCriterion("beaconID <>", value, "beaconid");
            return (Criteria) this;
        }

        public Criteria andBeaconidGreaterThan(Long value) {
            addCriterion("beaconID >", value, "beaconid");
            return (Criteria) this;
        }

        public Criteria andBeaconidGreaterThanOrEqualTo(Long value) {
            addCriterion("beaconID >=", value, "beaconid");
            return (Criteria) this;
        }

        public Criteria andBeaconidLessThan(Long value) {
            addCriterion("beaconID <", value, "beaconid");
            return (Criteria) this;
        }

        public Criteria andBeaconidLessThanOrEqualTo(Long value) {
            addCriterion("beaconID <=", value, "beaconid");
            return (Criteria) this;
        }

        public Criteria andBeaconidIn(List<Long> values) {
            addCriterion("beaconID in", values, "beaconid");
            return (Criteria) this;
        }

        public Criteria andBeaconidNotIn(List<Long> values) {
            addCriterion("beaconID not in", values, "beaconid");
            return (Criteria) this;
        }

        public Criteria andBeaconidBetween(Long value1, Long value2) {
            addCriterion("beaconID between", value1, value2, "beaconid");
            return (Criteria) this;
        }

        public Criteria andBeaconidNotBetween(Long value1, Long value2) {
            addCriterion("beaconID not between", value1, value2, "beaconid");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andReturndateIsNull() {
            addCriterion("returnDate is null");
            return (Criteria) this;
        }

        public Criteria andReturndateIsNotNull() {
            addCriterion("returnDate is not null");
            return (Criteria) this;
        }

        public Criteria andReturndateEqualTo(Date value) {
            addCriterion("returnDate =", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateNotEqualTo(Date value) {
            addCriterion("returnDate <>", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateGreaterThan(Date value) {
            addCriterion("returnDate >", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateGreaterThanOrEqualTo(Date value) {
            addCriterion("returnDate >=", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateLessThan(Date value) {
            addCriterion("returnDate <", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateLessThanOrEqualTo(Date value) {
            addCriterion("returnDate <=", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateIn(List<Date> values) {
            addCriterion("returnDate in", values, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateNotIn(List<Date> values) {
            addCriterion("returnDate not in", values, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateBetween(Date value1, Date value2) {
            addCriterion("returnDate between", value1, value2, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateNotBetween(Date value1, Date value2) {
            addCriterion("returnDate not between", value1, value2, "returndate");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andIsreturnedIsNull() {
            addCriterion("isReturned is null");
            return (Criteria) this;
        }

        public Criteria andIsreturnedIsNotNull() {
            addCriterion("isReturned is not null");
            return (Criteria) this;
        }

        public Criteria andIsreturnedEqualTo(Byte value) {
            addCriterion("isReturned =", value, "isreturned");
            return (Criteria) this;
        }

        public Criteria andIsreturnedNotEqualTo(Byte value) {
            addCriterion("isReturned <>", value, "isreturned");
            return (Criteria) this;
        }

        public Criteria andIsreturnedGreaterThan(Byte value) {
            addCriterion("isReturned >", value, "isreturned");
            return (Criteria) this;
        }

        public Criteria andIsreturnedGreaterThanOrEqualTo(Byte value) {
            addCriterion("isReturned >=", value, "isreturned");
            return (Criteria) this;
        }

        public Criteria andIsreturnedLessThan(Byte value) {
            addCriterion("isReturned <", value, "isreturned");
            return (Criteria) this;
        }

        public Criteria andIsreturnedLessThanOrEqualTo(Byte value) {
            addCriterion("isReturned <=", value, "isreturned");
            return (Criteria) this;
        }

        public Criteria andIsreturnedIn(List<Byte> values) {
            addCriterion("isReturned in", values, "isreturned");
            return (Criteria) this;
        }

        public Criteria andIsreturnedNotIn(List<Byte> values) {
            addCriterion("isReturned not in", values, "isreturned");
            return (Criteria) this;
        }

        public Criteria andIsreturnedBetween(Byte value1, Byte value2) {
            addCriterion("isReturned between", value1, value2, "isreturned");
            return (Criteria) this;
        }

        public Criteria andIsreturnedNotBetween(Byte value1, Byte value2) {
            addCriterion("isReturned not between", value1, value2, "isreturned");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("isDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("isDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Byte value) {
            addCriterion("isDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Byte value) {
            addCriterion("isDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Byte value) {
            addCriterion("isDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("isDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Byte value) {
            addCriterion("isDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Byte value) {
            addCriterion("isDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Byte> values) {
            addCriterion("isDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Byte> values) {
            addCriterion("isDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Byte value1, Byte value2) {
            addCriterion("isDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("isDeleted not between", value1, value2, "isdeleted");
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