/*
 * Задача 3: найти сумму квадратов первых ста чисел
 */

package basics.loops.task03;

public class Task03 {
	
	public static void main(String[] args) {
		
		int result = 0;
		
		for(int i = 1; i  <= 100; i++) {
			result += i*i;
		}
		
		System.out.println("Сумма квадратов первых ста чисел равна " + result);
	}
}
