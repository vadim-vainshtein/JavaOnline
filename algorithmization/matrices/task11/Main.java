/*
 * Задача 11: матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран матрицу,
 * а также номера строк, в которых число 5 встречается три и более раз
 */
 
 package algorithmization.matrices.task11;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 import algorithmization.Array;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
 		final int ROWS = 10;
		final int COLUMNS = 20;
		final int RANGE = 15;
		
		int[][] m = Matrix.fillUnsigned(ROWS, COLUMNS, RANGE);
		int[] rowsWithFives = new int[ROWS];
		int rowsWithFivesCount = 0;
		
		for(int i = 0; i < ROWS; i++) {
			
			int fivesCount = 0;
			
			for(int j = 0; j < COLUMNS; j++) {
				
				if(m[i][j] == 5) {
					if(++fivesCount == 3) {
						rowsWithFives[rowsWithFivesCount++] = i;
						continue;
					}
				}
				
			}
 		}
 		
		System.out.println("\nMatrix:");
 		Matrix.print(m);
		
		System.out.printf("\nRows where the number five occurs three or more times:\n");
		Array.printInteger(rowsWithFives, rowsWithFivesCount);
		System.out.println("");
 	}
 }
