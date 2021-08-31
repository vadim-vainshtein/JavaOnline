/*
 * Задача 3: Дана матрица. Вывести k-ю строку и p-й столбец
 */
 
 package algorithmization.matrices.task03;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
 		int rows = Integer.parseInt(args[0]);
 		int columns = Integer.parseInt(args[1]);
 		int k = Integer.parseInt(args[2]);
 		int p = Integer.parseInt(args[3]);
 		
 		int[][] m = Matrix.fillInteger(rows, columns, 10);
 		
		System.out.println("\nMatrix:");
 		Matrix.print(m);
 
		System.out.printf("\nRow number %d:\n", k);
		Matrix.printRowInteger(m, k);
		System.out.printf("\n\nColumn number %d:\n", p);
 		Matrix.printColumnInteger(m, p);
 	}
 }
