/*

Задача 2: найти max{min(a,b), min(c,d)}

Все данные хранятся в массиве data
*/

package basics.branching.task02;

public class Task02 {

	public static void main(String[] args) {

		double[] data = new double[4]; //для хранения входных данных a,b,c,d
		double result;

		if(args.length < 4) {
			System.out.println("Недостаточно аргументов");
			return;
		}

		for(int i = 0; i < 4; i++) {
			data[i] = Double.parseDouble(args[i]);
		}

		result = max(min(data[0], data[1]), min(data[2], data[3]));

		System.out.println("max{min(" + data[0] + "," + data[1] + 
			"), min(" + data[2] + "," + data[3] + ")} = " + result);
	}

	private static double min(double a, double b) {
		double result = (a < b) ? a : b;
		return result;
	}

	private static double max(double a, double b) {
		double result = (a > b) ? a : b;
		return result;
	}
}