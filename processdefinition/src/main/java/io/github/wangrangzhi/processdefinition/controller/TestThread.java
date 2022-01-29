package io.github.wangrangzhi.processdefinition.controller;

import io.github.wangrangzhi.processdefinition.service.impl.ThreadDemo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev-api/vue-admin-template/TestThread")

@Slf4j
public class TestThread {
    @PostMapping("/main")
    public void main() {


        ThreadDemo T1 = new ThreadDemo();
        T1.start();

        ThreadDemo T2 = new ThreadDemo();
        T2.start();
    }
}