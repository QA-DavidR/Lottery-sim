package com.qa.lottery;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LotteryApplication {

	public static void main(String[] args) {
		//System.out.println(SpringApplication.run(LotteryApplication.class, args).getBean("dateTimeNow", String.class));
		//SpringApplication.run(LotteryApplication.class, args).getBean("greeting");
		System.out.println(SpringApplication.run(LotteryApplication.class, args).containsBean("dateTimeNow"));
	}

	@Bean
	public String greeting() {
		return "Hello World!";
	}
	@Bean
	public LocalTime dateTimeNow() {
		return LocalTime.now();
	}
	
}
