package com.autowiring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Step-1:Add component annotation to java classes
// Step-2:Add Autowiring on setter

@Component
public class CricketCoach implements Coach {

    Fortune fortune;
    
    @Autowired
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}
	
	@Override
	public String getFortune() {
		return fortune.getDailyFortune();
	}
	
	@Override
	public String getDailyRoutine() {
		return "Run 500m for warmup";
	}
}
