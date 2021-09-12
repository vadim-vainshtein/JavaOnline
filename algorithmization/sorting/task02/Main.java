/*
 * Задача 2: Даны две неубывающие последовательности. Образовать из них новую неубывающую последовательность.
 * Дополнительный массив не использовать
 */

/*
 * Использование: task02.Main n m;
 * n и m - длины входных последовательностей
 */

package algorithmization.sorting.task02;

// copyOf()
import java.util.Arrays;

// мой класс для работы с массивами
import algorithmization.Array;

public class Main {
	
	public static void main(String[] args) {
		
		// получим входные последовательности
		
		final int DEFAULT_LENGTH = 10;
		final double MAX_VALUE = 10.0;
		int m = DEFAULT_LENGTH;
		int n = DEFAULT_LENGTH;
		
		try {
			m = Integer.parseInt(args[0]);
			n = Integer.parseInt(args[1]);
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
		
		double[] a = Array.fillDouble(n, MAX_VALUE);
		double[] b = Array.fillDouble(m, MAX_VALUE);
		
		// Чтобы последовательности были неубывающими, воспользуемся сортировкой
		Array.sortBubble(a);
		Array.sortBubble(b);
		
		System.out.println("\nSequence a:");
		Array.printDouble(a);
		System.out.println("\nSequence b:");
		Array.printDouble(b);
		
		// здесь начинается решение
		a = Arrays.copyOf(a, m + n);
		// объединим две последовательности и отсортируем их
		System.arraycopy(b, 0, a, n, m);
		Array.sortBubble(a);
		
		//Ниже в комментарии приведено решение с использованием доп. массива, но без необходимости сортировки в конце

		/*
		int aCount = 0;
		int bCount = 0;
		double[] result = new double[m + n];
		
		for(int i = 0; i < result.length; i++) {
			
			if (aCount == m) {
				result[i] = b[bCount++];
			}
			else if (bCount == n) {
				result[i] = a[aCount++];
			}
			else if (a[aCount] < b[bCount]) {
				result[i] = a[aCount++];
			}
			else {
				result[i] = b[bCount++];
			}
		}
		*/
		
		System.out.println("\nNew sequence:");
		Array.printDouble(a);
	}
}
