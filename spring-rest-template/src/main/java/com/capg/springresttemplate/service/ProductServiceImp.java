package com.capg.springresttemplate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.capg.springresttemplate.entity.Product;
import com.capg.springresttemplate.repository.ProductRepository;

@Service
public class ProductServiceImp {

	
		@Autowired
	ProductRepository repo;
	
	
	public  Product  addProduct(Product product) {
		
		
		return repo.save(product);
		
		
	}

	public Product  findByPid(@PathVariable long id) {
		
		return  repo.findById(id).orElse(null);
		
	}
	
	
	
	public  List<Product>  getAllProduct(){
		
			return repo.findAll();
		
	}
	
	
	
	public static  boolean   validateProduct(Product product) {
		
		boolean flag = false;	
		
			if(product.getProductName().length() > 5 && product.getPrice() > 0) {
				
				flag = true;
				
				
				
			}
		
		return flag;
	}
	
	
	
	
	
	
	
	
	
}
