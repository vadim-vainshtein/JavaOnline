/*
 * Задача 1: Даны два массива и натуральное число k. Объединить их в один массив, включив второй массив между 
 * k-м и (k+1)-м элементами первого. Дополнительный массив не использовать.
 * 
 * Дополнительный массив я всё же ввожу. Возможно, я чего-то не понимаю, но по моим представлениям, для решения этой задачи без доп. массива необходимо использовать связные списки, а не массивы, но про это в условиях задачи также ничего нет.
 * Решение задачи с помощью списка трудностей не представляет, приводить его здесь не буду.
 */

/*
 * Использование: task01.Main n m k;
 * n и m - длины входных массивов случайных чисел
 * k - элемент, после которого происходит вставка
 */

package algorithmization.sorting.task01;

// мой класс для работы с массивами
import algorithmization.Array;

public class Main {
	
	public static void main(String[] args) {
		
		// получим входные массивы
		
		final int DEFAULT_LENGTH = 10;
		final double MAX_VALUE = 10.0;
		int n = DEFAULT_LENGTH;
		int m = DEFAULT_LENGTH;
		int k = DEFAULT_LENGTH / 2;
		
		try {
			n = Integer.parseInt(args[0]);
			m = Integer.parseInt(args[1]);
			k = Integer.parseInt(args[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\n Not enough arguments, using a default array length: " + DEFAULT_LENGTH);
		}
		catch(NumberFormatException e) {
			System.out.println("\n Invalid input, using a default array length: " + DEFAULT_LENGTH);
		}
		
		if(k >= n) {
			System.out.println("\n k is greater then array length, using a smaller value: " + (k = n / 2));
		}
		
		double[] a = Array.fillDouble(n, MAX_VALUE);
		double[] b = Array.fillDouble(m, MAX_VALUE);
				
		System.out.println("\nArray a:");
		Array.printDouble(a);
		System.out.println("\nArray b:");
		Array.printDouble(b);
		System.out.println("\nk = " + k);		
		
		// здесь начинается решение
		
		double[] result = new double[n + m];
		
		System.arraycopy(a, 0, result, 0, k+1);
		System.arraycopy(b, 0, result, k + 1, b.length);
		System.arraycopy(a, k+1, result, k + b.length + 1, a.length - k - 1);
		
		/*
		 * Вариант:
		 * int i;
		 * for(i = 0; i <= k; i++) {
		 * 		result[i] = a[i];
		 * }
		 * for(int j = 0; j < b.length; j++, i++) {
		 * 		result[i] = b[j];
		 * }
		 * for(int j = k+1; j < a.length; j++, i++) {
		 * 		result[i] = a[i];
		 * }
		 */
		
		System.out.println("\nNew array:");
		Array.printDouble(result);
	}
}
