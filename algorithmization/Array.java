/**
 * Array - набор методов для работы с массивами.
 * Интерфейс класса спроектирован неоптимально, некоторые методы можно объединить в один
 * метод с несколько расширенным функционалом, а также использовать перегрузку методов.
 * Однако на данный момент с этим классом работают практически все задачи из пакета algorithmization,
 * и при оптимизации придётся переписать их все. Пока что оставляю так.
 * @author Vadim Vainshtein
 * @version 02.09.2021.2
 */

package algorithmization;

import java.lang.Math;

public class Array {
	
	/**
	 * Создать массив случайных натуральных чисел
	 * @param length - длина массива
	 * @param max_value - максимальное значение. Будут генерироваться числа в интервале [1, max_value]
	 * @return Возвращает указатель на созданный массив
	 */
	public static int[] fillNatural(int length, int max_value) {
		
		int[] result = new int[length];
		
		// будем начинать не с 0, а с 1, поэтому верхняя граница на единицу меньше
		if(max_value > 0) {
			max_value--;
		}
		
		for(int i = 0; i < length; i++) {
			result[i] = (int)(Math.random() * max_value) + 1; // натуральные числа обычно считаются с 1
		}
		
		return result;
	}
	
	/**
	 * Создать массив случайных натуральных чисел.
	 * @param length - длина массива
	 * @param max_value - максимальное значение. Будут генерироваться числа в интервале [-max_value, max_value]
	 * @return Возвращает указатель на созданный массив
	 */
	
	public static int[] fillInteger(int length, int max_value) {
		
		int[] result = new int[length];
		
		for(int i = 0; i < length; i++) {
			result[i] = (int)(Math.random() * max_value * 2 - max_value);
		}
		
		return result;
	}
	
	/**
	 * Создать массив случайных натуральных чисел.
	 * @param length - длина массива
	 * @param max_value - максимальное значение. Будут генерироваться числа в интервале [0, max_value]
	 * @return Возвращает указатель на созданный массив
	 */
	public static int[] fillUnsigned(int length, int max_value) {
		
		int[] result = new int[length];
		
		for(int i = 0; i < length; i++) {
			result[i] = (int)(Math.random() * max_value);
		}
		
		return result;
	}
	
	/**
	 * Создать массив случайных вещественных чисел.
	 * @param length - длина массива
	 * @param max_value - максимальное значение. Будут генерироваться числа в интервале [-max_value, max_value]
	 * @return Возвращает указатель на созданный массив
	 */
	public static double[] fillDouble(int length, double max_value) {
		
		double[] result = new double[length];
				
		for(int i = 0; i < length; i++) {
			result[i] = (Math.random() - 0.5) * max_value * 2;
		}
		
		return result;
	}
	
	/** Вывести массив целых чисел на экран.
	 * @param array - массив, который необходимо вывести
	 */
	public static void printInteger(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d; ", array[i]);
		}
	}
	
	/** Вывести часть массива целых чисел на экран.
	 * @param array - массив, который необходимо вывести
	 * @param length - длина выодимого массива (количество элементов, которые необходимо вывести)
	 */
	public static void printInteger(int[] array, int length) {
		
		for(int i = 0; i < length; i++) {
			System.out.printf("%d; ", array[i]);
		}
	}
	
	/** Вывести массив вещественных чисел на экран.
	 * @param array - массив, который необходимо вывести
	 */
	public static void printDouble(double[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%.3f; ", array[i]);
		}
	}
	
	/** Поменять местами два элемента.
	 * @param array - массив, в котором необходима замена
	 * @param a - первый элемент
	 * @param b - второй элемент
	 */
	public static void swapElements(double[] array, int a, int b) {
		
		double tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
	
	/** Найти минимальный элемент массива
	 * @param array - массив
	 * @return Возвращает минимальный элемент массива
	 */
	public static double min(double[] array) {
		
		double result = Double.MAX_VALUE;
		for(int i = 0; i < array.length; i++){
			if(array[i] < result) {
				result = array[i];
			}
		}
		
		return result;
	}
	
	/** Найти минимальный элемент массива
	 * @param array - массив
	 * @return Возвращает минимальный элемент массива
	 */
	public static int min(int[] array) {
		
		int result = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++){
			if(array[i] < result) {
				result = array[i];
			}
		}
		
		return result;
	}
	
	/** Найти индекс максимального элемент массива
	 * @param array - массив
	 * @return Возвращает индекс первого максимального элемента массива
	 */
	public static int indexOfMax(int[] array) {
		
		int currentIndexOfMax = 0;
		
		for(int i = 0; i < array.length; i++) {
			if( array[i] > array[currentIndexOfMax] ) {
				currentIndexOfMax = i;
			}
		}
		
		return currentIndexOfMax;
	}
	
	/**
	 * Сортировка обменами (пузырьковая сортировка)
	 * @param array - массив, который требуется отсортировать
	 * @return Возвращает количество перестановок, которые пришлось совершить
	 */	
	public static int sortBubble(double[] array) {
		
		int swaps = 0;
		
		for(int i = array.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(array[j] > array[j + 1]) {
					swapElements(array, j, j + 1);
					swaps++;
				}
			}
		}
		
		return swaps;		
	}
}
