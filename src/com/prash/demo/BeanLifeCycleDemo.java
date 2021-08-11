package com.prash.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext2.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getWorkOut());
		context.close();
	}

}
