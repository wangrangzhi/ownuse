package io.github.wangrangzhi.goods.service;

import io.github.wangrangzhi.commonDto.goodsDto.BuyingResultDto;
import io.github.wangrangzhi.commonDto.goodsDto.MiaoshaDto;

public interface OrderProductService {
    BuyingResultDto handlTheUserBuyingAction(MiaoshaDto miaoshaDto);

    BuyingResultDto handlTheUserBuyingActionByRedis(MiaoshaDto miaoshaDto);
}
