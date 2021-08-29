/*
 * Задача 6: в последовательности вещественных чисел вычислить сумму
 * элементов, порядковые номера которых - простые числа
 */

package algorithmization.arrays.task06;
import java.lang.Math;
// мой класс для работы с массивами
import algorithmization.Array;

class Main {
	
	public static void main(String[] args) {
		
		int n;
		
		// количество элементов массива
		n = Integer.parseInt(args[0]);
		
		//заполнить массив случайными числами
		double[] a = Array.fillDouble(n, 100.0);
		
		System.out.println("Array:");
		//вывести элементы массива в консоль 
		Array.printDouble(a);
		
		System.out.printf("\nSum of the elements with prime indices: %.3f\n", primeSum(a));
	}
	
	private static double primeSum(double[] a) {
		
		int i, j, k;
		
		//массив, обозначающий, является ли элемент простым
		//элементов на один больше, , поскольку индексы начинаются с 0, а номера элементов последовательности - с 1
		boolean[] prime = new boolean[a.length + 1];
		// для начала установим всё в true, кроме 0 и 1
		
		prime[0] = prime[1] = false;
		for(i = 2; i < prime.length; i++) {
			prime[i] = true;
		}
		
		// начинаем с первого простого числа - 2
		// в массиве prime будем помечать "false" составные числа
		for(i = 2; i < Math.sqrt(prime.length); i++) {
			
			if(prime[i]) {
				for(j = i, k = i*i; k < prime.length; k = i*(++j)) {
					prime[k] = false;
				}
			}
		}
		
		double result = 0;
		//теперь в prime значение true имеют только элементы с простым индексом
		//просуммируем в исходном массиве числа с простым порядковым номером
		//при этом помним, что номер 2 - индеск 1 в массиве
		for(i = 1; i < a.length; i++) {
			if(prime[i+1]) {
				result += a[i];
			}
		}
		
		return result;
	}
}
