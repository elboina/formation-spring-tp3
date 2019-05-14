package fr.worldline.spring.training.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import fr.worldline.spring.training.Calculator;

@Component("calc")
@Profile("dev")
public class Multiplier implements Calculator {

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

}
