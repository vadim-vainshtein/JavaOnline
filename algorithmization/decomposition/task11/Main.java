/**
 * Задача 11: Определить, в каком числе больше цифр
 */
 
 package algorithmization.decomposition.task11;
 
 import algorithmization.Util;
 
 public class Main {
 	
	public static void main (String[] args) {
 		
 		final int a = 12345;
 		final int b = 789;
 		
 		int moreDigits = Util.hasMoreDigits(a, b);
 		if(moreDigits != null) {
 			System.out.println("Number " + moreDigits + " has more digits");
 		}
 		else {
 			System.out.println("Numbers " + a + " and " + b + " have the same number of digits");
 		}
	}
 }
