/*
 * Задача 15: Сформировать случайную матрицу mxn, заполненную нулями и единицами, причём в каждом столбце число единиц равняется номеру столбца
 */
 
/*
 * Использование: task15.Main m n;
 * m, n - количество строк и столбцов матрицы
 */

 package algorithmization.matrices.task15;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
		final int DEFAULT_LENGTH = 6;
		final int RANGE = 10;
		int m = DEFAULT_LENGTH;
		int n = DEFAULT_LENGTH;
		
		try {
			m = Integer.parseInt(args[0]);
			n = Integer.parseInt(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\n Not enough arguments, using a default value: " + DEFAULT_LENGTH);
		}
		catch(NumberFormatException e) {
			System.out.println("\n Invalid input, using a default value: " + DEFAULT_LENGTH);
		}
		
		if(m <= 0) {
			System.out.println("\n Invalid input, using a default value: " + (m = DEFAULT_LENGTH));
		}
		if(n <= 0) {
			System.out.println("\n Invalid input, using a default value: " + (n = DEFAULT_LENGTH));
		}
		
		int[][] matrix = Matrix.fillInteger(m, n, RANGE);
		int max = Matrix.max(matrix);
		
		System.out.println("\nMatrix:");
		Matrix.print(matrix);
		
		// Заменяем нечётные элементы на max
		for(int i = 0; i < matrix.length; i++) {
			for(int j =0; j < matrix[i].length; j++) {
				if(matrix[i][j] % 2 != 0) {
					matrix[i][j] = max;
				}
			}
		}
		
		System.out.println("\nMaximum: " + max);
		
		/*
		 * Если имеются в виду элементы, нечётные по индексам, а не по значению, то решение, например, такое:
		 * 
		 * 	for(int i = 1; i < matrix.length; i+=2) {
		 *	 	for(j =1; j < matrix[i].length; j+=2) {
		 * 			matrix[i][j] = max;
		 *		}
		 *	}
		 */
		
		System.out.println("\nNew matrix:");
		Matrix.print(matrix);
 	}
 }
