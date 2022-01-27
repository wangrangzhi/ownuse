package io.github.wangrangzhi.processdefinition;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("io.github.wangrangzhi.processdefinition.mapper")

public class ProcessDefinitionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessDefinitionApplication.class, args);
	}

}
