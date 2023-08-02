package com.springcore.annotation.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/annotation/autowire/atuowire.xml");

		Emp emp1 = context.getBean("emp", Emp.class);
		System.out.println(emp1);
	}
}
