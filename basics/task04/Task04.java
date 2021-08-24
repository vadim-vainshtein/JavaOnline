/*
Задача 4:
*/
package basics.task04;
import basics.task04.swapper.Swapper;

public class Task04 {
	public static void main(String[] args) {
		
		final int ARGS_COUNT = 1;
		Swapper swapper = new Swapper();
		
		if (args.length < ARGS_COUNT) {
			System.out.printf("%s\n", "Недостаточно аргументов.");
			return;		
		}
		
		else {
			swapper.setData(Double.parseDouble(args[0]));
		}
		
		swapper.swap();
		swapper.printData();
	}
}