/*
Задача 6: проверить, находится ли заданная точка
внутри области, изображённой на рисунке в задании

Для описания точки используется класс Point 
(basics.task06.point.Point), имеющий метод
checkCoordinates() для проверки принадлежности
точки к заданной области

для экономии времени проверки входных данных опущены
*/

package basics.task06;
import basics.task06.point.Point;

public class Task06 {
	public static void main(String[] args){
		Point point = new Point();
		String message = new String();
		point.setX(Integer.parseInt(args[0]));
		point.setY(Integer.parseInt(args[1]));
		
		//заранее подготовим часть сообщения
		message = "Point (" + point.getX() + 
				"," + point.getY() + ") ";
		
		if(point.checkCoordinates()) {
			message += "is inside the area";
		}
		else {
			message += "is outside the area";
		}
		
		System.out.println(message);
	}
}