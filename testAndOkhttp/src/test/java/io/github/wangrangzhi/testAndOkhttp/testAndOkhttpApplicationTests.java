package io.github.wangrangzhi.testAndOkhttp;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import io.github.wangrangzhi.commonDto.goodsDto.MiaoshaDto;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Date;

@Slf4j
class testAndOkhttpApplicationTests {

    private static final OkHttpClient okHttpClient = new OkHttpClient();

    @Test
    public void test1() throws IOException {
        for (int i = 0; i < 40; i++) {
            MiaoshaDto miaoshaDto = new MiaoshaDto();

            miaoshaDto.setGoodsId(IdUtil.simpleUUID());
            miaoshaDto.setSendInTime(new Date());
            miaoshaDto.setRandomId(String.valueOf(RandomUtil.randomInt(10, 40)));
            miaoshaDto.setUserId("王喆");

            JSON jsonObject = JSONUtil.parse(miaoshaDto);

            log.info(jsonObject.toStringPretty());


            String testUrl = "http://localhost:40216/order/miaosha";

            RequestBody body = RequestBody.create(
                    MediaType.parse("application/json"), jsonObject.toString());

            Request request = new Request.Builder()
                    .url(testUrl)
                    .post(body)
                    .build();

            Call call = okHttpClient.newCall(request);

            Response response = call.execute();
            log.info(response.toString());
        }







    }

}
