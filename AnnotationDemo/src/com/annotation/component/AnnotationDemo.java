package com.annotation.component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		
		// Step-3 is same as Xml based configuration
		// define the container , retrieve bean 
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContextComp.xml");

		// retrieve beans from container
		    Coach c = context.getBean("getCoach",Coach.class);
		
		// use beans logic
		    System.out.println(c.getDailyRoutine());
		
		// closing conext
		
		context.close();
	}

}
