/**
 * Задача 12: Написать метод(ы) формирования массива, элементами которого являются числа, сумма цифр которых равна k и которые не больше n
 */

package algorithmization.decomposition.task12;

import java.util.ArrayList;
import algorithmization.Util;
import algorithmization.Array;

public class Main {
	
	public static void main (String[] args) {
		
		final int n = 10_000;
		final int k = 10;
		
		int[] numbers = findNumbers(k, n);
		Array.printInteger(numbers);
		System.out.println("");
	}
	
	// придумать название получше...
	public static int[] findNumbers(int k, int n) {
		
		//наверняка возможен более прогрессивный алгоритм, чем перебор всех чисел подряд, но мне не удалось его придумать
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			
			if(Util.sum(Util.getDigits(i)) == k) {
				numbers.add(i);
			}
		}
		
		int[] result = new int[numbers.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = numbers.get(i);
		}
		
		return result;
	}
}
