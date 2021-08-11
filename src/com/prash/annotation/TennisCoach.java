package com.prash.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theTCoach")
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fs;
	
	public TennisCoach()
	{
		System.out.println(">>> inside default const");
	}
	
	/*
	 * @Autowired public void setFs(FortuneService fs) { this.fs = fs;
	 * System.out.println(">>> inside setter"); }
	 */
	/*
	 * @Autowired public TennisCoach(FortuneService thefs) { fs = thefs;
	 * System.out.println("inside construture"); }
	 */
	@Override
	public String getDailyWorkout() {
		
		return "30 min of BackHand practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getForune();
	}
}
