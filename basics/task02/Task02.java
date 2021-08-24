/*

Задача 2: вычислить значение функции Z = (b + sqrt(b^2 + 4ac)) / 2a - a^3 + b^-2
Параметры a, b и c передаются как аргументы командной строки
Функция Z описана в классе MyFunction

*/
package basics.task02;
import basics.task02.function.MyFunction;
public class Task02 {
	public static void main(String[] args) {
		
		double a, b, c;
		
		if (args.length < 3) {
			System.out.printf("%s\n", "Недостаточно аргументов.");
			return;		
		}
		
		else {
			
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			c = Double.parseDouble(args[2]);
		}
		
		MyFunction my = new MyFunction();
		double z = my.Z(a, b, c);
		System.out.printf("%s%f", "Значение функции Z: ", z);
	}
}