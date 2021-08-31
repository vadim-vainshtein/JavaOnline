/* Matrix - класс для работы с матрицами
 * Матрица задана двумерным массивом m[rows][columns]
 */

package algorithmization;

import algorithmization.Array;

public class Matrix {
	
	// заполнить матрицу случайными целыми числами
	public static void fillInteger(int[][] m, int range) {
		
		for(i = 0; i < m.length; i++) {
			Array.fillInteger(m[i], range);
		}
	}
	public static void printInteger(int[][] m) {
		for(i = 0; i < m.length; i++) {
			
			System.out.println("");
			for(int j = 0; j < m[i].length; j++) {
				System.out.printf("%d\t", m[i][j]);
			}
		}
		
		System.out.println("");
	}
	
	public static void printColumnInteger(int[][] m, int column) {
		
		for(int i = 0; i < m.length; i++) {
			System.out.printf("(%d)\n", m[i][column]);
		}
	}
	
	public static void printRowInteger(int[][] m, int row) {
		
		Array.printInteger(m[row]);
	}
	
	public static void printDiagonalInteger(int[][] m) {
		
		for(int i = 0; i < m.length; i++) {
			System.out.printf("%d; ", m[i][i]);
		}
		System.out.println("");
	}
}