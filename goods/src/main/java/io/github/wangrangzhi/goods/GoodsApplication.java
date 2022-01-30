package io.github.wangrangzhi.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("io.github.wangrangzhi.goods.mapper")
public class GoodsApplication {


	public static void main(String[] args) {
		SpringApplication.run(GoodsApplication.class, args);
	}

}
