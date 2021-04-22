package com.capg.springresttemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.springresttemplate.entity.Customer;
import com.capg.springresttemplate.entity.Product;
import com.capg.springresttemplate.entity.ResponseType;
import com.capg.springresttemplate.repository.CustomerRepository;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
			@Autowired
		CustomerRepository repo;
			
			@Autowired
			RestTemplate restTemplate;
	
		
		@PostMapping("/add")
		public Customer addCustomer(@RequestBody  Customer customer) {
			
			//dsfsdgsd
			return	repo.save(customer);
			
			
			
		}
		
		
		@GetMapping("/get/{id}")
		public  ResponseType      findByCid(@PathVariable long id) {
			
			
				Customer customer =	repo.findById(id).orElse(null);
			
				long pid =	customer.getPid();
				
				
			Product product =	restTemplate.getForObject("http://localhost:9191/api/product/get-product/"+pid, Product.class);
			
		
			ResponseType  response =  new ResponseType();
			
			
				response.setCustomer(customer);
				response.setProduct(product);
			
			
				return response;
		}
		
		
		@GetMapping("/get-all-customers")
		public  List<Customer> getAllCustomer(){
			
			return repo.findAll();
			
		}
		
		
		
	
	

}
