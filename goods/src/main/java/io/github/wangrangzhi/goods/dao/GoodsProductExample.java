package io.github.wangrangzhi.goods.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsProductExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRandomidIsNull() {
            addCriterion("randomId is null");
            return (Criteria) this;
        }

        public Criteria andRandomidIsNotNull() {
            addCriterion("randomId is not null");
            return (Criteria) this;
        }

        public Criteria andRandomidEqualTo(String value) {
            addCriterion("randomId =", value, "randomid");
            return (Criteria) this;
        }

        public Criteria andRandomidNotEqualTo(String value) {
            addCriterion("randomId <>", value, "randomid");
            return (Criteria) this;
        }

        public Criteria andRandomidGreaterThan(String value) {
            addCriterion("randomId >", value, "randomid");
            return (Criteria) this;
        }

        public Criteria andRandomidGreaterThanOrEqualTo(String value) {
            addCriterion("randomId >=", value, "randomid");
            return (Criteria) this;
        }

        public Criteria andRandomidLessThan(String value) {
            addCriterion("randomId <", value, "randomid");
            return (Criteria) this;
        }

        public Criteria andRandomidLessThanOrEqualTo(String value) {
            addCriterion("randomId <=", value, "randomid");
            return (Criteria) this;
        }

        public Criteria andRandomidLike(String value) {
            addCriterion("randomId like", value, "randomid");
            return (Criteria) this;
        }

        public Criteria andRandomidNotLike(String value) {
            addCriterion("randomId not like", value, "randomid");
            return (Criteria) this;
        }

        public Criteria andRandomidIn(List<String> values) {
            addCriterion("randomId in", values, "randomid");
            return (Criteria) this;
        }

        public Criteria andRandomidNotIn(List<String> values) {
            addCriterion("randomId not in", values, "randomid");
            return (Criteria) this;
        }

        public Criteria andRandomidBetween(String value1, String value2) {
            addCriterion("randomId between", value1, value2, "randomid");
            return (Criteria) this;
        }

        public Criteria andRandomidNotBetween(String value1, String value2) {
            addCriterion("randomId not between", value1, value2, "randomid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSendintimeIsNull() {
            addCriterion("sendInTime is null");
            return (Criteria) this;
        }

        public Criteria andSendintimeIsNotNull() {
            addCriterion("sendInTime is not null");
            return (Criteria) this;
        }

        public Criteria andSendintimeEqualTo(Date value) {
            addCriterion("sendInTime =", value, "sendintime");
            return (Criteria) this;
        }

        public Criteria andSendintimeNotEqualTo(Date value) {
            addCriterion("sendInTime <>", value, "sendintime");
            return (Criteria) this;
        }

        public Criteria andSendintimeGreaterThan(Date value) {
            addCriterion("sendInTime >", value, "sendintime");
            return (Criteria) this;
        }

        public Criteria andSendintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendInTime >=", value, "sendintime");
            return (Criteria) this;
        }

        public Criteria andSendintimeLessThan(Date value) {
            addCriterion("sendInTime <", value, "sendintime");
            return (Criteria) this;
        }

        public Criteria andSendintimeLessThanOrEqualTo(Date value) {
            addCriterion("sendInTime <=", value, "sendintime");
            return (Criteria) this;
        }

        public Criteria andSendintimeIn(List<Date> values) {
            addCriterion("sendInTime in", values, "sendintime");
            return (Criteria) this;
        }

        public Criteria andSendintimeNotIn(List<Date> values) {
            addCriterion("sendInTime not in", values, "sendintime");
            return (Criteria) this;
        }

        public Criteria andSendintimeBetween(Date value1, Date value2) {
            addCriterion("sendInTime between", value1, value2, "sendintime");
            return (Criteria) this;
        }

        public Criteria andSendintimeNotBetween(Date value1, Date value2) {
            addCriterion("sendInTime not between", value1, value2, "sendintime");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(String value) {
            addCriterion("goodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(String value) {
            addCriterion("goodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(String value) {
            addCriterion("goodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(String value) {
            addCriterion("goodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(String value) {
            addCriterion("goodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(String value) {
            addCriterion("goodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLike(String value) {
            addCriterion("goodsId like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotLike(String value) {
            addCriterion("goodsId not like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<String> values) {
            addCriterion("goodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<String> values) {
            addCriterion("goodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(String value1, String value2) {
            addCriterion("goodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(String value1, String value2) {
            addCriterion("goodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andUserlocationIsNull() {
            addCriterion("userlocation is null");
            return (Criteria) this;
        }

        public Criteria andUserlocationIsNotNull() {
            addCriterion("userlocation is not null");
            return (Criteria) this;
        }

        public Criteria andUserlocationEqualTo(String value) {
            addCriterion("userlocation =", value, "userlocation");
            return (Criteria) this;
        }

        public Criteria andUserlocationNotEqualTo(String value) {
            addCriterion("userlocation <>", value, "userlocation");
            return (Criteria) this;
        }

        public Criteria andUserlocationGreaterThan(String value) {
            addCriterion("userlocation >", value, "userlocation");
            return (Criteria) this;
        }

        public Criteria andUserlocationGreaterThanOrEqualTo(String value) {
            addCriterion("userlocation >=", value, "userlocation");
            return (Criteria) this;
        }

        public Criteria andUserlocationLessThan(String value) {
            addCriterion("userlocation <", value, "userlocation");
            return (Criteria) this;
        }

        public Criteria andUserlocationLessThanOrEqualTo(String value) {
            addCriterion("userlocation <=", value, "userlocation");
            return (Criteria) this;
        }

        public Criteria andUserlocationLike(String value) {
            addCriterion("userlocation like", value, "userlocation");
            return (Criteria) this;
        }

        public Criteria andUserlocationNotLike(String value) {
            addCriterion("userlocation not like", value, "userlocation");
            return (Criteria) this;
        }

        public Criteria andUserlocationIn(List<String> values) {
            addCriterion("userlocation in", values, "userlocation");
            return (Criteria) this;
        }

        public Criteria andUserlocationNotIn(List<String> values) {
            addCriterion("userlocation not in", values, "userlocation");
            return (Criteria) this;
        }

        public Criteria andUserlocationBetween(String value1, String value2) {
            addCriterion("userlocation between", value1, value2, "userlocation");
            return (Criteria) this;
        }

        public Criteria andUserlocationNotBetween(String value1, String value2) {
            addCriterion("userlocation not between", value1, value2, "userlocation");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIsNull() {
            addCriterion("goodsType is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIsNotNull() {
            addCriterion("goodsType is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeEqualTo(String value) {
            addCriterion("goodsType =", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotEqualTo(String value) {
            addCriterion("goodsType <>", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeGreaterThan(String value) {
            addCriterion("goodsType >", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeGreaterThanOrEqualTo(String value) {
            addCriterion("goodsType >=", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeLessThan(String value) {
            addCriterion("goodsType <", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeLessThanOrEqualTo(String value) {
            addCriterion("goodsType <=", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeLike(String value) {
            addCriterion("goodsType like", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotLike(String value) {
            addCriterion("goodsType not like", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIn(List<String> values) {
            addCriterion("goodsType in", values, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotIn(List<String> values) {
            addCriterion("goodsType not in", values, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeBetween(String value1, String value2) {
            addCriterion("goodsType between", value1, value2, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotBetween(String value1, String value2) {
            addCriterion("goodsType not between", value1, value2, "goodstype");
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

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStoreIsNull() {
            addCriterion("store is null");
            return (Criteria) this;
        }

        public Criteria andStoreIsNotNull() {
            addCriterion("store is not null");
            return (Criteria) this;
        }

        public Criteria andStoreEqualTo(Integer value) {
            addCriterion("store =", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotEqualTo(Integer value) {
            addCriterion("store <>", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThan(Integer value) {
            addCriterion("store >", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("store >=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThan(Integer value) {
            addCriterion("store <", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThanOrEqualTo(Integer value) {
            addCriterion("store <=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreIn(List<Integer> values) {
            addCriterion("store in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotIn(List<Integer> values) {
            addCriterion("store not in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreBetween(Integer value1, Integer value2) {
            addCriterion("store between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotBetween(Integer value1, Integer value2) {
            addCriterion("store not between", value1, value2, "store");
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