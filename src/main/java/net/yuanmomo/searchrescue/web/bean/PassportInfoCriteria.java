package net.yuanmomo.searchrescue.web.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PassportInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String limitStartAndEnd = "0,1";

    public PassportInfoCriteria() {
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

        public Criteria andUserinfoIdIsNull() {
            addCriterion("userInfo_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIsNotNull() {
            addCriterion("userInfo_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdEqualTo(Long value) {
            addCriterion("userInfo_ID =", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotEqualTo(Long value) {
            addCriterion("userInfo_ID <>", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThan(Long value) {
            addCriterion("userInfo_ID >", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("userInfo_ID >=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThan(Long value) {
            addCriterion("userInfo_ID <", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThanOrEqualTo(Long value) {
            addCriterion("userInfo_ID <=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIn(List<Long> values) {
            addCriterion("userInfo_ID in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotIn(List<Long> values) {
            addCriterion("userInfo_ID not in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdBetween(Long value1, Long value2) {
            addCriterion("userInfo_ID between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotBetween(Long value1, Long value2) {
            addCriterion("userInfo_ID not between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNull() {
            addCriterion("authority is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNotNull() {
            addCriterion("authority is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityEqualTo(String value) {
            addCriterion("authority =", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotEqualTo(String value) {
            addCriterion("authority <>", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThan(String value) {
            addCriterion("authority >", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("authority >=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThan(String value) {
            addCriterion("authority <", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThanOrEqualTo(String value) {
            addCriterion("authority <=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLike(String value) {
            addCriterion("authority like", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotLike(String value) {
            addCriterion("authority not like", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityIn(List<String> values) {
            addCriterion("authority in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotIn(List<String> values) {
            addCriterion("authority not in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityBetween(String value1, String value2) {
            addCriterion("authority between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotBetween(String value1, String value2) {
            addCriterion("authority not between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityidIsNull() {
            addCriterion("authorityID is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityidIsNotNull() {
            addCriterion("authorityID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityidEqualTo(Integer value) {
            addCriterion("authorityID =", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidNotEqualTo(Integer value) {
            addCriterion("authorityID <>", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidGreaterThan(Integer value) {
            addCriterion("authorityID >", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("authorityID >=", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidLessThan(Integer value) {
            addCriterion("authorityID <", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidLessThanOrEqualTo(Integer value) {
            addCriterion("authorityID <=", value, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidIn(List<Integer> values) {
            addCriterion("authorityID in", values, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidNotIn(List<Integer> values) {
            addCriterion("authorityID not in", values, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidBetween(Integer value1, Integer value2) {
            addCriterion("authorityID between", value1, value2, "authorityid");
            return (Criteria) this;
        }

        public Criteria andAuthorityidNotBetween(Integer value1, Integer value2) {
            addCriterion("authorityID not between", value1, value2, "authorityid");
            return (Criteria) this;
        }

        public Criteria andPassportnoIsNull() {
            addCriterion("passportNo is null");
            return (Criteria) this;
        }

        public Criteria andPassportnoIsNotNull() {
            addCriterion("passportNo is not null");
            return (Criteria) this;
        }

        public Criteria andPassportnoEqualTo(String value) {
            addCriterion("passportNo =", value, "passportno");
            return (Criteria) this;
        }

        public Criteria andPassportnoNotEqualTo(String value) {
            addCriterion("passportNo <>", value, "passportno");
            return (Criteria) this;
        }

        public Criteria andPassportnoGreaterThan(String value) {
            addCriterion("passportNo >", value, "passportno");
            return (Criteria) this;
        }

        public Criteria andPassportnoGreaterThanOrEqualTo(String value) {
            addCriterion("passportNo >=", value, "passportno");
            return (Criteria) this;
        }

        public Criteria andPassportnoLessThan(String value) {
            addCriterion("passportNo <", value, "passportno");
            return (Criteria) this;
        }

        public Criteria andPassportnoLessThanOrEqualTo(String value) {
            addCriterion("passportNo <=", value, "passportno");
            return (Criteria) this;
        }

        public Criteria andPassportnoLike(String value) {
            addCriterion("passportNo like", value, "passportno");
            return (Criteria) this;
        }

        public Criteria andPassportnoNotLike(String value) {
            addCriterion("passportNo not like", value, "passportno");
            return (Criteria) this;
        }

        public Criteria andPassportnoIn(List<String> values) {
            addCriterion("passportNo in", values, "passportno");
            return (Criteria) this;
        }

        public Criteria andPassportnoNotIn(List<String> values) {
            addCriterion("passportNo not in", values, "passportno");
            return (Criteria) this;
        }

        public Criteria andPassportnoBetween(String value1, String value2) {
            addCriterion("passportNo between", value1, value2, "passportno");
            return (Criteria) this;
        }

        public Criteria andPassportnoNotBetween(String value1, String value2) {
            addCriterion("passportNo not between", value1, value2, "passportno");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationidIsNull() {
            addCriterion("nationID is null");
            return (Criteria) this;
        }

        public Criteria andNationidIsNotNull() {
            addCriterion("nationID is not null");
            return (Criteria) this;
        }

        public Criteria andNationidEqualTo(Integer value) {
            addCriterion("nationID =", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidNotEqualTo(Integer value) {
            addCriterion("nationID <>", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidGreaterThan(Integer value) {
            addCriterion("nationID >", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nationID >=", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidLessThan(Integer value) {
            addCriterion("nationID <", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidLessThanOrEqualTo(Integer value) {
            addCriterion("nationID <=", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidIn(List<Integer> values) {
            addCriterion("nationID in", values, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidNotIn(List<Integer> values) {
            addCriterion("nationID not in", values, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidBetween(Integer value1, Integer value2) {
            addCriterion("nationID between", value1, value2, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidNotBetween(Integer value1, Integer value2) {
            addCriterion("nationID not between", value1, value2, "nationid");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andIssuedateIsNull() {
            addCriterion("issueDate is null");
            return (Criteria) this;
        }

        public Criteria andIssuedateIsNotNull() {
            addCriterion("issueDate is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedateEqualTo(Date value) {
            addCriterion("issueDate =", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotEqualTo(Date value) {
            addCriterion("issueDate <>", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateGreaterThan(Date value) {
            addCriterion("issueDate >", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateGreaterThanOrEqualTo(Date value) {
            addCriterion("issueDate >=", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLessThan(Date value) {
            addCriterion("issueDate <", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLessThanOrEqualTo(Date value) {
            addCriterion("issueDate <=", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateIn(List<Date> values) {
            addCriterion("issueDate in", values, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotIn(List<Date> values) {
            addCriterion("issueDate not in", values, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateBetween(Date value1, Date value2) {
            addCriterion("issueDate between", value1, value2, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotBetween(Date value1, Date value2) {
            addCriterion("issueDate not between", value1, value2, "issuedate");
            return (Criteria) this;
        }

        public Criteria andEffecDurationIsNull() {
            addCriterion("\"effec_ Duration\" is null");
            return (Criteria) this;
        }

        public Criteria andEffecDurationIsNotNull() {
            addCriterion("\"effec_ Duration\" is not null");
            return (Criteria) this;
        }

        public Criteria andEffecDurationEqualTo(Date value) {
            addCriterion("\"effec_ Duration\" =", value, "effecDuration");
            return (Criteria) this;
        }

        public Criteria andEffecDurationNotEqualTo(Date value) {
            addCriterion("\"effec_ Duration\" <>", value, "effecDuration");
            return (Criteria) this;
        }

        public Criteria andEffecDurationGreaterThan(Date value) {
            addCriterion("\"effec_ Duration\" >", value, "effecDuration");
            return (Criteria) this;
        }

        public Criteria andEffecDurationGreaterThanOrEqualTo(Date value) {
            addCriterion("\"effec_ Duration\" >=", value, "effecDuration");
            return (Criteria) this;
        }

        public Criteria andEffecDurationLessThan(Date value) {
            addCriterion("\"effec_ Duration\" <", value, "effecDuration");
            return (Criteria) this;
        }

        public Criteria andEffecDurationLessThanOrEqualTo(Date value) {
            addCriterion("\"effec_ Duration\" <=", value, "effecDuration");
            return (Criteria) this;
        }

        public Criteria andEffecDurationIn(List<Date> values) {
            addCriterion("\"effec_ Duration\" in", values, "effecDuration");
            return (Criteria) this;
        }

        public Criteria andEffecDurationNotIn(List<Date> values) {
            addCriterion("\"effec_ Duration\" not in", values, "effecDuration");
            return (Criteria) this;
        }

        public Criteria andEffecDurationBetween(Date value1, Date value2) {
            addCriterion("\"effec_ Duration\" between", value1, value2, "effecDuration");
            return (Criteria) this;
        }

        public Criteria andEffecDurationNotBetween(Date value1, Date value2) {
            addCriterion("\"effec_ Duration\" not between", value1, value2, "effecDuration");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(Integer value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(Integer value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(Integer value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(Integer value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(Integer value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(Integer value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<Integer> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<Integer> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(Integer value1, Integer value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(Integer value1, Integer value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotopathIsNull() {
            addCriterion("photoPath is null");
            return (Criteria) this;
        }

        public Criteria andPhotopathIsNotNull() {
            addCriterion("photoPath is not null");
            return (Criteria) this;
        }

        public Criteria andPhotopathEqualTo(Integer value) {
            addCriterion("photoPath =", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathNotEqualTo(Integer value) {
            addCriterion("photoPath <>", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathGreaterThan(Integer value) {
            addCriterion("photoPath >", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathGreaterThanOrEqualTo(Integer value) {
            addCriterion("photoPath >=", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathLessThan(Integer value) {
            addCriterion("photoPath <", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathLessThanOrEqualTo(Integer value) {
            addCriterion("photoPath <=", value, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathIn(List<Integer> values) {
            addCriterion("photoPath in", values, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathNotIn(List<Integer> values) {
            addCriterion("photoPath not in", values, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathBetween(Integer value1, Integer value2) {
            addCriterion("photoPath between", value1, value2, "photopath");
            return (Criteria) this;
        }

        public Criteria andPhotopathNotBetween(Integer value1, Integer value2) {
            addCriterion("photoPath not between", value1, value2, "photopath");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(Integer value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(Integer value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(Integer value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(Integer value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(Integer value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<Integer> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<Integer> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(Integer value1, Integer value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(Integer value1, Integer value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRegisteripIsNull() {
            addCriterion("registerIP is null");
            return (Criteria) this;
        }

        public Criteria andRegisteripIsNotNull() {
            addCriterion("registerIP is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteripEqualTo(String value) {
            addCriterion("registerIP =", value, "registerip");
            return (Criteria) this;
        }

        public Criteria andRegisteripNotEqualTo(String value) {
            addCriterion("registerIP <>", value, "registerip");
            return (Criteria) this;
        }

        public Criteria andRegisteripGreaterThan(String value) {
            addCriterion("registerIP >", value, "registerip");
            return (Criteria) this;
        }

        public Criteria andRegisteripGreaterThanOrEqualTo(String value) {
            addCriterion("registerIP >=", value, "registerip");
            return (Criteria) this;
        }

        public Criteria andRegisteripLessThan(String value) {
            addCriterion("registerIP <", value, "registerip");
            return (Criteria) this;
        }

        public Criteria andRegisteripLessThanOrEqualTo(String value) {
            addCriterion("registerIP <=", value, "registerip");
            return (Criteria) this;
        }

        public Criteria andRegisteripLike(String value) {
            addCriterion("registerIP like", value, "registerip");
            return (Criteria) this;
        }

        public Criteria andRegisteripNotLike(String value) {
            addCriterion("registerIP not like", value, "registerip");
            return (Criteria) this;
        }

        public Criteria andRegisteripIn(List<String> values) {
            addCriterion("registerIP in", values, "registerip");
            return (Criteria) this;
        }

        public Criteria andRegisteripNotIn(List<String> values) {
            addCriterion("registerIP not in", values, "registerip");
            return (Criteria) this;
        }

        public Criteria andRegisteripBetween(String value1, String value2) {
            addCriterion("registerIP between", value1, value2, "registerip");
            return (Criteria) this;
        }

        public Criteria andRegisteripNotBetween(String value1, String value2) {
            addCriterion("registerIP not between", value1, value2, "registerip");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNull() {
            addCriterion("registerTime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("registerTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(Date value) {
            addCriterion("registerTime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(Date value) {
            addCriterion("registerTime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(Date value) {
            addCriterion("registerTime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registerTime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(Date value) {
            addCriterion("registerTime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(Date value) {
            addCriterion("registerTime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<Date> values) {
            addCriterion("registerTime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<Date> values) {
            addCriterion("registerTime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(Date value1, Date value2) {
            addCriterion("registerTime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(Date value1, Date value2) {
            addCriterion("registerTime not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNull() {
            addCriterion("lastLoginIP is null");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNotNull() {
            addCriterion("lastLoginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginipEqualTo(String value) {
            addCriterion("lastLoginIP =", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotEqualTo(String value) {
            addCriterion("lastLoginIP <>", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThan(String value) {
            addCriterion("lastLoginIP >", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThanOrEqualTo(String value) {
            addCriterion("lastLoginIP >=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThan(String value) {
            addCriterion("lastLoginIP <", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThanOrEqualTo(String value) {
            addCriterion("lastLoginIP <=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLike(String value) {
            addCriterion("lastLoginIP like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotLike(String value) {
            addCriterion("lastLoginIP not like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipIn(List<String> values) {
            addCriterion("lastLoginIP in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotIn(List<String> values) {
            addCriterion("lastLoginIP not in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipBetween(String value1, String value2) {
            addCriterion("lastLoginIP between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotBetween(String value1, String value2) {
            addCriterion("lastLoginIP not between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("lastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("lastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(Date value) {
            addCriterion("lastLoginTime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(Date value) {
            addCriterion("lastLoginTime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(Date value) {
            addCriterion("lastLoginTime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLoginTime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(Date value) {
            addCriterion("lastLoginTime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("lastLoginTime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<Date> values) {
            addCriterion("lastLoginTime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<Date> values) {
            addCriterion("lastLoginTime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(Date value1, Date value2) {
            addCriterion("lastLoginTime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("lastLoginTime not between", value1, value2, "lastlogintime");
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

        public Criteria andAuthorityLikeInsensitive(String value) {
            addCriterion("upper(authority) like", value.toUpperCase(), "authority");
            return (Criteria) this;
        }

        public Criteria andPassportnoLikeInsensitive(String value) {
            addCriterion("upper(passportNo) like", value.toUpperCase(), "passportno");
            return (Criteria) this;
        }

        public Criteria andNationalityLikeInsensitive(String value) {
            addCriterion("upper(nationality) like", value.toUpperCase(), "nationality");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andSignatureLikeInsensitive(String value) {
            addCriterion("upper(signature) like", value.toUpperCase(), "signature");
            return (Criteria) this;
        }

        public Criteria andRegisteripLikeInsensitive(String value) {
            addCriterion("upper(registerIP) like", value.toUpperCase(), "registerip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLikeInsensitive(String value) {
            addCriterion("upper(lastLoginIP) like", value.toUpperCase(), "lastloginip");
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