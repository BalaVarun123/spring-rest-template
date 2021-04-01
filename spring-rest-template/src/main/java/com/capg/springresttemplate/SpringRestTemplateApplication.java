package com.capg.springresttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.capg.springresttemplate.controller.RestTesting;

@SpringBootApplication
public class SpringRestTemplateApplication {

	public static void main(String[] args) {
	
		//aaa//aaaaaaaa21331231
ApplicationContext context =		SpringApplication.run(SpringRestTemplateApplication.class, args);
	
				
	
	
	
	}

	
	@Bean
	public  RestTemplate  getRestTemplate() {
		
		return new RestTemplate();
		
		
	}
	
	
}
