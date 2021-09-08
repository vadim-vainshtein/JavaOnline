/**
 * Задача 6: определить, являются ли три числа взаимно простыми
 */
 
 package algorithmization.decomposition.task06;
 
 // метод для провнюерки на взаимную простоту - Util.areCoprime()
 import algorithmization.Util;
 import algorithmization.Array;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
 		int[] array1 = {2, 5, 9};
 		int[] array2 = {3, 7, 12};
 		
 		System.out.print("Numbers ");
		Array.printInteger(array1);
 	
 		if(Util.areCoprime(array1)) {
 			System.out.println(" are coprime");
 		}
 		else {
 			System.out.println(" aren't coprime");
 		}
 		
 		System.out.print("Numbers ");
		Array.printInteger(array2);
 	
 		if(Util.areCoprime(array2)) {
 			System.out.println(" are coprime");
 		}
 		else {
 			System.out.println(" aren't coprime");
 		}
 	}
 }
