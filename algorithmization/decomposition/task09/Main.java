/**
 * Задача 9: Даны длины сторон четырёхугольника - x, y, z, t. Написать метод(ы) вычисления его площади, если угол между x и y - прямой
 */
 
 package algorithmization.decomposition.task09;
 
 import algorithmization.Util;
 import java.lang.Math;
 
 public class Main {
 	
	public static void main (String[] args) {

		System.out.println(quadrilateralArea(3, 4, 4, 3));
	}
	
	public static double quadrilateralArea(double x, double y, double z, double t) {
		/**
		 * Вычисляет площадь четырёхугольника, исходя из предположения, что угол между x и y прямой
		 */
		
		double hypotenuse = Math.sqrt(x*x + y*y);
		double S1 = x * y / 2;
		double S2 = Util.triangleAreaBySides(z, t, hypotenuse);
		
		return S1 + S2;
	}
 }
