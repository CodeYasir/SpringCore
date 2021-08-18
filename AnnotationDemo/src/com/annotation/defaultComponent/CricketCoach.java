package com.annotation.defaultComponent;

import org.springframework.stereotype.Component;

// Add component annotation to java classes

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyRoutine() {
		return "Run 500m for warmup";
	}

}
