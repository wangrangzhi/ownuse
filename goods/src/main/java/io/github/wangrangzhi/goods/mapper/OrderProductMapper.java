package io.github.wangrangzhi.goods.mapper;


import io.github.wangrangzhi.goods.dao.OrderProduct;
import io.github.wangrangzhi.goods.dao.OrderProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderProductMapper {
    int countByExample(OrderProductExample example);

    int deleteByExample(OrderProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderProduct record);

    int insertSelective(OrderProduct record);

    List<io.github.wangrangzhi.goods.dao.OrderProduct> selectByExample(OrderProductExample example);

    OrderProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderProduct record, @Param("example") OrderProductExample example);

    int updateByExample(@Param("record") OrderProduct record, @Param("example") OrderProductExample example);

    int updateByPrimaryKeySelective(OrderProduct record);

    int updateByPrimaryKey(OrderProduct record);
}