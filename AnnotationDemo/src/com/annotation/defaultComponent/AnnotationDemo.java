package com.annotation.defaultComponent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		
		// define the container 
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContextDefaultComp.xml");

		// retrieve beans from container
		
		Coach c = context.getBean("cricketCoach",Coach.class);
		
		// use beans logic
		
		System.out.println(c.getDailyRoutine());
		
		// closing conext
		
		context.close();
	}

}
