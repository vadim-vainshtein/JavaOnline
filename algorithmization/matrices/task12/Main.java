/*
 * Задача 12: Отсортировать строки матрицы по возрастанию и убыванию значений
 */
 
/*
 * Использование: task12.Main rows columns;
 * rows, columns - количество строк и столбцов матрицы
 */

 package algorithmization.matrices.task12;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
		final int DEFAULT_LENGTH = 6;
		final int RANGE = 10;
		int rows = DEFAULT_LENGTH;
		int columns = DEFAULT_LENGTH;
		
		try {
			rows = Integer.parseInt(args[0]);
			columns = Integer.parseInt(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\n Not enough arguments, using a default value: " + DEFAULT_LENGTH);
		}
		catch(NumberFormatException e) {
			System.out.println("\n Invalid input, using a default value: " + DEFAULT_LENGTH);
		}
		
		if(rows <= 0) {
			System.out.println("\n Invalid input, using a default value: " + (rows = DEFAULT_LENGTH));
		}
		if(columns <= 0) {
			System.out.println("\n Invalid input, using a default value: " + (columns = DEFAULT_LENGTH));
		}
		
		int[][] m = Matrix.fillInteger(rows, columns, RANGE);
		
		System.out.println("\nUnsorted matrix:");
 		Matrix.print(m);
		
		Matrix.sortRows(m);
		
		System.out.println("\nSorted asсending:");
		Matrix.print(m);
		
		Matrix.sortRowsDown(m);
		
		System.out.println("\nSorted descending:");
		Matrix.print(m);
 	}
 }
