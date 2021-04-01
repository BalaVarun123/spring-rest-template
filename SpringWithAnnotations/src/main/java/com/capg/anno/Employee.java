package com.capg.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("emp")
//@Controller
//@Repository
//@Service
public class Employee {
	
	@Value("101")
	private int eid;
	
	@Value("king")
	private String ename;
	
	public Employee() {
		
		
	}
	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	
	
	

}
