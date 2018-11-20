package com.endava.springHomeworkFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringHomeworkFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHomeworkFeignApplication.class, args);
	}
}
