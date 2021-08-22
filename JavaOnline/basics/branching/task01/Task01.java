/*

Задача 1: даны два угла в градусах. Определить, существует ли треугольник с такими углами, и является ли он прямоугольным

*/


package basics.branching.task01;
import basics.branching.task01.triangle.Triangle;

public class Task01 {

	public static void main(String[] args) {

		Triangle triangle = new Triangle();
		String message = new String();

		triangle.setAlpha(Integer.parseInt(args[0]));
		triangle.setBeta(Integer.parseInt(args[1]));

		message = "A triangle with angles " + triangle.getAlpha() +
					", " + triangle.getBeta() + "degrees ";

		if(triangle.isTriangle()) {
			if(triangle.isRight()) {
				message +="exists and it is a right triangle.";
			}
			else {
				message += "exists but it isn't a right triangle.";
			}
		}
		else {
			message += " doesn't exist.";
		}

		System.out.println(message);
	}
}