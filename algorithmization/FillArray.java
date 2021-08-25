/*
 * FillArray - набор функций для заполнения массива случайными данными
 */

package algorithmization;

import java.lang.Math;

public class FillArray {
	
	// для заполнения натуральными числами
	public static int[] fillNatural(int length, int max_value) {
		
		int[] result = new int[length];
		if(max_value == 0) max_value = Integer.MAX_VALUE;
		
		for(int i = 0; i < length; i++) {
			result[i] = (int)(Math.random() * max_value) + 1; // натуральные числа обычно считаются с 1
		}
		
		return result;
	}
	
	// для заполнения вещественными числами
	public static double[] fillDouble(int length, double range) {
		
		double[] result = new double[length];
				
		for(int i = 0; i < length; i++) {
			result[i] = (Math.random() - 0.5) * range;
		}
		
		return result;
	}
}
