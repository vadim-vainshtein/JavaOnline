/*
 * Задача 3: Найти площадь правильного шестиугольника со стороной a через сумму площадей треугольников
 */
 
 /*
  * Использование: algorithmization.decomposition.task03.Main a
  * a - сторона шестиугольника
  */
 
 package algorithmization.decomposition.task03;

import algorithmization.Util;
 
 public class Main {
 	
	 public static void main(String[] args) {
		 
		 final double DEFAULT_A = 10.0;
		 double a = DEFAULT_A;
		 
		 try {
			 a = Integer.parseInt(args[0]);
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.print("No input, using a default value\n");
		 }
		 catch(NumberFormatException e) {
			 System.out.print("Invalid argument, using a default value\n");
		 }
		 
		 if(a <= 0) {
			 System.out.print("Invalid argument, using a default value\n");
			 a = DEFAULT_A;
		 }
		 
		System.out.printf("\nThe area of the hexagon with a side of %f is %f\n\n", a, Util.hexagonArea(a));
	 }
 }
