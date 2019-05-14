package fr.worldline.spring.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.worldline.spring.configuration.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@ActiveProfiles("dev")
public class CalculatorTest {
	
	@Autowired
	@Qualifier("calc1")
	private Calculator calculator;

	@Test
	public void test() {
		System.out.println(calculator);
		int param1 = 3;
		int param2 = 4;
		int expected = 7;
		
		assertEquals(expected, calculator.calculate(param1, param2));
	}

}
