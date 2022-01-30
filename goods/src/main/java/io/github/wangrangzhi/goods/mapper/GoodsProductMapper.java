package io.github.wangrangzhi.goods.mapper;

import io.github.wangrangzhi.goods.dao.GoodsProduct;
import io.github.wangrangzhi.goods.dao.GoodsProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsProductMapper {
    int countByExample(GoodsProductExample example);

    int deleteByExample(GoodsProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsProduct record);

    int insertSelective(GoodsProduct record);

    List<io.github.wangrangzhi.goods.dao.GoodsProduct> selectByExample(GoodsProductExample example);

    GoodsProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsProduct record, @Param("example") GoodsProductExample example);

    int updateByExample(@Param("record") GoodsProduct record, @Param("example") GoodsProductExample example);

    int updateByPrimaryKeySelective(GoodsProduct record);

    int updateByPrimaryKey(GoodsProduct record);
}