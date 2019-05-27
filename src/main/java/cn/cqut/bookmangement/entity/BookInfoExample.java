package cn.cqut.bookmangement.entity;

import cn.cqut.bookmangement.util.PageHelper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BookInfoExample extends PageHelper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookInfoExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(String value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(String value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(String value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(String value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(String value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLike(String value) {
            addCriterion("book_id like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotLike(String value) {
            addCriterion("book_id not like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<String> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<String> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(String value1, String value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(String value1, String value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andTranslatorIsNull() {
            addCriterion("translator is null");
            return (Criteria) this;
        }

        public Criteria andTranslatorIsNotNull() {
            addCriterion("translator is not null");
            return (Criteria) this;
        }

        public Criteria andTranslatorEqualTo(String value) {
            addCriterion("translator =", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorNotEqualTo(String value) {
            addCriterion("translator <>", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorGreaterThan(String value) {
            addCriterion("translator >", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorGreaterThanOrEqualTo(String value) {
            addCriterion("translator >=", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorLessThan(String value) {
            addCriterion("translator <", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorLessThanOrEqualTo(String value) {
            addCriterion("translator <=", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorLike(String value) {
            addCriterion("translator like", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorNotLike(String value) {
            addCriterion("translator not like", value, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorIn(List<String> values) {
            addCriterion("translator in", values, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorNotIn(List<String> values) {
            addCriterion("translator not in", values, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorBetween(String value1, String value2) {
            addCriterion("translator between", value1, value2, "translator");
            return (Criteria) this;
        }

        public Criteria andTranslatorNotBetween(String value1, String value2) {
            addCriterion("translator not between", value1, value2, "translator");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeIsNull() {
            addCriterion("isbn_code is null");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeIsNotNull() {
            addCriterion("isbn_code is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeEqualTo(String value) {
            addCriterion("isbn_code =", value, "isbnCode");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeNotEqualTo(String value) {
            addCriterion("isbn_code <>", value, "isbnCode");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeGreaterThan(String value) {
            addCriterion("isbn_code >", value, "isbnCode");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("isbn_code >=", value, "isbnCode");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeLessThan(String value) {
            addCriterion("isbn_code <", value, "isbnCode");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeLessThanOrEqualTo(String value) {
            addCriterion("isbn_code <=", value, "isbnCode");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeLike(String value) {
            addCriterion("isbn_code like", value, "isbnCode");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeNotLike(String value) {
            addCriterion("isbn_code not like", value, "isbnCode");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeIn(List<String> values) {
            addCriterion("isbn_code in", values, "isbnCode");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeNotIn(List<String> values) {
            addCriterion("isbn_code not in", values, "isbnCode");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeBetween(String value1, String value2) {
            addCriterion("isbn_code between", value1, value2, "isbnCode");
            return (Criteria) this;
        }

        public Criteria andIsbnCodeNotBetween(String value1, String value2) {
            addCriterion("isbn_code not between", value1, value2, "isbnCode");
            return (Criteria) this;
        }

        public Criteria andComeUpTimeIsNull() {
            addCriterion("come_up_time is null");
            return (Criteria) this;
        }

        public Criteria andComeUpTimeIsNotNull() {
            addCriterion("come_up_time is not null");
            return (Criteria) this;
        }

        public Criteria andComeUpTimeEqualTo(Date value) {
            addCriterionForJDBCDate("come_up_time =", value, "comeUpTime");
            return (Criteria) this;
        }

        public Criteria andComeUpTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("come_up_time <>", value, "comeUpTime");
            return (Criteria) this;
        }

        public Criteria andComeUpTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("come_up_time >", value, "comeUpTime");
            return (Criteria) this;
        }

        public Criteria andComeUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("come_up_time >=", value, "comeUpTime");
            return (Criteria) this;
        }

        public Criteria andComeUpTimeLessThan(Date value) {
            addCriterionForJDBCDate("come_up_time <", value, "comeUpTime");
            return (Criteria) this;
        }

        public Criteria andComeUpTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("come_up_time <=", value, "comeUpTime");
            return (Criteria) this;
        }

        public Criteria andComeUpTimeIn(List<Date> values) {
            addCriterionForJDBCDate("come_up_time in", values, "comeUpTime");
            return (Criteria) this;
        }

        public Criteria andComeUpTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("come_up_time not in", values, "comeUpTime");
            return (Criteria) this;
        }

        public Criteria andComeUpTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("come_up_time between", value1, value2, "comeUpTime");
            return (Criteria) this;
        }

        public Criteria andComeUpTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("come_up_time not between", value1, value2, "comeUpTime");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyIsNull() {
            addCriterion("publish_company is null");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyIsNotNull() {
            addCriterion("publish_company is not null");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyEqualTo(String value) {
            addCriterion("publish_company =", value, "publishCompany");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyNotEqualTo(String value) {
            addCriterion("publish_company <>", value, "publishCompany");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyGreaterThan(String value) {
            addCriterion("publish_company >", value, "publishCompany");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("publish_company >=", value, "publishCompany");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyLessThan(String value) {
            addCriterion("publish_company <", value, "publishCompany");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyLessThanOrEqualTo(String value) {
            addCriterion("publish_company <=", value, "publishCompany");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyLike(String value) {
            addCriterion("publish_company like", value, "publishCompany");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyNotLike(String value) {
            addCriterion("publish_company not like", value, "publishCompany");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyIn(List<String> values) {
            addCriterion("publish_company in", values, "publishCompany");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyNotIn(List<String> values) {
            addCriterion("publish_company not in", values, "publishCompany");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyBetween(String value1, String value2) {
            addCriterion("publish_company between", value1, value2, "publishCompany");
            return (Criteria) this;
        }

        public Criteria andPublishCompanyNotBetween(String value1, String value2) {
            addCriterion("publish_company not between", value1, value2, "publishCompany");
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

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andEnteringMenIsNull() {
            addCriterion("entering_men is null");
            return (Criteria) this;
        }

        public Criteria andEnteringMenIsNotNull() {
            addCriterion("entering_men is not null");
            return (Criteria) this;
        }

        public Criteria andEnteringMenEqualTo(String value) {
            addCriterion("entering_men =", value, "enteringMen");
            return (Criteria) this;
        }

        public Criteria andEnteringMenNotEqualTo(String value) {
            addCriterion("entering_men <>", value, "enteringMen");
            return (Criteria) this;
        }

        public Criteria andEnteringMenGreaterThan(String value) {
            addCriterion("entering_men >", value, "enteringMen");
            return (Criteria) this;
        }

        public Criteria andEnteringMenGreaterThanOrEqualTo(String value) {
            addCriterion("entering_men >=", value, "enteringMen");
            return (Criteria) this;
        }

        public Criteria andEnteringMenLessThan(String value) {
            addCriterion("entering_men <", value, "enteringMen");
            return (Criteria) this;
        }

        public Criteria andEnteringMenLessThanOrEqualTo(String value) {
            addCriterion("entering_men <=", value, "enteringMen");
            return (Criteria) this;
        }

        public Criteria andEnteringMenLike(String value) {
            addCriterion("entering_men like", value, "enteringMen");
            return (Criteria) this;
        }

        public Criteria andEnteringMenNotLike(String value) {
            addCriterion("entering_men not like", value, "enteringMen");
            return (Criteria) this;
        }

        public Criteria andEnteringMenIn(List<String> values) {
            addCriterion("entering_men in", values, "enteringMen");
            return (Criteria) this;
        }

        public Criteria andEnteringMenNotIn(List<String> values) {
            addCriterion("entering_men not in", values, "enteringMen");
            return (Criteria) this;
        }

        public Criteria andEnteringMenBetween(String value1, String value2) {
            addCriterion("entering_men between", value1, value2, "enteringMen");
            return (Criteria) this;
        }

        public Criteria andEnteringMenNotBetween(String value1, String value2) {
            addCriterion("entering_men not between", value1, value2, "enteringMen");
            return (Criteria) this;
        }

        public Criteria andEnteringDateIsNull() {
            addCriterion("entering_date is null");
            return (Criteria) this;
        }

        public Criteria andEnteringDateIsNotNull() {
            addCriterion("entering_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnteringDateEqualTo(Date value) {
            addCriterionForJDBCDate("entering_date =", value, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("entering_date <>", value, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateGreaterThan(Date value) {
            addCriterionForJDBCDate("entering_date >", value, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("entering_date >=", value, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateLessThan(Date value) {
            addCriterionForJDBCDate("entering_date <", value, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("entering_date <=", value, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateIn(List<Date> values) {
            addCriterionForJDBCDate("entering_date in", values, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("entering_date not in", values, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("entering_date between", value1, value2, "enteringDate");
            return (Criteria) this;
        }

        public Criteria andEnteringDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("entering_date not between", value1, value2, "enteringDate");
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