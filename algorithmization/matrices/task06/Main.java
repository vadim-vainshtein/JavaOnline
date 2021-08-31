/*
 * Задача 6: Сформировать матрицу порядка n (n - чётное):
 * { 1 1 1 ... 1 1 1 }
 * { 0 1 1 ... 1 1 0 }
 * { 0 0 1 ... 1 0 0 }
 * { ...                   }
 * { 0 1 1 ... 1 1 0 }
 * { 1 1 1 ... 1 1 1 }
 */
 
 package algorithmization.matrices.task06;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
		int n;
		
		try {
			n = Integer.parseInt(args[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No input, using default value n = 4");
			n = 4;
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid input, using default value n = 4");
			n = 4;
		}
		
		int[][] m = new int[n][n];
 		
		int i, j;
		
		// если добавить n%2, работает для нечётных n тоже
		for(i = 0; i < n/2 + n%2; i++) {

			// запишем нули
			for(j = 0; j < i; j++) {
				m[i][j] = 0;
				m[i][n - j - 1] = 0;
				m[n - i - 1][j] = 0;
				m[n - i - 1][n - j - 1] = 0;
			}
			
			// запишем единицы
			for( ; j < n - i; j++) {
				m[i][j] = 1;
				m[n - i - 1][j] = 1;
			}
		}

		System.out.println("\nMatrix:");
 		Matrix.printInteger(m);
 	}
 }
