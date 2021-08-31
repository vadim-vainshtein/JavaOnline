/*
 * Задача 1: Дана матрица. Вывести на экран нечётные столбцы, у которых первый элемент больше последнего
 */
 
 package algorithmization.matrices.task01;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
 		int rows = Integer.parseInt(args[0]);
		int columns = Integer.parseInt(args[1]);
 		
 		int[][] m = new int[rows][columns];
 		
 		Matrix.fillInteger(m, rows, columns);

		// столбцы будут выведены подряд сверху вниз. Не очень удобно, но задача форматировпния требует отдельных усилий
 		for(int i = 0; i < columns; i+=2) {
 			if(m[0][i] > m[rows-1]) {
 				Matrix.printColumnInteger(m, i);
 			}
 		}
 	}
 }