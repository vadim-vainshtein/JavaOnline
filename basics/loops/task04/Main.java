/*
 * Задача 4: Составить программу нахождения произведения квадратов первых двухсот чисел
 */

package basics.loops.task04;

import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) {
		
		BigInteger result = new BigInteger("1");
		
		for(int i = 1; i <= 200; i++) {
			
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		result = result.pow(2);
		System.out.println("(200!)^2 = " + result.toString());
	}
}
