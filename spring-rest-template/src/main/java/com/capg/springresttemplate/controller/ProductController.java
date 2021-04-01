package com.capg.springresttemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springresttemplate.entity.Product;
import com.capg.springresttemplate.service.ProductServiceImp;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
		
	@Autowired	
	ProductServiceImp service;
		
		
	
			@PostMapping("/add")
			public  ResponseEntity<Object>  addProduct(@RequestBody Product product) {
				
				Product pro = null;
				ResponseEntity<Object> response = null;
				
						if(ProductServiceImp.validateProduct(product)) {
						pro = service.addProduct(product);
						
						response =	new ResponseEntity(pro,HttpStatus.ACCEPTED);
							
						}
						else {
							
						response =	new ResponseEntity("Product Insert Failed!",HttpStatus.BAD_REQUEST);
							
						}
				
				
				return response;  
				
				
			
				
				
			}
	
			
			
			@GetMapping("/get-all")
			public  List<Product>  getAllProduct(){
				
				
				return	service.getAllProduct();
				
			}
			
			
			@GetMapping("/get-product/{id}")
			public Product  findByPid(@PathVariable long id) {
				
				return service.findByPid(id);
				
			}
			
	
	
	

}
