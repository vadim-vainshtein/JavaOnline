/*
 * Задача 4: Заполнить нечётные строки матрицы строкой {1, 2, ..., n}, чётные - {n, n-1, ..., 1}
 */
 
/*
 * Использование: task04.Main rows columns;
 * n - размерность квадратной матрицы
 */

 package algorithmization.matrices.task04;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
		final int DEFAULT_LENGTH = 6;
		int n;
		
		try {
			n = Integer.parseInt(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\n Not enough arguments, using a default n: " + (n = DEFAULT_LENGTH));
		}
		catch(NumberFormatException e) {
			System.out.println("\n Invalid input, using a default n: " + (n = DEFAULT_LENGTH));
		}
		
		if(n <= 0) {
			System.out.println("\n Invalid input, using a default n: " + (n = DEFAULT_LENGTH));
		}
		
		int[][] m = new int[n][n];
 		
		//инициализируем первые две строки, затем просто размножим их
		m[0] = new int[n];
		m[1] = new int[n];

		for(int i = 0; i < n; i++) {
			m[0][i] = i +1;
			m[1][i] = n - i;
		}

		// позволю себе не писать вручную метод для копирования массива, тем более что arraycopy, по слухам, работает быстрее поэлементного копирования
		for(int i = 2; i < n; i++) {
			System.arraycopy(m[i % 2], 0, m[i], 0, n); // в чётные строки скопируем m[0], в нечётные - m[1]
		}

		System.out.println("\nMatrix:");
 		Matrix.print(m);
 	}
 }
