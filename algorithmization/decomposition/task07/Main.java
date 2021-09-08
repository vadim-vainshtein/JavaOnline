/**
 * Задача 7: вычислить сумму факториалов нечётных чисел от 1 до 9
 */
 
 package algorithmization.decomposition.task07;
 
 import algorithmization.Util;
 import algorithmization.Array;
 
 public class Main {
 	
	public static void main (String[] args) {
 		
 		// массив нечётных чисел от 1 до 9 (класс вычетов по модулю 2)
 		int[] data = Util.residueClass(2, 1, 9, 1);
		Array.printInteger(data);
		System.out.println("");
 		
 		for(int i = 0; i < data.length; i++) {
 			data[i] = Util.factorial(data[i]);
 		}
 		
 		Array.printInteger(data);
 		System.out.println("");
 		System.out.println("The sum of factorials of odd numbers from 1 to 9: " + Util.sum(data));
	}
 }
