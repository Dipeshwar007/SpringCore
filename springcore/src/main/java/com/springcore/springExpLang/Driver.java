package com.springcore.springExpLang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springExpLang/ExpLang.xml");

		Demo D1 = context.getBean("demo", Demo.class);
		System.out.println(D1);
	}
}
