package com.cts.MoviesMicroServiceSDET;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.cts.controller","com.cts.model","com.cts.service"})
public class MoviesMicroServiceSdetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesMicroServiceSdetApplication.class, args);
	}

}
