/**
 * Задача 16: Построить магический квадрат порядка n
 */

package algorithmization.matrices.task16;

import algorithmization.Matrix;

public class Main {
	
	public static void main(String[] args) {
		
		final int n = 7;
		
		int[][] magicMatrix = Matrix.magic(n);
		
		System.out.println("");
		Matrix.print(magicMatrix);
		System.out.println("");
	}
}
