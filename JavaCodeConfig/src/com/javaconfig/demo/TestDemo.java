package com.javaconfig.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

   public class TestDemo {

	public static void main(String[] args) {
		
		// Step:2 Load the configuration file
		// Note : We have a different container here   
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		
        // Step:3 retrieve the beans 
		
		Coach c= context.getBean("cricketCoach", Coach.class);
		
		// use bean in logic
		
		System.out.println(c.getDailyWorkout());
		
		System.out.println(c.getDailyFortune());
		
		// closing context
		
		context.close();
		
	}

}
