/*
 * Задача 6: Даны две неубывающие последовательности a и b. Указать места в последовательности a, куда нужно вставить элементы b, чтобы последовательность оставалась неубывающей*
 */

/*
 * Использование: task06.Main n m;
 * n и m - длины входных последовательностей
 */

package algorithmization.sorting.task06;

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
		Array.sortShell(a);
		Array.sortShell(b);
		
		System.out.println("\nSequence a:");
		Array.printDouble(a);
		System.out.println("\nSequence b:");
		Array.printDouble(b);
		
		// здесь начинается решение
		
		int[] insertIndices = whereToPlace(a, b);
		System.out.println("\nIndices of sequence a, where to place elements of sequence b to get a non-decreasing sequence:");
		Array.printInteger(insertIndices);
		System.out.print("\n\n");
	}
	
	private static int[] whereToPlace(double []a, double[] b) {
		/**
		 * возвращает массив индексов массива a, после которых следует поместить
		 * соответствующий элемент массива b
		 * индекс может быть равен a.length, если элемент следует поместить после последнего элемента a
		 */
		int[] insertIndices = new int[b.length];
		int aIndex = 0;
		
		for(int i = 0; i < b.length; i++) {
			//System.out.println("b[" + i + "] = " + b[i] + "; a[" + aIndex + "] = " + a[aIndex]);
			while((aIndex < a.length) && (b[i] > a[aIndex])) {
				aIndex++;
			}
			insertIndices[i] = aIndex;
		}
		
		return insertIndices;
	}
}
