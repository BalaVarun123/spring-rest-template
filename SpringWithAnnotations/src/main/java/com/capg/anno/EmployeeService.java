package com.capg.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository  repo;
	
	@Autowired
	Employee emp1;
	
	
	public EmployeeService() {
		//System.out.println("autowired emp1" +emp1);
	}
	
	public void getRepo() {
		
		System.out.println(repo);
		
	}

}
