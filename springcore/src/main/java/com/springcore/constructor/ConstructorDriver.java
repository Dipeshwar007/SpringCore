package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.xmlLifecycle.PepsiInterface;

public class ConstructorDriver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/ConstructorConfig.xml");
		
		Person P1  = (Person) context.getBean("person");
		
		System.out.println(P1);
		
	}
}
