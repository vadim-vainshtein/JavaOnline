/*
 * Задача 9: в массиве из n элементов найти наиболее часто встречающийся элемент
 * Если таких элементов несколько, найти среди них наименьший
 */
 
package algorithmization.arrays.task09;
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
		
		// каждый элемент массива count хранит количество
		int[] count = new int[n];
		
		//посмотрим, какие элементы сколько раз повторяются
		for (int i = 0; i < n; i++) {
			
			count[i] = 0;
			for(int k = i; k < n; k++) {
				if(a[i] == a[k]) {
					count[i]++;
				}
			}
		}
		
		int countMax = 1; // количество элементов, встречающихся максимальное число раз
		// массив для хранения индексов элементов, повторяющихся максимальное число раз
		// в пределе их будет n
		int[] indicesOfMax = new int[n];
		indicesOfMax[0] = 0;

		for(int i = 1; i < n; i++) {
			if(count[i] > count[indicesOfMax[0]]) {
				indicesOfMax[0] = i;
				countMax = 1;
			}
			else if(count[i] == count[indicesOfMax[0]]) {
				indicesOfMax[countMax++] = i;
			}
		}
		
		// осталось найти минимальный элемент исходного массива среди элементов, встречающихся максимальное число раз
		int min = a[indicesOfMax[0]];
		for(int i = 1; i < countMax; i++) {
			if(a[indicesOfMax[i]] < min) {
				min = a[indicesOfMax[i]];
			}
		}
		
		System.out.printf("Наименьший из наиболее часто встречающихся элементов: %d\n", min);
	}
}
