package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/standalone.xml");

		Person standaloneperson = context.getBean("person", Person.class);

		System.out.println(standaloneperson);
	}
}
