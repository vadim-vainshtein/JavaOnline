/*
 * Задача 1: Найти НОД и НОК двух натуральных чисел*
 */
 
 /*
  * Использование: algorithmization.decomposition.task01.Main n m
  * n, m - натуральные числа
  */
 
 package algorithmization.decomposition.task01;

import algorithmization.Util;
import algorithmization.Array;
 
 public class Main {
 	
	 public static void main(String[] args) {
		 
		 final int DEFAULT_M = 20;
		 final int DEFAULT_N = 10;
		 int m = DEFAULT_M;
		 int n = DEFAULT_N;
		 
		 try {
			 m = Integer.parseInt(args[0]);
			 n = Integer.parseInt(args[1]);
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.print("Not enough arguments, using a default value\n\n");
		 }
		 catch(NumberFormatException e) {
			 System.out.print("Invalid argument(s), using a default value\n\n");
		 }
		 
		 if(m <= 0) {
			 System.out.print("Invalid argument(s), using a default value\n\n");
			 m = DEFAULT_M;
		 }
		 if(n <= 0) {
			 System.out.print("Invalid argument(s), using a default value\n\n");
			 n = DEFAULT_N;
		 }
		 
		System.out.printf("The GCD of %d and %d is %d\n", m, n, Util.GCD(m, n));
		System.out.printf("The LCM of %d and %d is %d\n\n", m, n, Util.LCM(m, n));
	 }
 }
