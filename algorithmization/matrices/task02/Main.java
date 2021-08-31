/*
 * Задача 2: Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
 */
 
 package algorithmization.matrices.task02;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
 		int n = Integer.parseInt(args[0]);
 		
 		int[][] m = Matrix.fillInteger(n, n, 10);
		
		System.out.println("\nMatrix:");
		Matrix.print(m);
		
		System.out.println("\nDiagonal:");
 		Matrix.printDiagonalInteger(m);
 	}
 }
