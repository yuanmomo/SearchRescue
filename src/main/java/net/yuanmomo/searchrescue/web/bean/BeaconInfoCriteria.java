package net.yuanmomo.searchrescue.web.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BeaconInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String limitStartAndEnd = "0,1";

    public BeaconInfoCriteria() {
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

        public Criteria andBeaconNoIsNull() {
            addCriterion("beacon_No is null");
            return (Criteria) this;
        }

        public Criteria andBeaconNoIsNotNull() {
            addCriterion("beacon_No is not null");
            return (Criteria) this;
        }

        public Criteria andBeaconNoEqualTo(String value) {
            addCriterion("beacon_No =", value, "beaconNo");
            return (Criteria) this;
        }

        public Criteria andBeaconNoNotEqualTo(String value) {
            addCriterion("beacon_No <>", value, "beaconNo");
            return (Criteria) this;
        }

        public Criteria andBeaconNoGreaterThan(String value) {
            addCriterion("beacon_No >", value, "beaconNo");
            return (Criteria) this;
        }

        public Criteria andBeaconNoGreaterThanOrEqualTo(String value) {
            addCriterion("beacon_No >=", value, "beaconNo");
            return (Criteria) this;
        }

        public Criteria andBeaconNoLessThan(String value) {
            addCriterion("beacon_No <", value, "beaconNo");
            return (Criteria) this;
        }

        public Criteria andBeaconNoLessThanOrEqualTo(String value) {
            addCriterion("beacon_No <=", value, "beaconNo");
            return (Criteria) this;
        }

        public Criteria andBeaconNoLike(String value) {
            addCriterion("beacon_No like", value, "beaconNo");
            return (Criteria) this;
        }

        public Criteria andBeaconNoNotLike(String value) {
            addCriterion("beacon_No not like", value, "beaconNo");
            return (Criteria) this;
        }

        public Criteria andBeaconNoIn(List<String> values) {
            addCriterion("beacon_No in", values, "beaconNo");
            return (Criteria) this;
        }

        public Criteria andBeaconNoNotIn(List<String> values) {
            addCriterion("beacon_No not in", values, "beaconNo");
            return (Criteria) this;
        }

        public Criteria andBeaconNoBetween(String value1, String value2) {
            addCriterion("beacon_No between", value1, value2, "beaconNo");
            return (Criteria) this;
        }

        public Criteria andBeaconNoNotBetween(String value1, String value2) {
            addCriterion("beacon_No not between", value1, value2, "beaconNo");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNull() {
            addCriterion("lastUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNotNull() {
            addCriterion("lastUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeEqualTo(Date value) {
            addCriterion("lastUpdateTime =", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotEqualTo(Date value) {
            addCriterion("lastUpdateTime <>", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThan(Date value) {
            addCriterion("lastUpdateTime >", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastUpdateTime >=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThan(Date value) {
            addCriterion("lastUpdateTime <", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("lastUpdateTime <=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIn(List<Date> values) {
            addCriterion("lastUpdateTime in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotIn(List<Date> values) {
            addCriterion("lastUpdateTime not in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeBetween(Date value1, Date value2) {
            addCriterion("lastUpdateTime between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("lastUpdateTime not between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuserstyleIsNull() {
            addCriterion("lastUpdateByUserStyle is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuserstyleIsNotNull() {
            addCriterion("lastUpdateByUserStyle is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuserstyleEqualTo(Byte value) {
            addCriterion("lastUpdateByUserStyle =", value, "lastupdatebyuserstyle");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuserstyleNotEqualTo(Byte value) {
            addCriterion("lastUpdateByUserStyle <>", value, "lastupdatebyuserstyle");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuserstyleGreaterThan(Byte value) {
            addCriterion("lastUpdateByUserStyle >", value, "lastupdatebyuserstyle");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuserstyleGreaterThanOrEqualTo(Byte value) {
            addCriterion("lastUpdateByUserStyle >=", value, "lastupdatebyuserstyle");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuserstyleLessThan(Byte value) {
            addCriterion("lastUpdateByUserStyle <", value, "lastupdatebyuserstyle");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuserstyleLessThanOrEqualTo(Byte value) {
            addCriterion("lastUpdateByUserStyle <=", value, "lastupdatebyuserstyle");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuserstyleIn(List<Byte> values) {
            addCriterion("lastUpdateByUserStyle in", values, "lastupdatebyuserstyle");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuserstyleNotIn(List<Byte> values) {
            addCriterion("lastUpdateByUserStyle not in", values, "lastupdatebyuserstyle");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuserstyleBetween(Byte value1, Byte value2) {
            addCriterion("lastUpdateByUserStyle between", value1, value2, "lastupdatebyuserstyle");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuserstyleNotBetween(Byte value1, Byte value2) {
            addCriterion("lastUpdateByUserStyle not between", value1, value2, "lastupdatebyuserstyle");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuseridIsNull() {
            addCriterion("lastUpdateByUserID is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuseridIsNotNull() {
            addCriterion("lastUpdateByUserID is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuseridEqualTo(Long value) {
            addCriterion("lastUpdateByUserID =", value, "lastupdatebyuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuseridNotEqualTo(Long value) {
            addCriterion("lastUpdateByUserID <>", value, "lastupdatebyuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuseridGreaterThan(Long value) {
            addCriterion("lastUpdateByUserID >", value, "lastupdatebyuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("lastUpdateByUserID >=", value, "lastupdatebyuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuseridLessThan(Long value) {
            addCriterion("lastUpdateByUserID <", value, "lastupdatebyuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuseridLessThanOrEqualTo(Long value) {
            addCriterion("lastUpdateByUserID <=", value, "lastupdatebyuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuseridIn(List<Long> values) {
            addCriterion("lastUpdateByUserID in", values, "lastupdatebyuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuseridNotIn(List<Long> values) {
            addCriterion("lastUpdateByUserID not in", values, "lastupdatebyuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuseridBetween(Long value1, Long value2) {
            addCriterion("lastUpdateByUserID between", value1, value2, "lastupdatebyuserid");
            return (Criteria) this;
        }

        public Criteria andLastupdatebyuseridNotBetween(Long value1, Long value2) {
            addCriterion("lastUpdateByUserID not between", value1, value2, "lastupdatebyuserid");
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

        public Criteria andBeaconNoLikeInsensitive(String value) {
            addCriterion("upper(beacon_No) like", value.toUpperCase(), "beaconNo");
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