package com.capg.springresttemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.springresttemplate.entity.Product;



@RestController
public class RestTesting {
	
	@Autowired
	RestTemplate restTemplate;
	
	
		@GetMapping("/test")
		public  ResponseEntity<Product>  testAdd() {
			
			Product product = new Product();
			
				product.setProductName("toys");
				product.setPrice(500);
			
			return	restTemplate.postForEntity("http://localhost:9191/api/product/add", product,Product.class);
			
			
			
		}
		
		
		
		
		@GetMapping("/test-all")
		public  List<Product>  testGetAll() {
		
			
			return	restTemplate.getForObject("http://localhost:9191/api/product/get-all", List.class);
			
		
			
		}
	
		
		
		
		
		
	
	

}
