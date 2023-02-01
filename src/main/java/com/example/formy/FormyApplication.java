package com.example.formy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class FormyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormyApplication.class, args);
	}

}
