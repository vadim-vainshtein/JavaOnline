package algorithmization.decomposition.task04;
import java.lang.Math;

/**
 * Класс, описывающий точку на плоскости
 */
 
public class Point {
	private double x, y;

	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double value) {
		x = value;
	}
	
	public void setY(double value) {
		y = value;
	}
	
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * определяет расстояние до другой точки
	 * @param p - точка, до которой требуется определить расстояние
	 * @return возвращает расстояние до точки p
	 */
	public double distanceTo(Point p) {
		
		return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
	}
	
	/**
	 * определяет две точки в массиве, расстояние между которыми максимально. Индексы найденных точек записываются в массив result
	 * @param array - массив точек
	 * @return  возвращает массив из двух элементов int, в котором сохранятся индексы найденных точек
	 */
	 
	 public static int[] mostDistant(Point[] array) {
	 	
	 	int[] result = {0, 0};
	 	double maxDistance = 0;
	 	double dist;
	 	
	 	for(int i = 0; i < array.length; i++) {
	 		for(int j = i + 1; j < array.length; j++) {
	 			if((dist = array[i].distanceTo(array[j])) > maxDistance) {
	 				maxDistance = dist;
	 				result[0] = i;
	 				result[1] = j;
	 			}
	 		}
	 	}
	 	
	 	return result;
	 }
}
