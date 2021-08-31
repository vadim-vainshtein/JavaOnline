/*
 * Задача 1: Дана матрица. Вывести на экран нечётные столбцы, у которых первый элемент больше последнего
 */
 
 package algorithmization.matrices.task01;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 
 public class Main {
 	
 	public static void main(String[] args) {
		
		int rows, columns;
		
		try {
			rows = Integer.parseInt(args[0]);
			columns = Integer.parseInt(args[1]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Not enough arguments. Please pass number of rows and columns of the matrix in the command line");
			return;
		}
		catch (NumberFormatException e) {
			System.out.println("Got argument(s) of a wrong type. Please pass number of rows and columns of the matrix");
			return;
		}
		
		if( (rows < 1) || (columns < 1) ) {
			System.out.println("Got argument(s) of a wrong type. Please pass number of rows and columns of the matrix");
			return;
		}
 		
 		int[][] m = Matrix.fillInteger(rows, columns, 10);
		
		System.out.println("Matrix:");
		Matrix.print(m);
		
		System.out.println("\nНечётные столбцы, у которых первый элемент больше последнего:");
		
		// столбцы будут выведены подряд сверху вниз. Не очень удобно, но задача форматирования требует отдельных усилий
 		for(int i = 0; i < columns; i+=2) {
 			if(m[0][i] > m[rows-1][i]) {
 				Matrix.printColumnInteger(m, i);
				System.out.println("");
 			}
 		}
 	}
 }
