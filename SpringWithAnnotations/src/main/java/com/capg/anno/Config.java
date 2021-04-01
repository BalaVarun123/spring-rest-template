package com.capg.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config {
	
	
	@Bean("emp2")
	public Employee getEmployee() {
		return new Employee();
	}
	
}
