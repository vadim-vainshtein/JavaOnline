/*
 * Задача 8: дана последовательность целых чисел a1, a2, ..., an. Образовать новую последовательность,
 * выбросив члены, равные min(a1, a2, ..., an)
 */
 
package algorithmization.arrays.task08;
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
		
		int min = Array.min(a);
		// чтобы создать новый массив, нужно заранее знать количество элементов, равных min. Посчитаем их
		int minElementsCount = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == min) {
				minElementsCount++;
			}
		}
		
		//создадим новый массив, и скопируем туда всё, кроме минимальных элементов
		int[] result = new int[a.length - minElementsCount];
		// индексы будут расходиться, поэтому нужна переменная для хранения количества удалённых элементов
		int k = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > min) {
				result[i - k] = a[i];
			}
			else {
				k++;
			}
		}
		
		System.out.println("New array:");
		Array.printInteger(result);
		System.out.println("\n");
	}
}
