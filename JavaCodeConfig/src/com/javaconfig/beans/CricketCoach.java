package com.javaconfig.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    
	public CricketCoach(Fortune happyFortune) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run 500m for  warmup";
	}
}
