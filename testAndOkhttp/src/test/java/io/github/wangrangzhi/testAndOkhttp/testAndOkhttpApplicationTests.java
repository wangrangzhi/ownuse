package io.github.wangrangzhi.testAndOkhttp;

import cn.hutool.core.lang.Console;
import cn.hutool.core.thread.ConcurrencyTester;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import io.github.wangrangzhi.commonDto.goodsDto.MiaoshaDto;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
class testAndOkhttpApplicationTests {

    private static final OkHttpClient okHttpClient = new OkHttpClient();


    public long test1() throws IOException {

        MiaoshaDto miaoshaDto = new MiaoshaDto();

        miaoshaDto.setId(IdUtil.simpleUUID());
        miaoshaDto.setBuyingtime(new Date());
        miaoshaDto.setRandomId(String.valueOf(RandomUtil.randomInt(1, 5)));
        miaoshaDto.setBuyerid("王喆" + RandomUtil.randomInt(1, 500));
        miaoshaDto.setGoodsid("hello");
        miaoshaDto.setBuyingamount(RandomUtil.randomInt(1, 30));

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        miaoshaDto.setGoodsid(RandomUtil.randomEle(stringList));

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
        log.info(response.body().string());
        return 1l;
    }

    public long test2() throws IOException {

        MiaoshaDto miaoshaDto = new MiaoshaDto();

        miaoshaDto.setId(IdUtil.simpleUUID());
        miaoshaDto.setBuyingtime(new Date());
        miaoshaDto.setRandomId(String.valueOf(RandomUtil.randomInt(1, 5)));
        miaoshaDto.setBuyerid("王喆" + RandomUtil.randomInt(1, 500));
        miaoshaDto.setGoodsid("hello");
        miaoshaDto.setBuyingamount(RandomUtil.randomInt(1, 30));

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        miaoshaDto.setGoodsid(RandomUtil.randomEle(stringList));

        JSON jsonObject = JSONUtil.parse(miaoshaDto);

        log.info(jsonObject.toStringPretty());


        String testUrl = "http://localhost:40216/order/miaosharedis";

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"), jsonObject.toString());

        Request request = new Request.Builder()
                .url(testUrl)
                .post(body)
                .build();

        Call call = okHttpClient.newCall(request);

        Response response = call.execute();
        log.info(response.toString());
        log.info(response.body().string());
        return 1l;
    }

    @Test
    public void sny()  throws IOException {
        ConcurrencyTester tester = ThreadUtil.concurrencyTest(1, () -> {
            // 测试的逻辑内容
            long delay = 0;
            try {

                for(int i = 0 ;i<50;i++){
                    delay = test2();
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
            ThreadUtil.sleep(200);
            Console.log("{} test finished, delay: {}", Thread.currentThread().getName(), delay);
        });

// 获取总的执行时间，单位毫秒
        Console.log(tester.getInterval());

    }


}
