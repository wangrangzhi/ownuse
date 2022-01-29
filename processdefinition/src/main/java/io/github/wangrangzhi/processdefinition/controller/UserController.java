package io.github.wangrangzhi.processdefinition.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev-api/vue-admin-template/user")

@Slf4j
public class UserController {


    @RequestMapping("/login")
    public String login() throws Exception {


        //language=JSON
        String a = " {\"code\":20000,\"data\":{\"token\":\"admin-token\"}}";


        return a;


    }

    @RequestMapping("/info")
    public String info() throws Exception {


        //language=JSON
        String a = " {\"code\":20000,\"data\":" +
                "{\"roles\":[\"admin\"]," +
                "\"introduction\":\"I am a super administrator\"," +
                "\"avatar\":\"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif\"," +
                "\"name\":\"Super Admin\"}}";


        return a;


    }

}
