/*
 * Задача 9: Дана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму
 */
 
 package algorithmization.matrices.task10;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 import algorithmization.Array;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
 		int rows, columns;
		final int DEFAULT_DIMENSION = 4;
		final int RANGE = 10;
		
		try {
			rows = Integer.parseInt(args[0]);
			columns = Integer.parseInt(args[1]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.printf("No input, using default value rows, columns = %d\n", DEFAULT_DIMENSION);
			rows = columns = DEFAULT_DIMENSION;
		}
		catch (NumberFormatException e) {
			System.out.printf("Invalid input, using default value rows, columns = %d\n", DEFAULT_DIMENSION);
			rows = columns = DEFAULT_DIMENSION;
		}
		
 		int[][] m = Matrix.fillUnsigned(rows, columns, RANGE);
 		int[] columnSums = new int[columns];
 		
 		for(int i = 0; i < columns; i++) {
 			columnSums[i] = Matrix.columnSum(m, i);
 		}
 		
 		int indexOfMax = Array.indexOfMax(columnSums);
 		
		System.out.println("\nMatrix:");
 		Matrix.print(m);
		
		System.out.printf("\nSums of the columns:\n");
		Array.printInteger(columnSums);
		
		System.out.printf("\nColumn of the maximum sum %d (n.%d):\n", columnSums[indexOfMax], indexOfMax);
		Matrix.printColumnInteger(m, indexOfMax);
 	}
 }
