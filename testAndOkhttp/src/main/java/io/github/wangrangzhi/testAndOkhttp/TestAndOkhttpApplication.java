package io.github.wangrangzhi.testAndOkhttp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestAndOkhttpApplication {


	public static void main(String[] args) {
		SpringApplication.run(TestAndOkhttpApplication.class, args);
	}

}
