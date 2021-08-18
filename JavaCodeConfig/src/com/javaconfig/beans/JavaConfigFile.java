package com.javaconfig.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
// @ComponentScan("com.javaconfig.beans") --we have to define beans individually
public class JavaConfigFile {
 
  // Step-1: Define method to expose bean 
	@Bean
	public HappyFortune happyFortune(){
		return new HappyFortune();
	}
  // Step:2 : Expose bean injection 	
	@Bean
	public CricketCoach getCricketCoach(){
		return new CricketCoach(happyFortune());
	}
	

	
	
}



