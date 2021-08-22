/*
	Функция Z из задания №2
*/

package basics.task02.function;

public class MyFunction {
	public double Z (double a, double b, double c) {
		double result = (b + Math.sqrt(b*b + 4*a*c)) / 2*a - Math.pow(a, 3) + Math.pow(b, -2);
		return result;
	}
}