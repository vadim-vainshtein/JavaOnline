/*
 * Задача 5: Даны числовой ряд и некоторое число e. Найти сумму членов ряда, модуль которых больше или равен e.
 * Общий вид членов ряда: a = 1/(2^n) + 1/(3^n)
 */

/*
 * Использование: basics.loops.task05.Main e
 * e - точность вычисления суммы ряда
 */

package basics.loops.task05;

import java.lang.Math;

public class Main {
	
	public static void main(String[] args) {
		
		final double DEFAULT_E = 0.1;
		double e = DEFAULT_E;
		
		try {
			e = Double.parseDouble(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("No input, using a default value of e: " + DEFAULT_E);
		}
		catch(NumberFormatException ex) {
			System.out.println("Invalid input, using a default value of e: " + DEFAULT_E);
		}
		
		if(e <= 0) {
			System.out.println("e should be positive, using a default value: " + (e = DEFAULT_E));
		}
		
		double result = 0;
		double tmp;
		int i = 1;
		
		while((tmp = a(i)) >= e) {
			result += tmp;
			i++;
			System.out.println(tmp);
		}
		
		System.out.println("The sum of the members greater than e of the series is\n" + result );
	}
	
	private static double a(int n) {
		
		return 1/Math.pow(2, n) + 1/Math.pow(3, n);
	}
		
}
