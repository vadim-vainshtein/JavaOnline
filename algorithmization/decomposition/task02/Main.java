/*
 * Задача 2: Найти НОД четырёх натуральных чисел
 */
 
 /*
  * Использование: algorithmization.decomposition.task02.Main a b c d
  * a, b, c, d - натуральные числа
  */
 
 package algorithmization.decomposition.task02;

import algorithmization.Util;
 
 public class Main {
 	
	 public static void main(String[] args) {
		 
		 final int DEFAULT_A = 10;
		 final int DEFAULT_B = 20;
		 final int DEFAULT_C = 33;
		 final int DEFAULT_D = 44;
		 int a = DEFAULT_A;
		 int b = DEFAULT_B;
		 int c = DEFAULT_C;
		 int d = DEFAULT_D;
		 
		 try {
			 a = Integer.parseInt(args[0]);
			 b = Integer.parseInt(args[1]);
			 c = Integer.parseInt(args[2]);
			 d = Integer.parseInt(args[3]);
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.print("Not enough arguments, using a default value\n\n");
		 }
		 catch(NumberFormatException e) {
			 System.out.print("Invalid argument(s), using a default value\n\n");
		 }
		 
		 if(a <= 0) {
			 System.out.print("Invalid argument(s), using a default value\n\n");
			 a = DEFAULT_A;
		 }
		 if(b <= 0) {
			 System.out.print("Invalid argument(s), using a default value\n\n");
			 b = DEFAULT_B;
		 }
		 if(c <= 0) {
			 System.out.print("Invalid argument(s), using a default value\n\n");
			 c = DEFAULT_C;
		 }
		 if(d <= 0) {
			 System.out.print("Invalid argument(s), using a default value\n\n");
			 d = DEFAULT_D;
		 }
		 
		System.out.printf("\nThe GCD of %d, %d, %d and %d is %d\n\n", a, b, c, d, GCD(a, b, c, d));
	 }

	 public static int GCD(int a, int b, int c, int d) {
		 
		 return Util.GCD( Util.GCD(a, b), Util.GCD(c, d) );
	 }
 }
