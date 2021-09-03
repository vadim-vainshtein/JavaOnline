/*
 * Задача 14: Сформировать случайную матрицу mxn, заполненную нулями и единицами, причём в каждом столбце число единиц равняется номеру столбца
 */
 
/*
 * Использование: task14.Main m n;
 * m, n - количество строк и столбцов матрицы
 */

 package algorithmization.matrices.task14;
 
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
		
		int[][] matrix = new int[m][n];
		
		// заполняем матрицу нулями и единицами по правилу
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matrix[j][i] = (j < i) ? 1 : 0;
			}
		}
		
		// перемешиваем столбцы
		Matrix.shuffle(matrix);
		
		Matrix.print(matrix);
 	}
 }
