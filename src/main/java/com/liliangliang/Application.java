package com.liliangliang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
// 定时器开启
@EnableScheduling
@MapperScan("com.liliangliang.core.dao")
public class Application{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}