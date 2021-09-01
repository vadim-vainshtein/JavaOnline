/*
 * Задача 10: найти положительные элементы главной диагонали квадратной матрицы
 */
 
 package algorithmization.matrices.task10;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 import algorithmization.Array;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
 		int n;
		final int DEFAULT_DIMENSION = 4;
		final int RANGE = 10;
		
		try {
			n = Integer.parseInt(args[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.printf("No input, using default value n = %d\n", DEFAULT_DIMENSION);
			n = DEFAULT_DIMENSION;
		}
		catch (NumberFormatException e) {
			System.out.printf("Invalid input, using default value n = %d\n", DEFAULT_DIMENSION);
			n = DEFAULT_DIMENSION;
		}
		
 		int[][] m = Matrix.fillInteger(n, n, RANGE);
 		int[] mainDiagonalPositive = new int[n];
		int positiveCount = 0;
 		
 		for(int i = 0; i < n; i++) {
 			if(m[i][i] > 0) {
				mainDiagonalPositive[positiveCount++] = m[i][i];
			}
 		}
 		
		System.out.println("\nMatrix:");
 		Matrix.print(m);
		
		System.out.printf("\nPositive elements on the main diagonal:\n");
		Array.printInteger(mainDiagonalPositive, positiveCount);
		System.out.println("");
 	}
 }
