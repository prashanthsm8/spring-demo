package com.prash.annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getForune() {
		return "Today is ur lucky day";
	}

}
