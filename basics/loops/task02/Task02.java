/*
 * Задача 2: вычислить значения функции y = { (x>2) ? x : -x } на отрезке [a, b] с шагом h
 * 
 */

package basics.loops.task02;

public class Task02 {
	
	public static void main(String[] args) {
		
		double a, b, h;
						
		a = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[1]);
		h = Double.parseDouble(args[2]);
		
		// количество точек, в которых будет вычислено значение функции
		int pointsNumber = (int) ((b - a) / h);
		
		// массив для хранения результатов
		double[] result = new double[pointsNumber];
		
		int i;
		double x;
		for(i = 0, x = a; i < pointsNumber; i++, x += h) {
			result[i] = Y(x);
		}
		
		System.out.println("Значения фунции Y(x) в интервале [" + a + "," + b + "] с шагом " + h);
		printResults(result);
	}
	
	private static double Y(double x) {
		
		double y = (x > 2) ? x : -x;
		return y;
	}
	
	private static void printResults(double[] result) {
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(i + ":\t" + result[i]);
		}
	}
}
