package com.capg.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.capg.anno")
public class Client {

		
	
		
		
	
	public static void main(String[] args) {


		
		//System.out.println("Hello.");
			ApplicationContext context = new AnnotationConfigApplicationContext(Client.class);
		
			
				EmployeeService service =	context.getBean(EmployeeService.class);
			
				
					System.out.println(service);
					
					service.getRepo();
			
			

				System.out.println();
			
			
			
				Employee emp =	context.getBean("emp",Employee.class);
				
				System.out.println(emp);
			
		/*
		 * emp.setEid(101); emp.setEname("javeed");
		 */
				
			//	System.out.println(emp.getEid() +"  "+emp.getEname());
				
				System.out.println(emp.getEid());
	
	
				System.out.println(emp.getEname());	
				
				System.out.println(context.getBean("emp2"));
	
	}

}
