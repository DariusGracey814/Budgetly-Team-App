package com.budgetly.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Application  {
	
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(Application.class);
	// extends SpringBootServletInitializer
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
