package io.github.wangrangzhi.goods.service.Impl;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.IdUtil;
import io.github.wangrangzhi.commonDto.goodsDto.BuyingResultDto;
import io.github.wangrangzhi.commonDto.goodsDto.MiaoshaDto;
import io.github.wangrangzhi.goods.dao.GoodsProduct;
import io.github.wangrangzhi.goods.dao.GoodsProductExample;
import io.github.wangrangzhi.goods.dao.OrderProduct;
import io.github.wangrangzhi.goods.mapper.GoodsProductMapper;
import io.github.wangrangzhi.goods.mapper.OrderProductMapper;
import io.github.wangrangzhi.goods.service.OrderProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;

@Service
@Slf4j
public class OrderProductServiceImpl implements OrderProductService {

    @Autowired
    private OrderProductMapper orderProductMapper;

    @Autowired
    private GoodsProductMapper goodsProductMapper;


    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
    public BuyingResultDto handlTheUserBuyingAction(MiaoshaDto miaoshaDto) {

        BuyingResultDto buyingResultDto = new BuyingResultDto();
        String goodsid = miaoshaDto.getGoodsid();

        GoodsProductExample goodsProductExample = new GoodsProductExample();
        GoodsProductExample.Criteria criteria = goodsProductExample.createCriteria();
        criteria.andGoodsidEqualTo(goodsid);

        List<GoodsProduct> goodsProductList = goodsProductMapper.selectByExample(goodsProductExample);


        if (goodsProductList.size() < 1) {

            buyingResultDto.setBuyingResult(false);
            buyingResultDto.setMessage("商品不存在");
            return buyingResultDto;
        }

        if (goodsProductList.get(0).getStore() < miaoshaDto.getBuyingamount()) {
            buyingResultDto.setBuyingResult(false);
            buyingResultDto.setMessage("商品库存不够");
            log.info("miaoshaDto:" + miaoshaDto.getBuyingamount() + ",goodsProductList.get(0).getStore()" + goodsProductList.get(0).getStore());
            return buyingResultDto;
        }


        OrderProduct orderProduct = new OrderProduct();
        BeanUtil.copyProperties(miaoshaDto, orderProduct);
        orderProduct.setId(IdUtil.simpleUUID());


        GoodsProduct goodsProduct = new GoodsProduct();
        goodsProduct.setId(goodsProductList.get(0).getId());
        goodsProduct.setStore(goodsProductList.get(0).getStore() - miaoshaDto.getBuyingamount());


        int insert = orderProductMapper.insert(orderProduct);

        int i = goodsProductMapper.updateByPrimaryKeySelective(goodsProduct);

        if (i == 1 && insert == 1) {
            buyingResultDto.setBuyingResult(true);
            buyingResultDto.setMessage("商品购买成功");
            return buyingResultDto;
        } else {
            buyingResultDto.setBuyingResult(false);
            buyingResultDto.setMessage("商品购买未成功");
            return buyingResultDto;
        }


    }


    public   Jedis jedis = getJedis();

    public  Jedis getJedis() {
        JedisPool pool = new JedisPool("localhost", 6379);

        Jedis jedis = pool.getResource();


        return jedis;

    }



    @Override
    public BuyingResultDto handlTheUserBuyingActionByRedis(MiaoshaDto miaoshaDto) {

        BuyingResultDto buyingResultDto = new BuyingResultDto();
        String goodsid = miaoshaDto.getGoodsid();

        int left = Integer.parseInt(jedis.get(goodsid));
        if (left < 1) {
            buyingResultDto.setBuyingResult(false);
            buyingResultDto.setMessage("商品库存不够");
            log.info("miaoshaDto:" + miaoshaDto.getBuyingamount() + ",left:" + left);
            return buyingResultDto;
        }


        OrderProduct orderProduct = new OrderProduct();
        BeanUtil.copyProperties(miaoshaDto, orderProduct);
        orderProduct.setId(IdUtil.simpleUUID());


        GoodsProduct goodsProduct = new GoodsProduct();

        jedis.set(goodsid, String.valueOf(left - miaoshaDto.getBuyingamount()));


        int insert = orderProductMapper.insert(orderProduct);

        log.info("redis:"+goodsid+",left:"+jedis.get(goodsid));

        buyingResultDto.setBuyingResult(true);
        buyingResultDto.setMessage("商品购买成功");
        return buyingResultDto;


    }
}
