package com.autowiring.field;

import org.springframework.stereotype.Component;

// Add component annotation to java classes

@Component
public class HappyFortune implements Fortune {

	@Override
	public String getDailyFortune() {
		return "Today is the lucky day";
	}

}
