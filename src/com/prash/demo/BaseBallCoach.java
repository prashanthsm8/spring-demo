package com.prash.demo;

public class BaseBallCoach implements Coach {
	
	private FortuneService thisFortune;
	
	public BaseBallCoach(FortuneService confortune) {
		thisFortune = confortune;
	}

	@Override
	public String getWorkOut() {
		
		return "run for 30 min";
	}

	@Override
	public String getDailyFortune() {
		return thisFortune.getFortune();
	}

	public void doMyStartupStuff()
	{
		System.out.println("startup method");
	}
	
	public void doMyCleanupStuff()
	{
		System.out.println("cleanup stuff");
	}
}
