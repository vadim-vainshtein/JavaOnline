/*
 * Задача 7: Сформировать квадратную матрицу порядка n по правилу:
 * a[i,j] = sin( (i^2 - j^2)/n );
 */
 
 package algorithmization.matrices.task07;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 import java.lang.Math;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
		int n;
		final int DEFAULT_N = 4;
		
		try {
			n = Integer.parseInt(args[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.printf("No input, using default value n = %d\n", DEFAULT_N);
			n = DEFAULT_N;
		}
		catch (NumberFormatException e) {
			System.out.printf("Invalid input, using default value n = %d\n", DEFAULT_N);
			n = DEFAULT_N;
		}
		
		double[][] m = new double[n][n];
		
		int i, j;
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				m[i][j] = rule(i, j, n);
			}
		}

		System.out.println("\nMatrix:");
 		Matrix.print(m);
 	}
 	
 	private static double rule(int i, int j, int n) {
		return Math.sin( ((double)(i*i - j*j)) / n);
	}
 }
