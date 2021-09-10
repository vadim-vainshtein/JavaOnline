/**
 * Задача 13: Найти и напечатать все пары "близнецов" в интервале [n, 2n], где n > 2. Близнецы - пары простых чисел, отличающихся на 2
 */

package algorithmization.decomposition.task13;

import java.util.ArrayList;

// для хранения пар чисел используем класс Pair
import algorithmization.decomposition.task13.Pair;
import algorithmization.Util;
import algorithmization.Array;

public class Main {
	
	public static void main (String[] args) {
		
		final int n = 100;
		
		int[] primeNumbers = Util.primeNumbers(n, n * 2); // получаем ряд простых чисел
		Pair[] twins = findTwins(primeNumbers); // находим среди них "близнецов"
		
		System.out.println("\"Twins\" between " + n + " and " + n*2 + ":");
		printPairs(twins); // выводим их на экран

	}
	
	
	private static Pair[] findTwins(int[] array) {
		
		// Чтобы не считать заранее количество пар, воспользуемся списком
		ArrayList<Pair> twins = new ArrayList<Pair>();
		
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i + 1] - array[i] == 2) {
				twins.add(new Pair(array[i], array[i + 1]));
			}
		}
		
		// функциональность ArrayList дальше не нужна, переведём в массив
		Pair[] result = new Pair[twins.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = twins.get(i);
		}
		
		return result;
	}
	
	
	private static void printPairs(Pair[] array) {
	
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}
	}
}
