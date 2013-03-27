package net.yuanmomo.searchrescue.web.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoughtBeaconCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String limitStartAndEnd = "0,1";

    public BoughtBeaconCriteria() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_Name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_Name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_Name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_Name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_Name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_Name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_Name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_Name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_Name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_Name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_Name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_Name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_Name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andCerNoIsNull() {
            addCriterion("cer_No is null");
            return (Criteria) this;
        }

        public Criteria andCerNoIsNotNull() {
            addCriterion("cer_No is not null");
            return (Criteria) this;
        }

        public Criteria andCerNoEqualTo(String value) {
            addCriterion("cer_No =", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoNotEqualTo(String value) {
            addCriterion("cer_No <>", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoGreaterThan(String value) {
            addCriterion("cer_No >", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoGreaterThanOrEqualTo(String value) {
            addCriterion("cer_No >=", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoLessThan(String value) {
            addCriterion("cer_No <", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoLessThanOrEqualTo(String value) {
            addCriterion("cer_No <=", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoLike(String value) {
            addCriterion("cer_No like", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoNotLike(String value) {
            addCriterion("cer_No not like", value, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoIn(List<String> values) {
            addCriterion("cer_No in", values, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoNotIn(List<String> values) {
            addCriterion("cer_No not in", values, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoBetween(String value1, String value2) {
            addCriterion("cer_No between", value1, value2, "cerNo");
            return (Criteria) this;
        }

        public Criteria andCerNoNotBetween(String value1, String value2) {
            addCriterion("cer_No not between", value1, value2, "cerNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoIsNull() {
            addCriterion("passport_No is null");
            return (Criteria) this;
        }

        public Criteria andPassportNoIsNotNull() {
            addCriterion("passport_No is not null");
            return (Criteria) this;
        }

        public Criteria andPassportNoEqualTo(String value) {
            addCriterion("passport_No =", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoNotEqualTo(String value) {
            addCriterion("passport_No <>", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoGreaterThan(String value) {
            addCriterion("passport_No >", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoGreaterThanOrEqualTo(String value) {
            addCriterion("passport_No >=", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoLessThan(String value) {
            addCriterion("passport_No <", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoLessThanOrEqualTo(String value) {
            addCriterion("passport_No <=", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoLike(String value) {
            addCriterion("passport_No like", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoNotLike(String value) {
            addCriterion("passport_No not like", value, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoIn(List<String> values) {
            addCriterion("passport_No in", values, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoNotIn(List<String> values) {
            addCriterion("passport_No not in", values, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoBetween(String value1, String value2) {
            addCriterion("passport_No between", value1, value2, "passportNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoNotBetween(String value1, String value2) {
            addCriterion("passport_No not between", value1, value2, "passportNo");
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
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andBoughtDateIsNull() {
            addCriterion("bought_Date is null");
            return (Criteria) this;
        }

        public Criteria andBoughtDateIsNotNull() {
            addCriterion("bought_Date is not null");
            return (Criteria) this;
        }

        public Criteria andBoughtDateEqualTo(Date value) {
            addCriterion("bought_Date =", value, "boughtDate");
            return (Criteria) this;
        }

        public Criteria andBoughtDateNotEqualTo(Date value) {
            addCriterion("bought_Date <>", value, "boughtDate");
            return (Criteria) this;
        }

        public Criteria andBoughtDateGreaterThan(Date value) {
            addCriterion("bought_Date >", value, "boughtDate");
            return (Criteria) this;
        }

        public Criteria andBoughtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bought_Date >=", value, "boughtDate");
            return (Criteria) this;
        }

        public Criteria andBoughtDateLessThan(Date value) {
            addCriterion("bought_Date <", value, "boughtDate");
            return (Criteria) this;
        }

        public Criteria andBoughtDateLessThanOrEqualTo(Date value) {
            addCriterion("bought_Date <=", value, "boughtDate");
            return (Criteria) this;
        }

        public Criteria andBoughtDateIn(List<Date> values) {
            addCriterion("bought_Date in", values, "boughtDate");
            return (Criteria) this;
        }

        public Criteria andBoughtDateNotIn(List<Date> values) {
            addCriterion("bought_Date not in", values, "boughtDate");
            return (Criteria) this;
        }

        public Criteria andBoughtDateBetween(Date value1, Date value2) {
            addCriterion("bought_Date between", value1, value2, "boughtDate");
            return (Criteria) this;
        }

        public Criteria andBoughtDateNotBetween(Date value1, Date value2) {
            addCriterion("bought_Date not between", value1, value2, "boughtDate");
            return (Criteria) this;
        }

        public Criteria andUserNameLikeInsensitive(String value) {
            addCriterion("upper(user_Name) like", value.toUpperCase(), "userName");
            return (Criteria) this;
        }

        public Criteria andCerNoLikeInsensitive(String value) {
            addCriterion("upper(cer_No) like", value.toUpperCase(), "cerNo");
            return (Criteria) this;
        }

        public Criteria andPassportNoLikeInsensitive(String value) {
            addCriterion("upper(passport_No) like", value.toUpperCase(), "passportNo");
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