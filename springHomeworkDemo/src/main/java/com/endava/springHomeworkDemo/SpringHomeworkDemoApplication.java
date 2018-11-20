package com.endava.springHomeworkDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHomeworkDemoApplication implements CommandLineRunner {

	@Autowired
	PhoneService phoneService;

	public static void main(String[] args) {
		SpringApplication.run(SpringHomeworkDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Phone u = new Phone();
		u.setCompany("Samsung");
		u.setModel("S10");
		phoneService.save(u);
		u = new Phone();
		u.setCompany("Iphone");
		u.setModel("XS");
		phoneService.save(u);
	}
}
