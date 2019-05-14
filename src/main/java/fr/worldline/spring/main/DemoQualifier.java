package fr.worldline.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.worldline.spring.configuration.AppConfig;
import fr.worldline.spring.training.Calculator;

public class DemoQualifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Calculator calculator = (Calculator) context.getBean("calc");
		System.out.println("Résultat calcul : " + calculator.calculate(1, 2));
		context.close();

	}

}
