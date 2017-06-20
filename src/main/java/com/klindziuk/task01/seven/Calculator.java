package com.klindziuk.task01.seven;

import java.util.Map;
import java.util.TreeMap;

public class Calculator {

	public Map<Double, Double> calculateFunction(double[] array) {
		if (null == array) {
			throw new IllegalArgumentException("Cannot perform calculation of function with \"null\" arguments.");
		}
		Map<Double, Double> result = new TreeMap<>();
		double a = array[0];
		double b = array[1];
		double step = array[2];
		do {
			double function = Math.pow(Math.sin(a), 2) - Math.cos(2 * a);
			result.put(a, function);
		} while ((a = a + step) <= b);
		return result;
	}
}
