package cn.cqut.bookmangement.entity;

import cn.cqut.bookmangement.util.PageHelper;

import java.util.ArrayList;
import java.util.List;

public class BookAdminExample extends PageHelper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookAdminExample() {
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

        public Criteria andAdidIsNull() {
            addCriterion("AdId is null");
            return (Criteria) this;
        }

        public Criteria andAdidIsNotNull() {
            addCriterion("AdId is not null");
            return (Criteria) this;
        }

        public Criteria andAdidEqualTo(String value) {
            addCriterion("AdId =", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotEqualTo(String value) {
            addCriterion("AdId <>", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidGreaterThan(String value) {
            addCriterion("AdId >", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidGreaterThanOrEqualTo(String value) {
            addCriterion("AdId >=", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidLessThan(String value) {
            addCriterion("AdId <", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidLessThanOrEqualTo(String value) {
            addCriterion("AdId <=", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidLike(String value) {
            addCriterion("AdId like", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotLike(String value) {
            addCriterion("AdId not like", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidIn(List<String> values) {
            addCriterion("AdId in", values, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotIn(List<String> values) {
            addCriterion("AdId not in", values, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidBetween(String value1, String value2) {
            addCriterion("AdId between", value1, value2, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotBetween(String value1, String value2) {
            addCriterion("AdId not between", value1, value2, "adid");
            return (Criteria) this;
        }

        public Criteria andAdnameIsNull() {
            addCriterion("AdName is null");
            return (Criteria) this;
        }

        public Criteria andAdnameIsNotNull() {
            addCriterion("AdName is not null");
            return (Criteria) this;
        }

        public Criteria andAdnameEqualTo(String value) {
            addCriterion("AdName =", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotEqualTo(String value) {
            addCriterion("AdName <>", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameGreaterThan(String value) {
            addCriterion("AdName >", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameGreaterThanOrEqualTo(String value) {
            addCriterion("AdName >=", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLessThan(String value) {
            addCriterion("AdName <", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLessThanOrEqualTo(String value) {
            addCriterion("AdName <=", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLike(String value) {
            addCriterion("AdName like", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotLike(String value) {
            addCriterion("AdName not like", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameIn(List<String> values) {
            addCriterion("AdName in", values, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotIn(List<String> values) {
            addCriterion("AdName not in", values, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameBetween(String value1, String value2) {
            addCriterion("AdName between", value1, value2, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotBetween(String value1, String value2) {
            addCriterion("AdName not between", value1, value2, "adname");
            return (Criteria) this;
        }

        public Criteria andAdpasswordIsNull() {
            addCriterion("AdPassword is null");
            return (Criteria) this;
        }

        public Criteria andAdpasswordIsNotNull() {
            addCriterion("AdPassword is not null");
            return (Criteria) this;
        }

        public Criteria andAdpasswordEqualTo(String value) {
            addCriterion("AdPassword =", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordNotEqualTo(String value) {
            addCriterion("AdPassword <>", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordGreaterThan(String value) {
            addCriterion("AdPassword >", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("AdPassword >=", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordLessThan(String value) {
            addCriterion("AdPassword <", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordLessThanOrEqualTo(String value) {
            addCriterion("AdPassword <=", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordLike(String value) {
            addCriterion("AdPassword like", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordNotLike(String value) {
            addCriterion("AdPassword not like", value, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordIn(List<String> values) {
            addCriterion("AdPassword in", values, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordNotIn(List<String> values) {
            addCriterion("AdPassword not in", values, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordBetween(String value1, String value2) {
            addCriterion("AdPassword between", value1, value2, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdpasswordNotBetween(String value1, String value2) {
            addCriterion("AdPassword not between", value1, value2, "adpassword");
            return (Criteria) this;
        }

        public Criteria andAdphoneIsNull() {
            addCriterion("AdPhone is null");
            return (Criteria) this;
        }

        public Criteria andAdphoneIsNotNull() {
            addCriterion("AdPhone is not null");
            return (Criteria) this;
        }

        public Criteria andAdphoneEqualTo(String value) {
            addCriterion("AdPhone =", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotEqualTo(String value) {
            addCriterion("AdPhone <>", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneGreaterThan(String value) {
            addCriterion("AdPhone >", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneGreaterThanOrEqualTo(String value) {
            addCriterion("AdPhone >=", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLessThan(String value) {
            addCriterion("AdPhone <", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLessThanOrEqualTo(String value) {
            addCriterion("AdPhone <=", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLike(String value) {
            addCriterion("AdPhone like", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotLike(String value) {
            addCriterion("AdPhone not like", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneIn(List<String> values) {
            addCriterion("AdPhone in", values, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotIn(List<String> values) {
            addCriterion("AdPhone not in", values, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneBetween(String value1, String value2) {
            addCriterion("AdPhone between", value1, value2, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotBetween(String value1, String value2) {
            addCriterion("AdPhone not between", value1, value2, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdemailIsNull() {
            addCriterion("AdEmail is null");
            return (Criteria) this;
        }

        public Criteria andAdemailIsNotNull() {
            addCriterion("AdEmail is not null");
            return (Criteria) this;
        }

        public Criteria andAdemailEqualTo(String value) {
            addCriterion("AdEmail =", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotEqualTo(String value) {
            addCriterion("AdEmail <>", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailGreaterThan(String value) {
            addCriterion("AdEmail >", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailGreaterThanOrEqualTo(String value) {
            addCriterion("AdEmail >=", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailLessThan(String value) {
            addCriterion("AdEmail <", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailLessThanOrEqualTo(String value) {
            addCriterion("AdEmail <=", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailLike(String value) {
            addCriterion("AdEmail like", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotLike(String value) {
            addCriterion("AdEmail not like", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailIn(List<String> values) {
            addCriterion("AdEmail in", values, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotIn(List<String> values) {
            addCriterion("AdEmail not in", values, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailBetween(String value1, String value2) {
            addCriterion("AdEmail between", value1, value2, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotBetween(String value1, String value2) {
            addCriterion("AdEmail not between", value1, value2, "ademail");
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