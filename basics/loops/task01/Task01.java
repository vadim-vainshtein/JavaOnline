/*
Задача 1: просуммировать все числа от 1 до введённого пользователем числа
*/

package basics.loops.task01;

import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
		
		int userNumber, result = 0;
		
		System.out.print("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		
		userNumber = sc.nextInt();
		
		for(int i = 1; i <= userNumber; i++) {
			result += i;
		}
		
		System.out.println("Result: " + result);
	}
}
