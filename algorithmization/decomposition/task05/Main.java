/**
 * Задача 5: найти второе по величине число в массиве
 */
 
package algorithmization.decomposition.task05;

import algorithmization.Array;

public class Main {
	
	public static void main(String[] args) {
		
		final int N = 10;
		final int RANGE = 10;
		
		int[] a = Array.fillInteger(N, 10);
		int secondMax = Array.secondMax(a);
		
		System.out.println("\nArray:\n");
		Array.printInteger(a);
		System.out.println("\n\nThe second greatest element of array is " + secondMax);
	}
}