package fr.worldline.spring.training;

public interface Calculator {
	
	/**
	 * Calcule le résultat à partir des nombres passés en paramètre
	 * @param a 
	 * @param b
	 * @return résultat de l'opération effectuée avec a et b
	 */
	int calculate(int a, int b);
}
