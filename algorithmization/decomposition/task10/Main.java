/**
 * Задача 10: Дано натуральное число N. Написать метод, составляющий массив из цифр этого числа
 */
 
 package algorithmization.decomposition.task10;
 
 import algorithmization.Util;
 import algorithmization.Array;
 
 public class Main {
 	
	public static void main (String[] args) {
 		
 		int N = 130865;
 		int[] nDigits = Util.getDigits(N);
 		
 		System.out.println("The number: " + N);
 		System.out.print("The digits: ");
 		Array.printInteger(nDigits);
	}
 }
