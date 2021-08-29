/*
 * Array - набор методов для работы с массивами
 */

package algorithmization;

import java.lang.Math;

public class Array {
	
	// для заполнения случайными натуральными числами
	public static int[] fillNatural(int length, int max_value) {
		
		int[] result = new int[length];
		if(max_value == 0) max_value = Integer.MAX_VALUE;
		
		for(int i = 0; i < length; i++) {
			result[i] = (int)(Math.random() * max_value) + 1; // натуральные числа обычно считаются с 1
		}
		
		return result;
	}
	
	// для заполнения случайными вещественными числами
	public static double[] fillDouble(int length, double range) {
		
		double[] result = new double[length];
				
		for(int i = 0; i < length; i++) {
			result[i] = (Math.random() - 0.5) * range;
		}
		
		return result;
	}
	
	
	// вывести массив целых чисел на экран
	public static void printInteger(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d; ", array[i]);
		}
	}
	
	// вывести массив вещественных чисел на экран
	public static void printDouble(double[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%.3f; ", array[i]);
		}
	}
	
	// поменять местами два элемента
	public static void swapElements(double[] array, int a, int b) {
		
		double tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
	
	//Найти минимальный элемент массива
	public static double min(double[] array) {
		
		double result = Double.MAX_VALUE;
		for(int i = 0; i < array.length; i++){
			if(array[i] < result) {
				result = array[i];
			}
		}
		
		return result;
	}
}
