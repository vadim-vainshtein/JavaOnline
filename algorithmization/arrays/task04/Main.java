/*
 * Задача 4: поменять в массиве наибольший и наименьший элементы
 */

package algorithmization.arrays.task04;
// мой класс для работы с массивами
import algorithmization.Array;

class Main {
	
	public static void main(String[] args) {
		
		int n, indexMax, indexMin;
		double min, max;
		
		// количество элементов массива
		n = Integer.parseInt(args[0]);
		
		//заполнить массив случайными числами
		double[] a = Array.fillDouble(n, 100.0);
		
		indexMin = 0;
		indexMax = 0;
		min = 0;
		max = 0;
		
		System.out.println("Array:");
		//вывести элементы массива в консоль 
		Array.printDouble(a);
		
		for(int i = 0; i < n; i++) {
			
			if(a[i] > max) {
				max = a[i];
				indexMax = i;
			}
			else if(a[i] < min) {
				min = a[i];
				indexMin = i;
			}
		}
		
		// поменять элементы местами
		Array.swapElements(a, indexMin, indexMax);
		
		System.out.println("\nArray after swapping min and max:\n");
		Array.printDouble(a);
		System.out.println("");
	}
}
