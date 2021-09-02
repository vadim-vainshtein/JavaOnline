/*
 * Задача 2: Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
 */
 
/*
 * Использование: task02.Main rows columns;
 * n - размерность квадратной матрицы
 */


 package algorithmization.matrices.task02;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
		final int DEFAULT_LENGTH = 6;
 		int n;
		
		try {
			n = Integer.parseInt(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\n Not enough arguments, using a default n: " + (n = DEFAULT_LENGTH));
		}
		catch(NumberFormatException e) {
			System.out.println("\n Invalid input, using a default n: " + (n = DEFAULT_LENGTH));
		}
		
		if(n < 1) {
			System.out.println("\n Invalid input, using a default n: " + (n = DEFAULT_LENGTH));
		}
 		
 		int[][] m = Matrix.fillInteger(n, n, 10);
		
		System.out.println("\nMatrix:");
		Matrix.print(m);
		
		System.out.println("\nDiagonal:");
 		Matrix.printDiagonalInteger(m);
 	}
 }
