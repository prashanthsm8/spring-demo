package com.prash.annotation;

import org.springframework.stereotype.Component;

@Component("theTCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "30 min of BackHand practice";
	}

}
