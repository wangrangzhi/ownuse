package io.github.wangrangzhi.maillist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("io.github.wangrangzhi.maillist.mapper")

public class MailListApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailListApplication.class, args);
    }

}
