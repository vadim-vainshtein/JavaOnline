/**
 * Задача 16: Определить сумму n-значных чисел, содержащих только нечётные цифры. Определить также, сколько чётных цифр в найденной сумме.
 */

package algorithmization.decomposition.task16;

import algorithmization.decomposition.Numbers;
import algorithmization.Util;
import algorithmization.Array;

public class Main {
	
	public static void main (String[] args) {
		
		final int n = 5;
		Numbers numbers = new Numbers(n);
		
		// получим массив из чисел с нечётными цифрами
		numbers.initDigitsOdd();
		int[] arrayOfNumbers = numbers.toArray();
		
		// Вычислим сумму всех его элементов
		int sum = Util.sum(arrayOfNumbers, 0, arrayOfNumbers.length);
		
		// посчитаем количество чётных цифр в сумме:
		int evenDigits = Util.countEvenDigits(sum);		
		
		System.out.println("\nSum of the numbers with " + n + " odd digits only: " + sum);
		System.out.println("Even digits in the sum: " + evenDigits);
	}
}
