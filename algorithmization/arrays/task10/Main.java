/*
 * Задача 10: сжать целочисленный массив, выбросив каждый второй элемент. Оставшееся место заполнить нулями
 */
 
package algorithmization.arrays.task10;
// мой класс для работы с массивами
import algorithmization.Array;

class Main {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		//заполнить массив случайными числами
		int[] a = Array.fillInteger(n, 10);
		
		System.out.println("Array:");
		//вывести элементы массива в консоль 
		Array.printInteger(a);
		System.out.println("\n");
		
		// сжать массив
		for(int i=1; i*2<n; i++) {
			a[i] = a[i*2];
		}
		// заполнить свободное место нулями
		for(int i = (n/2 + n%2); i < n; i++) {
			a[i] = 0;
		}
		
		System.out.println("Compressed array:");
		Array.printInteger(a);
		System.out.println("");
	}
}
