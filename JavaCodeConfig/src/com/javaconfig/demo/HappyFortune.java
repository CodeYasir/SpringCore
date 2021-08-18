package com.javaconfig.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements Fortune{

	@Override
	public String getDailyFortune() {
		return "Today is your lucky day";
	}

	
}
