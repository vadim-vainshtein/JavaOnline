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
		double[] a = Array.fillDouble(n*2, 100.0);
		
		System.out.println("Array:");
		//вывести элементы массива в консоль 
		Array.printDouble(a);
		System.out.println("\n");
		
		// Именно так, а не Double.MIN_VALUE, как я подумал сначала...
		double result = -Double.MAX_VALUE;
		double tmp;
		
		// это выражение понадобится в цикле, вычислим его раз и навсегда
		int k = 2*n - 1;
		
		//пройдём по элементам массива, вычисляя нужные суммы, и находя максимум
		for(int i=0; i<n; i++) {
			tmp = a[i] + a[k-i];
			
			System.out.printf("a[%d] + a[%d] = %.3f\n", i, k-i, tmp);
			
			if(tmp > result) {
				result = tmp;
			}
		}
		
		System.out.println("\nResult: " + result + "\n");
	}
}
