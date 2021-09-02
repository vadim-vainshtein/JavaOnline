/*
 * Задача 4: Написать алгоритм сортировки обменами
 * Сам алгоритм реализован в классе Array
 */

/*
 * Использование: task04.Main n;
 * n - длина входного массива
 */

package algorithmization.sorting.task04;

// мой класс для работы с массивами
import algorithmization.Array;

public class Main {
	
	public static void main(String[] args) {
		
		final int DEFAULT_LENGTH = 10;
		final double MAX_VALUE = 10.0;
		int length = DEFAULT_LENGTH;
		
		try {
			length = Integer.parseInt(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\n No input, using default array length " + DEFAULT_LENGTH);
		}
		catch(NumberFormatException e) {
			System.out.println("\n Invalid input, using default array length " + DEFAULT_LENGTH);
		}
		
		//заполним массив случайными числами
		double[] array = Array.fillDouble(length, MAX_VALUE);
		
		System.out.println("\nArray:");
		Array.printDouble(array);
		
		// отсортируем массив
		int swaps = Array.sortBubble(array);
		
		System.out.println("\nSorted Array:");
		Array.printDouble(array);
		System.out.println("\nNumber of swaps: " + swaps);
	}
}
