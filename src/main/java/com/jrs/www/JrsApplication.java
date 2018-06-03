package com.jrs.www;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableScheduling
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.jrs.www.dao")
public class JrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JrsApplication.class, args);
	}
}
