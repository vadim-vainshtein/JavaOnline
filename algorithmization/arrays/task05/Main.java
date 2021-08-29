/*
 * Задача 5: вывести элементы массива a[] натуральных чисел,
 * для которых a[i] > i
 */

package algorithmization.arrays.task05;
// мой класс для работы с массивами
import algorithmization.Array;

class Main {
	
	public static void main(String[] args) {
		
		int n;
		
		// количество элементов массива
		n = Integer.parseInt(args[0]);
		
		//заполнить массив случайными числами
		int[] a = Array.fillNatural(n, 10);
		
		System.out.println("Array:");
		//вывести элементы массива в консоль 
		Array.printInteger(a);
		System.out.println("\nElements a[i] > i:\n");
		
		for(int i = 0; i < n; i++) {
			
			if(a[i] > i) {
				System.out.printf("a[%d] = %d\n", i, a[i]);
			}
		}
	}
}
