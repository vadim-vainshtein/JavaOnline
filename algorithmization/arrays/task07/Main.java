/*
 * Задача 7: в массиве a[2n] найти max(a[0]+a[2n-1], ..., a[n-1]+a[n])
 */
 
package algorithmization.arrays.task07;
// мой класс для работы с массивами
import algorithmization.Array;

class Main {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		//заполнить массив случайными числами
		int[] a = FillArray.fillDouble(n*2, 100.0);
		
		System.out.println("Array:");
		//вывести элементы массива в консоль 
		Array.printDouble(a);
		
		double result = double.MIN_VALUE;
		double tmp;
		
		// это выражение понадобится в цикле, вычислим его раз и навсегда
		int k = 2*n - 1;
		
		//пройдём по элементам массива, вычисляя нужные суммы, и находя максимум
		for(int i=0; i<n; i++) {
			tmp = a[i] + a[k-i];
			if(tmp > result) {
				result = tmp;
			}
		}
		
		System.out.println("\nResult: " + result);
	}
}