/*
 * Задача 4: Заполнить нечётные строки матрицы строкой {1, 2, ..., n}, чётные - {n, n-1, ..., 1}
 */
 
 package algorithmization.matrices.task04;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
 		int n = Integer.parseInt(args[0]);
		int[][] m = new int[n][];
 		
		//инициализируем первые две строки, затем просто размножим их
		m[0] = new int[n];
		m[1] = new int[n];

		for(int i = 0; i < n; i++) {
			m[0][i] = i +1;
			m[1][i] = n - i;
		}
		
		for(int i = 2; i < n; i++) {
			m[i] = m[i % 2]; // в чётные строки скопируем m[0], в нечётные - m[1]
		}

		System.out.println("\nMatrix:");
 		Matrix.printInteger(m);
 	}
 }
