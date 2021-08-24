/*
 * FillArray - набор функций для заполнения массива случайными данными
 */

package algorithmization.arrays.task01;

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
}
