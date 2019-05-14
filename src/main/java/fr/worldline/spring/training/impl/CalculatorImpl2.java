package fr.worldline.spring.training.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import fr.worldline.spring.training.Calculator;

@Component("calc2")
@Profile("prod")
public class CalculatorImpl2 implements Calculator {

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return (a + b) * 2;
	}

}
