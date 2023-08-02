package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/collection/EmployeCollection.xml");
		
		Employee emp1 = (Employee) context.getBean("newEmployee");
		
		System.out.println(emp1);
	}
}
