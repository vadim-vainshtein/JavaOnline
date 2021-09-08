/**
 * Задача 8: Составить метод для вычисления суммы нескольких последовательно расположенных элементов в массиве
 */
 
 package algorithmization.decomposition.task08;
 
 import algorithmization.Util;
 import algorithmization.Array;
 
 public class Main {
 	
	public static void main (String[] args) {
 		
  		int[] data = Array.fillInteger(10, 10);
		
		System.out.print("data: ");
		Array.printInteger(data);
		System.out.println("");

 		System.out.println("The sum of data[1 ... 3] is " + Util.sum(data, 1, 3));
	}
 }
