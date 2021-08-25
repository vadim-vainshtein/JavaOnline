/*
 * Задача 3: посчитать количество положительных,
 * отрицательных и нулевых элементов в массиве
 */

package algorithmization.arrays.task03;
import algorithmization.Array;

class Main {
	
	public static void main(String[] args) {
		
		int n, positive, negative, zero;
		
		// количество элементов массива
		n = Integer.parseInt(args[0]);
		
		double[] a = FillArray.fillDouble(n, 100.0);
		
		positive = 0;
		negative = 0;
		zero = 0;
		
		System.out.println("Array:");
		Array.printDouble(a);
		
		for(int i = 0; i < n; i++) {
			
			if(a[i] > 0) {
				positive++;
			}
			else if(a[i] < 0) {
				negative++;
			}
			else {
				zero++;
			}
		}
		
		System.out.printf("\nNegative: %d; positive: %d; null: %d",
			negative, positive, zero);
	}
}
