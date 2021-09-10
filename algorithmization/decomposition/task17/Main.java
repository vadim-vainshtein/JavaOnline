/**
 * Задача 17: Из заданного числа вычли сумму его цифр. Из результата снова вычли сумму цифр, и т.д. Сколько таких действий надо произвести, чтобы получить 0?
 */

package algorithmization.decomposition.task17;

import algorithmization.Util;

public class Main {
	
	public static void main (String[] args) {
		
		final int n = 123;
		
		int count = countSubtractions(n);
		
		System.out.println("It's necessary to subtract the sum of it's digits from the number " + count + " times to get 0");
	}
	
	
	private static int countSubtractions(int number) {
		
		int count =0;
		while(number > 0) {
			int sumOfDigits = Util.sum(Util.getDigits(number));
			//System.out.println("number = " + number + "; sum of digits: " + sumOfDigits);
			number -= sumOfDigits;
			count++;
		}
		
		return count;
	}
}
