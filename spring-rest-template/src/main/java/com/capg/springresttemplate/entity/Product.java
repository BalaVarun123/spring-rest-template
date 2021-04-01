package com.capg.springresttemplate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public  class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  long pid;
	private  String productName;
	private  double price;
	
	public Product() {
		
	}
	
	
	
	public Product(long pid, String productName, double price) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.price = price;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
	
	
}
