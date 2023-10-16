package com.dh.rest.api.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dh.rest.api.*")
public class AccountApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApiApplication.class, args);
	}

}
