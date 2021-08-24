/*
Задача 3: даны три точки A(x1,y1), B(x2,y2) и C(x3,y3)
определить, лежат ли они на одной прямой
*/

package basics.branching.task03;
import basics.branching.task03.line.Line;

public class Task03 {
	
	public static void main(String[] args) {
		
		double x1, y1, x2, y2, x3, y3;
		
		x1 = Double.parseDouble(args[0]);
		y1 = Double.parseDouble(args[1]);
		x2 = Double.parseDouble(args[2]);
		y2 = Double.parseDouble(args[3]);
		x3 = Double.parseDouble(args[4]);
		y3 = Double.parseDouble(args[5]);
		
		Line line = new Line(x1, y1, x2, y2);
		
		if(line.hasPoint(x3,y3)) {
			System.out.println("The points are on the same line");
		}
		else {
			System.out.println("The points aren't on the same line");
		}
	}
}
