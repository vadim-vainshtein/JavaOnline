/**
 * Задача 15: Найти все натуральные n-значные числа, цифры которых образуют строго возрастающую последовательность
 */

package algorithmization.decomposition.task15;

import algorithmization.decomposition.Numbers;
import algorithmization.Array;

public class Main {
	
	public static void main (String[] args) {
	
		final int n = 5;
		Numbers numbers = new Numbers(n);
		
		numbers.initDigitsAscending();
		int[] arrayOfNumbers = numbers.toArray();
		Array.printInteger(arrayOfNumbers);
		System.out.println("");
	}
}
