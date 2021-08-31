/*
 * Задача 5: Сформировать матрицу:
 * { 1 1 ... 1 1 1 }
 * { 2 2 ... 2 2 0 }
 * { 3 3 ... 3 0 0 }
 * { ...                }
 * { n-1 n-1 ... 0 }
 * { n 0 0 ... 0 0 } 
 */
 
 package algorithmization.matrices.task05;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
 		int n = Integer.parseInt(args[0]);
		int[][] m = new int[n][n];
 		
		int i, j;
		
		for(i = 0; i < n; i++) {
			
			// заполняем значением i+1, сколько нужно...
			for(j = 0; j < n - i; j++) {
				m[i][j] = i + 1;
			}
			
			// ... и добиваем остальное нулями
			for( ; j < n; j ++) {
				m[i][j] = 0;
			}
		}

		System.out.println("\nMatrix:");
 		Matrix.printInteger(m);
 	}
 }
