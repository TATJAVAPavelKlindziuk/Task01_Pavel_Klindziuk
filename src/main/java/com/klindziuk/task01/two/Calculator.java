package com.klindziuk.task01.two;

public class Calculator {

	public double calculateExpression(double[] args) {
		if (null == args) {
			throw new IllegalArgumentException("Cannot perform calculation of expression with \"null\".");
		}
		if (0 == (args[0])) {
			throw new IllegalArgumentException("First argument cannot be equal to 0.");
		}
		double a = args[0];
		double b = args[1];
		double c = args[2];
		
		return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / (2 * a)) - (Math.pow(a, 3) * c + Math.pow(b, -2));
	}
}
