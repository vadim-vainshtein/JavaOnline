/*

Задача 1: вычислить значение функции z = ((a - 3) * b / 2) + c
Параметры a, b и c передаются как аргументы командной строки
Функция Z описана в классе MyFunction

*/
package basics.task01;
import basics.task01.function.MyFunction;
public class Task01 {
	public static void main(String[] args) {
		
		double a, b, c;
		
		if (args.length < 3) {
			System.out.printf("%s\n", "Недостаточно аргументов.");
			return;		
		}
		
		else {
			//лучше бы здесь, наверно, использовать массив, но пусть пока так
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			c = Double.parseDouble(args[2]);
		}
		
		MyFunction my = new MyFunction();
		double z = my.Z(a, b, c);
		System.out.printf("%s%f", "Значение функции Z: ", z);
	}
}