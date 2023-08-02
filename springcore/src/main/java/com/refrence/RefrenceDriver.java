package com.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefrenceDriver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/refrence/refConfig.xml");
		
		
		A A1 = (A) context.getBean("aref");
		System.out.println(A1);
	}
}
