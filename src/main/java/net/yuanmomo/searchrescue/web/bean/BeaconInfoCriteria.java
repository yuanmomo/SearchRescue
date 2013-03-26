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

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_Update_Time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_Update_Time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_Update_Time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_Update_Time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_Update_Time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_Update_Time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_Update_Time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_Update_Time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_Update_Time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_Update_Time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_Update_Time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_Update_Time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserStyleIsNull() {
            addCriterion("last_Update_By_User_Style is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserStyleIsNotNull() {
            addCriterion("last_Update_By_User_Style is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserStyleEqualTo(Byte value) {
            addCriterion("last_Update_By_User_Style =", value, "lastUpdateByUserStyle");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserStyleNotEqualTo(Byte value) {
            addCriterion("last_Update_By_User_Style <>", value, "lastUpdateByUserStyle");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserStyleGreaterThan(Byte value) {
            addCriterion("last_Update_By_User_Style >", value, "lastUpdateByUserStyle");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserStyleGreaterThanOrEqualTo(Byte value) {
            addCriterion("last_Update_By_User_Style >=", value, "lastUpdateByUserStyle");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserStyleLessThan(Byte value) {
            addCriterion("last_Update_By_User_Style <", value, "lastUpdateByUserStyle");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserStyleLessThanOrEqualTo(Byte value) {
            addCriterion("last_Update_By_User_Style <=", value, "lastUpdateByUserStyle");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserStyleIn(List<Byte> values) {
            addCriterion("last_Update_By_User_Style in", values, "lastUpdateByUserStyle");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserStyleNotIn(List<Byte> values) {
            addCriterion("last_Update_By_User_Style not in", values, "lastUpdateByUserStyle");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserStyleBetween(Byte value1, Byte value2) {
            addCriterion("last_Update_By_User_Style between", value1, value2, "lastUpdateByUserStyle");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserStyleNotBetween(Byte value1, Byte value2) {
            addCriterion("last_Update_By_User_Style not between", value1, value2, "lastUpdateByUserStyle");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserIdIsNull() {
            addCriterion("last_Update_By_User_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserIdIsNotNull() {
            addCriterion("last_Update_By_User_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserIdEqualTo(Long value) {
            addCriterion("last_Update_By_User_ID =", value, "lastUpdateByUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserIdNotEqualTo(Long value) {
            addCriterion("last_Update_By_User_ID <>", value, "lastUpdateByUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserIdGreaterThan(Long value) {
            addCriterion("last_Update_By_User_ID >", value, "lastUpdateByUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("last_Update_By_User_ID >=", value, "lastUpdateByUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserIdLessThan(Long value) {
            addCriterion("last_Update_By_User_ID <", value, "lastUpdateByUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserIdLessThanOrEqualTo(Long value) {
            addCriterion("last_Update_By_User_ID <=", value, "lastUpdateByUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserIdIn(List<Long> values) {
            addCriterion("last_Update_By_User_ID in", values, "lastUpdateByUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserIdNotIn(List<Long> values) {
            addCriterion("last_Update_By_User_ID not in", values, "lastUpdateByUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserIdBetween(Long value1, Long value2) {
            addCriterion("last_Update_By_User_ID between", value1, value2, "lastUpdateByUserId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByUserIdNotBetween(Long value1, Long value2) {
            addCriterion("last_Update_By_User_ID not between", value1, value2, "lastUpdateByUserId");
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

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_Deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_Deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Byte value) {
            addCriterion("is_Deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Byte value) {
            addCriterion("is_Deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Byte value) {
            addCriterion("is_Deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_Deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Byte value) {
            addCriterion("is_Deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("is_Deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Byte> values) {
            addCriterion("is_Deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Byte> values) {
            addCriterion("is_Deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Byte value1, Byte value2) {
            addCriterion("is_Deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_Deleted not between", value1, value2, "isDeleted");
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