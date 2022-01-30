package io.github.wangrangzhi.goods.controller;

import io.github.wangrangzhi.commonDto.goodsDto.MiaoshaDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")

@Slf4j
public class orderController {


    @RequestMapping("/miaosha")
    public String miaosha(@RequestBody MiaoshaDto miaoshaDto ) throws Exception {


        log.info("miaoshadto:"+miaoshaDto.toString());



        return null;


    }

    @RequestMapping("/test1")
    public String test1() throws Exception {


        //language=JSON
        String a = " {\"code\":20000,\"data\":" +
                "{\"roles\":[\"admin\"]," +
                "\"introduction\":\"I am a super administrator\"," +
                "\"avatar\":\"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif\"," +
                "\"name\":\"Super Admin\"}}";


        return a;


    }

}
