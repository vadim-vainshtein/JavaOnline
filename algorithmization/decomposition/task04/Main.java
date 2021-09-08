/**
 * Задача 4: На плоскости заданы n точек. Наптсать метод, определяющий, между какими из пар точек максимальное расстояние.
 * Координаты точек занести в массив
 */
 
 package algorithmization.decomposition.task04;
 
 import java.nio.file.Path;
 import java.nio.file.Paths;
 import java.util.Scanner;
 import java.util.ArrayList;
  
 public class Main {
 	
 	public static void main(String[] args) {
 	
 		if(args.length == 0) {
 			System.out.print("No arguments given. Please pass a filename as an argument\n");
 			return;
 		}
 		// читаем массив точек из файла
		Point[] points = getInput(args[0]);
		
		if((points == null) || (points.length == 0)) {
			System.out.print("\nGot no input :(\n\n");
			return;
		}
		
		int[] mdp = Point.mostDistant(points);
		System.out.printf(
			"The most distant points are (%.2f, %.2f) and (%.2f, %.2f) with a distance of %.2f\n\n",
			points[mdp[0]].getX(), points[mdp[0]].getY(), 
			points[mdp[1]].getX(), points[mdp[1]].getY(),
			points[mdp[0]].distanceTo(points[mdp[1]])
			);
 	}
 	
 	public static Point[] getInput(String fileName) {
 		
		Scanner sc;
		
 		try {
 			Path path = Paths.get(fileName);
 			sc = new Scanner(path);
 		}
 		catch(Exception e) {
			System.out.print("\nCannot open file: " + e);
			return null;
 		}
 		
 		ArrayList<Point> points = new ArrayList<Point>();
 		double x, y;
 		
 		try {
 			
 			while(sc.hasNext()) {
 				x = sc.nextDouble();
 				y = sc.nextDouble();
 				points.add(new Point(x, y));
 			}
 		}
 		catch(Exception e) {
 			System.out.print("\nGot problems while parsing the input: " + e);
 			System.out.print("\nStill trying to continue...\n");
 		}
 		
 		Point[] result = new Point[points.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = points.get(i);
		}
		
 		return result;
 	}
 }
