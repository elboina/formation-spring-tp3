package fr.worldline.spring.training.impl;

import org.springframework.stereotype.Component;

import fr.worldline.spring.training.Calculator;

@Component("calc1")
public class CalculatorImpl1 implements Calculator {

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
