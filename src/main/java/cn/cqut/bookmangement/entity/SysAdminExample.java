package cn.cqut.bookmangement.entity;

import java.util.ArrayList;
import java.util.List;

public class SysAdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysAdminExample() {
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

        public Criteria andAdminidIsNull() {
            addCriterion("AdminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("AdminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(String value) {
            addCriterion("AdminId =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(String value) {
            addCriterion("AdminId <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(String value) {
            addCriterion("AdminId >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(String value) {
            addCriterion("AdminId >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(String value) {
            addCriterion("AdminId <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(String value) {
            addCriterion("AdminId <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLike(String value) {
            addCriterion("AdminId like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotLike(String value) {
            addCriterion("AdminId not like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<String> values) {
            addCriterion("AdminId in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<String> values) {
            addCriterion("AdminId not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(String value1, String value2) {
            addCriterion("AdminId between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(String value1, String value2) {
            addCriterion("AdminId not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNull() {
            addCriterion("AdminName is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("AdminName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("AdminName =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("AdminName <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("AdminName >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("AdminName >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("AdminName <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("AdminName <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("AdminName like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("AdminName not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("AdminName in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("AdminName not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("AdminName between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("AdminName not between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNull() {
            addCriterion("AdminPassword is null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNotNull() {
            addCriterion("AdminPassword is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordEqualTo(String value) {
            addCriterion("AdminPassword =", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotEqualTo(String value) {
            addCriterion("AdminPassword <>", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThan(String value) {
            addCriterion("AdminPassword >", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("AdminPassword >=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThan(String value) {
            addCriterion("AdminPassword <", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThanOrEqualTo(String value) {
            addCriterion("AdminPassword <=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLike(String value) {
            addCriterion("AdminPassword like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotLike(String value) {
            addCriterion("AdminPassword not like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIn(List<String> values) {
            addCriterion("AdminPassword in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotIn(List<String> values) {
            addCriterion("AdminPassword not in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordBetween(String value1, String value2) {
            addCriterion("AdminPassword between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotBetween(String value1, String value2) {
            addCriterion("AdminPassword not between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIsNull() {
            addCriterion("AdminPhone is null");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIsNotNull() {
            addCriterion("AdminPhone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminphoneEqualTo(String value) {
            addCriterion("AdminPhone =", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotEqualTo(String value) {
            addCriterion("AdminPhone <>", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneGreaterThan(String value) {
            addCriterion("AdminPhone >", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneGreaterThanOrEqualTo(String value) {
            addCriterion("AdminPhone >=", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneLessThan(String value) {
            addCriterion("AdminPhone <", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneLessThanOrEqualTo(String value) {
            addCriterion("AdminPhone <=", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneLike(String value) {
            addCriterion("AdminPhone like", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotLike(String value) {
            addCriterion("AdminPhone not like", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIn(List<String> values) {
            addCriterion("AdminPhone in", values, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotIn(List<String> values) {
            addCriterion("AdminPhone not in", values, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneBetween(String value1, String value2) {
            addCriterion("AdminPhone between", value1, value2, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotBetween(String value1, String value2) {
            addCriterion("AdminPhone not between", value1, value2, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminemailIsNull() {
            addCriterion("AdminEmail is null");
            return (Criteria) this;
        }

        public Criteria andAdminemailIsNotNull() {
            addCriterion("AdminEmail is not null");
            return (Criteria) this;
        }

        public Criteria andAdminemailEqualTo(String value) {
            addCriterion("AdminEmail =", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotEqualTo(String value) {
            addCriterion("AdminEmail <>", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailGreaterThan(String value) {
            addCriterion("AdminEmail >", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailGreaterThanOrEqualTo(String value) {
            addCriterion("AdminEmail >=", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLessThan(String value) {
            addCriterion("AdminEmail <", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLessThanOrEqualTo(String value) {
            addCriterion("AdminEmail <=", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLike(String value) {
            addCriterion("AdminEmail like", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotLike(String value) {
            addCriterion("AdminEmail not like", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailIn(List<String> values) {
            addCriterion("AdminEmail in", values, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotIn(List<String> values) {
            addCriterion("AdminEmail not in", values, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailBetween(String value1, String value2) {
            addCriterion("AdminEmail between", value1, value2, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotBetween(String value1, String value2) {
            addCriterion("AdminEmail not between", value1, value2, "adminemail");
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