package com.cts.RatingsMicroServiceSDET;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.cts.controller","com.cts.model","com.cts.service"})
public class RatingsMicroServiceSdetApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingsMicroServiceSdetApplication.class, args);
	}

}
