/**
 * Задача 14: Найти все числа Армстронга от 1 до k. Числа Армстронга - числа, в записи которых n цифр, в которых сумма цифр, возведённая в степень n, равна самому числу
 */

package algorithmization.decomposition.task14;

import java.util.ArrayList;
import java.lang.Math;
import algorithmization.Util;
import algorithmization.Array;

public class Main {
	
	public static void main (String[] args) {
		
		final int k = 10000;
		
		int[] numbers = armstrongNumbers(k);
		System.out.println("Armstrong numbers from 1 to " + k + ":");
		Array.printInteger(numbers);
		System.out.println("");
	}
	
	
	private static int[] armstrongNumbers(int k) {

		// Чтобы не считать количества чисел, и не выделять слишком много памяти, используем список
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// Будем просто искать перебором по всем числам
		for(int i = 1; i < k; i++) {
			
			int digitSum = Util.sum(Util.getDigits(i));
			int numberOfDigits = Util.numberOfDigits(i);
			
			if(Math.pow(digitSum, numberOfDigits) == i) {
				numbers.add(i);
			}
		}
		
		// переведём список в простой массив
		int[] result = new int[numbers.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = numbers.get(i);
		}
		
		return result;
	}
}
