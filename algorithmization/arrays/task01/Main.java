/*
 * Задача 1: найти сумму чисел, кратных k, из массива a[n]
 * 
 * для заполнения массива случаными числами используется класс FillArray
 */

package algorithmization.arrays.task01;

public class Main {
	
	public static void main(String[] args) {
		
		int n, k;
		long result;
		
		n = Integer.parseInt(args[0]);
		k = Integer.parseInt(args[1]);
		
		// ограничимся диапазоном чисел от 1 до 100
		// для использования всего диапазона int второй параметр следует установить в 0
		int[] a = FillArray.fillNatural(n, 100); 
		
		System.out.println("k = " + k + "; массив:");
		
		result = 0;
		
		for(int i = 0; i < n; i++) {
			if(a[i] % k == 0) {
				result += a[i];
			}
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\nСумма чисел, кратных " + k + ", равна " + result);		
	}
}
