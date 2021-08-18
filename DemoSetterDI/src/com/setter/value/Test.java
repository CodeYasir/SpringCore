package com.setter.value;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//load configuration file 
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSetterValue.xml");
		
		//get bean from factory
		
		Cricketer c = context.getBean("getCricketer", Cricketer.class);
		
		//use bean
		
		c.getdetails();
		
		//close 
		context.close();
		
	}
}
