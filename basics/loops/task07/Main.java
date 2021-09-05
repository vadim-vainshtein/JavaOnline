/*
 * Задача 7: Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры
 * 
 */

package basics.loops.task07;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int m = getNatural("Please enter a natural m: ");
		int n = getNatural("Please enter a natural n: ");
		
		if(m > n) {
			int tmp = m;
			m = n;
			n = tmp;
		}
		
		System.out.printf("\nMultipliers of the numbers between %d and %d:\n\n", m, n);
		
		for(int i = m; i <= n; i++) {
			
			System.out.print(i + ": ");
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					System.out.print(j + "; ");
				}
			}
			System.out.println("");
		}
	}
	
	private static int getNatural(String msg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		int result;
		while( (result = sc.nextInt()) <= 0) {
			System.out.print(result + "is not a natural number. Please try again. ");
		}
		
		return result;
	}
}
