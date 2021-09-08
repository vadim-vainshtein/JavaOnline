/**
 * Задача 7: вычислить сумму факториалов нечётных чисел от 1 до 9
 */
 
 package algorithmization.decomposition.task07;
 
 import algorithmization.Util;
 
 public class Main {
 	
	public static void main (String[] args) {
 		
 		// массив нечётных чисел от 1 до 9 (система вычетов по модулю 2)
 		int[] data = Util.residueClass(2, 1, 9, 1);
 		
 		for(int i = 0; i < data.length; i++) {
 			data[i] = Util.factorial(data[i]);
 		}
 		
 		System.out.println("The sum of factorials of odd numbers between 1 and 9: " + Util.sum(data));
	}
 }