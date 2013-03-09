package net.yuanmomo.searchrescue.web.bean;

import java.util.ArrayList;
import java.util.List;

public class UserInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String limitStartAndEnd = "0,1";

    public UserInfoCriteria() {
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

        public Criteria andCerStyleIsNull() {
            addCriterion("Cer_Style is null");
            return (Criteria) this;
        }

        public Criteria andCerStyleIsNotNull() {
            addCriterion("Cer_Style is not null");
            return (Criteria) this;
        }

        public Criteria andCerStyleEqualTo(Byte value) {
            addCriterion("Cer_Style =", value, "cerStyle");
            return (Criteria) this;
        }

        public Criteria andCerStyleNotEqualTo(Byte value) {
            addCriterion("Cer_Style <>", value, "cerStyle");
            return (Criteria) this;
        }

        public Criteria andCerStyleGreaterThan(Byte value) {
            addCriterion("Cer_Style >", value, "cerStyle");
            return (Criteria) this;
        }

        public Criteria andCerStyleGreaterThanOrEqualTo(Byte value) {
            addCriterion("Cer_Style >=", value, "cerStyle");
            return (Criteria) this;
        }

        public Criteria andCerStyleLessThan(Byte value) {
            addCriterion("Cer_Style <", value, "cerStyle");
            return (Criteria) this;
        }

        public Criteria andCerStyleLessThanOrEqualTo(Byte value) {
            addCriterion("Cer_Style <=", value, "cerStyle");
            return (Criteria) this;
        }

        public Criteria andCerStyleIn(List<Byte> values) {
            addCriterion("Cer_Style in", values, "cerStyle");
            return (Criteria) this;
        }

        public Criteria andCerStyleNotIn(List<Byte> values) {
            addCriterion("Cer_Style not in", values, "cerStyle");
            return (Criteria) this;
        }

        public Criteria andCerStyleBetween(Byte value1, Byte value2) {
            addCriterion("Cer_Style between", value1, value2, "cerStyle");
            return (Criteria) this;
        }

        public Criteria andCerStyleNotBetween(Byte value1, Byte value2) {
            addCriterion("Cer_Style not between", value1, value2, "cerStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleIsNull() {
            addCriterion("User_Style is null");
            return (Criteria) this;
        }

        public Criteria andUserStyleIsNotNull() {
            addCriterion("User_Style is not null");
            return (Criteria) this;
        }

        public Criteria andUserStyleEqualTo(Byte value) {
            addCriterion("User_Style =", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotEqualTo(Byte value) {
            addCriterion("User_Style <>", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleGreaterThan(Byte value) {
            addCriterion("User_Style >", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleGreaterThanOrEqualTo(Byte value) {
            addCriterion("User_Style >=", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLessThan(Byte value) {
            addCriterion("User_Style <", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLessThanOrEqualTo(Byte value) {
            addCriterion("User_Style <=", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleIn(List<Byte> values) {
            addCriterion("User_Style in", values, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotIn(List<Byte> values) {
            addCriterion("User_Style not in", values, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleBetween(Byte value1, Byte value2) {
            addCriterion("User_Style between", value1, value2, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotBetween(Byte value1, Byte value2) {
            addCriterion("User_Style not between", value1, value2, "userStyle");
            return (Criteria) this;
        }

        public Criteria andCipherIsNull() {
            addCriterion("Cipher is null");
            return (Criteria) this;
        }

        public Criteria andCipherIsNotNull() {
            addCriterion("Cipher is not null");
            return (Criteria) this;
        }

        public Criteria andCipherEqualTo(String value) {
            addCriterion("Cipher =", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherNotEqualTo(String value) {
            addCriterion("Cipher <>", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherGreaterThan(String value) {
            addCriterion("Cipher >", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherGreaterThanOrEqualTo(String value) {
            addCriterion("Cipher >=", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherLessThan(String value) {
            addCriterion("Cipher <", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherLessThanOrEqualTo(String value) {
            addCriterion("Cipher <=", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherLike(String value) {
            addCriterion("Cipher like", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherNotLike(String value) {
            addCriterion("Cipher not like", value, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherIn(List<String> values) {
            addCriterion("Cipher in", values, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherNotIn(List<String> values) {
            addCriterion("Cipher not in", values, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherBetween(String value1, String value2) {
            addCriterion("Cipher between", value1, value2, "cipher");
            return (Criteria) this;
        }

        public Criteria andCipherNotBetween(String value1, String value2) {
            addCriterion("Cipher not between", value1, value2, "cipher");
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

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andCipherLikeInsensitive(String value) {
            addCriterion("upper(Cipher) like", value.toUpperCase(), "cipher");
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