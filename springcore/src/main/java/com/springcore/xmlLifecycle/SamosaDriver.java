package com.springcore.xmlLifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SamosaDriver {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/xmlLifecycle/xmlLifecycle.xml");

		Samosa S1 = (Samosa) context.getBean("samosha");
		System.out.println(S1);

		context.registerShutdownHook();

		System.out.println("______________________________");

		PepsiInterface IP1 = (PepsiInterface) context.getBean("pepsi");
		System.out.println(IP1);
	}
}
