/*
 * Задача 2: Даны две неубывающие последовательности. Образовать из них новую неубывающую последовательность.
 * Дополнительный массив не использовать (КАК?.. А куда поместить новую последовательность? - Пока это условие игнорирую...)
 */

/*
 * Использование: task02.Main n m;
 * n и m - длины входных последовательностей
 */

package algorithmization.sorting.task02;

// мой класс для работы с массивами
import algorithmization.Array;

public class Main {
	
	public static void main(String[] args) {
		
		// получим входные последовательности
		
		final int DEFAULT_LENGTH = 10;
		final double MAX_VALUE = 10.0;
		int n = DEFAULT_LENGTH;
		int m = DEFAULT_LENGTH;
		
		try {
			n = Integer.parseInt(args[0]);
			m = Integer.parseInt(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\n No input, using default array length: " + DEFAULT_LENGTH);
		}
		catch(NumberFormatException e) {
			System.out.println("\n Invalid input, using default array length: " + DEFAULT_LENGTH);
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
		// хотелось бы последовательности просто объединить и отсортировать, но, полагаю, задача предполагает нечто иное
		double[] result = new double[n + m];
		
		// алгоритм выглядит громоздким, надо подумать, как оптимизировать...
		int aCount = 0;
		int bCount = 0;
		
		for(int i = 0; i < result.length; i++) {
			
			if (aCount == n) {
				result[i] = b[bCount++];
			}
			else if (bCount == m) {
				result[i] = a[aCount++];
			}
			else if (a[aCount] < b[bCount]) {
				result[i] = a[aCount++];
			}
			else {
				result[i] = b[bCount++];
			}
		}
		
		System.out.println("\nNew sequence:");
		Array.printDouble(result);
	}
}
