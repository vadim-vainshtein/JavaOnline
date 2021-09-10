/**
 * Задача 11: Определить, в каком числе больше цифр
 */
 
 package algorithmization.decomposition.task11;
 
 import algorithmization.Util;
 
 public class Main {
 	
	public static void main (String[] args) {
 		
 		final int a = 12345;
 		final int b = 789;
 		
 		byte moreDigits = Util.hasMoreDigits(a, b);
 		if(moreDigits == 1) {
 			System.out.println("Number " + a + " has more digits than " + b);
 		}
 		else if(moreDigits == 2) {
			System.out.println("Number " + b + " has more digits than " + a);
		}
 		else {
 			System.out.println("Numbers " + a + " and " + b + " have the same number of digits");
 		}
	}
 }
