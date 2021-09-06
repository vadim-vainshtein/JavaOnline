/*
 * Задача 1: Даны два массива и натуральное число k. Объединить их в один массив, включив второй массив между 
 * k-м и (k+1)-м элементами первого. Дополнительный массив не использовать.
 */

/*
 * Использование: task01.Main n m k;
 * n и m - длины входных массивов случайных чисел
 * k - элемент, после которого происходит вставка
 */

package algorithmization.sorting.task01;

// Arrays.copyOf
import java.util.Arrays;
// мой класс для работы с массивами
import algorithmization.Array;

public class Main {
	
	public static void main(String[] args) {
		
		// получим входные массивы
		
		final int DEFAULT_LENGTH = 10;
		final double MAX_VALUE = 10.0;
		int m = DEFAULT_LENGTH;
		int n = DEFAULT_LENGTH;
		int k = DEFAULT_LENGTH / 2;
		
		try {
			m = Integer.parseInt(args[0]);
			n = Integer.parseInt(args[1]);
			k = Integer.parseInt(args[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\n Not enough arguments, using a default array length: " + DEFAULT_LENGTH);
		}
		catch(NumberFormatException e) {
			System.out.println("\n Invalid input, using a default array length: " + DEFAULT_LENGTH);
		}
		
		if(m <= 0) {
			System.out.println("\n Invalid input, using a default array length: " + DEFAULT_LENGTH);
			m = DEFAULT_LENGTH;
		}
		
		if(n <= 0) {
			System.out.println("\n Invalid input, using a default array length: " + DEFAULT_LENGTH);
			n = DEFAULT_LENGTH;
		}
		
		if(k >= m) {
			System.out.println("\n k is greater then array length, using a smaller value: " + (k = m / 2));
		}
		
		double[] a = Array.fillDouble(m, MAX_VALUE);
		double[] b = Array.fillDouble(n, MAX_VALUE);
				
		System.out.println("\nArray a:");
		Array.printDouble(a);
		System.out.println("\nArray b:");
		Array.printDouble(b);
		System.out.println("\nk = " + k);		
		
		// здесь начинается решение

		a = Arrays.copyOf(a, m + n);
		System.arraycopy(a, k + 1, a, k + 1 + n, m - k -1);
		System.arraycopy(b, 0, a, k + 1, n);
		
		System.out.println("\nNew array:");
		Array.printDouble(a);
	}
}
