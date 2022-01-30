package io.github.wangrangzhi.goods;

import cn.hutool.core.util.IdUtil;
import io.github.wangrangzhi.goods.dao.GoodsProduct;
import io.github.wangrangzhi.goods.dao.OrderProduct;
import io.github.wangrangzhi.goods.dao.OrderProductExample;
import io.github.wangrangzhi.goods.mapper.GoodsProductMapper;
import io.github.wangrangzhi.goods.mapper.OrderProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j

@SpringBootTest(classes = GoodsApplication.class)

@RunWith(SpringRunner.class)
class goodsApplicationTests {

	@Autowired
	private GoodsProductMapper goodsproductmapper;

	@Autowired
	private OrderProductMapper orderProductMapper;

	@Test
	void contextLoads() {


		GoodsProduct goodsProduct = new GoodsProduct();
		goodsProduct.setId(IdUtil.simpleUUID());

		goodsproductmapper.insertSelective(goodsProduct);

		OrderProduct orderProduct = new OrderProduct();
		orderProduct.setId(IdUtil.simpleUUID());
		orderProductMapper.insertSelective(orderProduct);



	}

}
