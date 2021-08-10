package com.prash.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retive bean coach.class is type
		CricketCoach theCoach = context.getBean("myCoach", CricketCoach.class);
		//method
		System.out.println(theCoach.getWorkOut());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeamName());
		//close context
		context.close();

	}

}
