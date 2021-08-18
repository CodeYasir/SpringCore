package com.setter.object;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//load configuration file 
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSetterObject.xml");
		
		//get bean from factory
		
		Cricketer c = context.getBean("getCricketer", Cricketer.class);
		
		//use bean
		
		System.out.println(c.getdetails());
		
		//close 
		context.close();
		
	}
}
