/*
 * Задача 6: Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера
 */

package basics.loops.task06;

public class Main {
	
	public static void main(String[] args) {
		
		char c;
		int code;
		
		for(c = 'a'; c < 'A'; c++) {
			System.out.print(c + '\n');
		}
	}
}
