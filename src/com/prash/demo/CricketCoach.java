package com.prash.demo;

public class CricketCoach implements Coach {

	private FortuneService thisfortune;
	private String email;
	private String teamName;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("inside set email");
		this.email = email;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		System.out.println("inside set team name");
		this.teamName = teamName;
	}
	public CricketCoach() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getWorkOut() {
		// TODO Auto-generated method stub
		return "Fielding practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "jdt"+thisfortune.getFortune();
	}

	public CricketCoach(FortuneService thisfortune) {
		this.thisfortune = thisfortune;
	}
	
	public void setFortuneService(FortuneService fortuneServ)
	{
		this.thisfortune = fortuneServ;
		System.out.println("inside setter");
	}

}
