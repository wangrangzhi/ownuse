package io.github.wangrangzhi.goods.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderProductExample() {
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

        public Criteria andBuyeridIsNull() {
            addCriterion("buyerid is null");
            return (Criteria) this;
        }

        public Criteria andBuyeridIsNotNull() {
            addCriterion("buyerid is not null");
            return (Criteria) this;
        }

        public Criteria andBuyeridEqualTo(String value) {
            addCriterion("buyerid =", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotEqualTo(String value) {
            addCriterion("buyerid <>", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridGreaterThan(String value) {
            addCriterion("buyerid >", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridGreaterThanOrEqualTo(String value) {
            addCriterion("buyerid >=", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridLessThan(String value) {
            addCriterion("buyerid <", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridLessThanOrEqualTo(String value) {
            addCriterion("buyerid <=", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridLike(String value) {
            addCriterion("buyerid like", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotLike(String value) {
            addCriterion("buyerid not like", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridIn(List<String> values) {
            addCriterion("buyerid in", values, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotIn(List<String> values) {
            addCriterion("buyerid not in", values, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridBetween(String value1, String value2) {
            addCriterion("buyerid between", value1, value2, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotBetween(String value1, String value2) {
            addCriterion("buyerid not between", value1, value2, "buyerid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(String value) {
            addCriterion("goodsid =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(String value) {
            addCriterion("goodsid <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(String value) {
            addCriterion("goodsid >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(String value) {
            addCriterion("goodsid >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(String value) {
            addCriterion("goodsid <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(String value) {
            addCriterion("goodsid <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLike(String value) {
            addCriterion("goodsid like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotLike(String value) {
            addCriterion("goodsid not like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<String> values) {
            addCriterion("goodsid in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<String> values) {
            addCriterion("goodsid not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(String value1, String value2) {
            addCriterion("goodsid between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(String value1, String value2) {
            addCriterion("goodsid not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andBuyingtimeIsNull() {
            addCriterion("buyingtime is null");
            return (Criteria) this;
        }

        public Criteria andBuyingtimeIsNotNull() {
            addCriterion("buyingtime is not null");
            return (Criteria) this;
        }

        public Criteria andBuyingtimeEqualTo(Date value) {
            addCriterion("buyingtime =", value, "buyingtime");
            return (Criteria) this;
        }

        public Criteria andBuyingtimeNotEqualTo(Date value) {
            addCriterion("buyingtime <>", value, "buyingtime");
            return (Criteria) this;
        }

        public Criteria andBuyingtimeGreaterThan(Date value) {
            addCriterion("buyingtime >", value, "buyingtime");
            return (Criteria) this;
        }

        public Criteria andBuyingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("buyingtime >=", value, "buyingtime");
            return (Criteria) this;
        }

        public Criteria andBuyingtimeLessThan(Date value) {
            addCriterion("buyingtime <", value, "buyingtime");
            return (Criteria) this;
        }

        public Criteria andBuyingtimeLessThanOrEqualTo(Date value) {
            addCriterion("buyingtime <=", value, "buyingtime");
            return (Criteria) this;
        }

        public Criteria andBuyingtimeIn(List<Date> values) {
            addCriterion("buyingtime in", values, "buyingtime");
            return (Criteria) this;
        }

        public Criteria andBuyingtimeNotIn(List<Date> values) {
            addCriterion("buyingtime not in", values, "buyingtime");
            return (Criteria) this;
        }

        public Criteria andBuyingtimeBetween(Date value1, Date value2) {
            addCriterion("buyingtime between", value1, value2, "buyingtime");
            return (Criteria) this;
        }

        public Criteria andBuyingtimeNotBetween(Date value1, Date value2) {
            addCriterion("buyingtime not between", value1, value2, "buyingtime");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIsNull() {
            addCriterion("goodstype is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIsNotNull() {
            addCriterion("goodstype is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeEqualTo(String value) {
            addCriterion("goodstype =", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotEqualTo(String value) {
            addCriterion("goodstype <>", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeGreaterThan(String value) {
            addCriterion("goodstype >", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeGreaterThanOrEqualTo(String value) {
            addCriterion("goodstype >=", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeLessThan(String value) {
            addCriterion("goodstype <", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeLessThanOrEqualTo(String value) {
            addCriterion("goodstype <=", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeLike(String value) {
            addCriterion("goodstype like", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotLike(String value) {
            addCriterion("goodstype not like", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIn(List<String> values) {
            addCriterion("goodstype in", values, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotIn(List<String> values) {
            addCriterion("goodstype not in", values, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeBetween(String value1, String value2) {
            addCriterion("goodstype between", value1, value2, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotBetween(String value1, String value2) {
            addCriterion("goodstype not between", value1, value2, "goodstype");
            return (Criteria) this;
        }

        public Criteria andBuyingamountIsNull() {
            addCriterion("buyingamount is null");
            return (Criteria) this;
        }

        public Criteria andBuyingamountIsNotNull() {
            addCriterion("buyingamount is not null");
            return (Criteria) this;
        }

        public Criteria andBuyingamountEqualTo(Integer value) {
            addCriterion("buyingamount =", value, "buyingamount");
            return (Criteria) this;
        }

        public Criteria andBuyingamountNotEqualTo(Integer value) {
            addCriterion("buyingamount <>", value, "buyingamount");
            return (Criteria) this;
        }

        public Criteria andBuyingamountGreaterThan(Integer value) {
            addCriterion("buyingamount >", value, "buyingamount");
            return (Criteria) this;
        }

        public Criteria andBuyingamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyingamount >=", value, "buyingamount");
            return (Criteria) this;
        }

        public Criteria andBuyingamountLessThan(Integer value) {
            addCriterion("buyingamount <", value, "buyingamount");
            return (Criteria) this;
        }

        public Criteria andBuyingamountLessThanOrEqualTo(Integer value) {
            addCriterion("buyingamount <=", value, "buyingamount");
            return (Criteria) this;
        }

        public Criteria andBuyingamountIn(List<Integer> values) {
            addCriterion("buyingamount in", values, "buyingamount");
            return (Criteria) this;
        }

        public Criteria andBuyingamountNotIn(List<Integer> values) {
            addCriterion("buyingamount not in", values, "buyingamount");
            return (Criteria) this;
        }

        public Criteria andBuyingamountBetween(Integer value1, Integer value2) {
            addCriterion("buyingamount between", value1, value2, "buyingamount");
            return (Criteria) this;
        }

        public Criteria andBuyingamountNotBetween(Integer value1, Integer value2) {
            addCriterion("buyingamount not between", value1, value2, "buyingamount");
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