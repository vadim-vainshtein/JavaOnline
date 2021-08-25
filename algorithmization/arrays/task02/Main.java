/*
 * Задача 2: Дана последовательность действительных чисел a1, a2, ..., an.
 * Заменить все числа, большие данного z, на это число. Подсчитать количество замен
 */

package algorithmization.arrays.task02;
import algorithmization.Array;

class Main {
	
	public static void main(String[] args) {
		
		int n, counter;
		double z;
		
		n = Integer.parseInt(args[0]);
		z = Double.parseDouble(args[1]);
		
		double[] a = Array.fillDouble(n, 100.0);
		
		counter = 0;
		
		System.out.println("z = " + z +";");
		System.out.println("Array before replacements:");
		Array.printDouble (a);
		
		for(int i = 0; i < n; i++) {
			if(a[i] > z) {
				a[i] = z;
				counter++;
			}
		}
		
		System.out.println("\nArray after replacements:");
		Array.printDouble (a);
		
		System.out.println("\nNumber of replacements: " + counter);
	}
}
