/*
 * Задача 3: Дана матрица. Вывести k-ю строку и p-й столбец
 */
 
/*
 * Использование: task03.Main rows columns k p;
 * rows, columns - количество строк и столбцов создаваемой матрицы
 * k, p - номера столбца и строки для вывода
 */

 package algorithmization.matrices.task03;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
		final int DEFAULT_SIZE = 6;
		int rows = DEFAULT_SIZE;
		int columns = DEFAULT_SIZE;
		int k = DEFAULT_SIZE / 2;
		int p = DEFAULT_SIZE / 2;
		
		try {
			rows = Integer.parseInt(args[0]);
			columns = Integer.parseInt(args[1]);
			k = Integer.parseInt(args[2]);
			p = Integer.parseInt(args[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\n Not enough arguments, using default values");
		}
		catch(NumberFormatException e) {
			System.out.println("\n Invalid input, using default values");
		}
		
		if( rows < 1 ) {
			System.out.println("\n Invalid input, using default values");
			rows = DEFAULT_SIZE;
		}
		
		if( columns < 1 ) {
			System.out.println("\n Invalid input, using default values");
			columns = DEFAULT_SIZE;
		}
		
		if( k < 0 || k >= rows ) {
			System.out.println("\n Invalid input, using default values");
			k = 0;
		}
		
		if( p < 0 || p >= columns ) {
			System.out.println("\n Invalid input, using default values");
			p = 0;
		}
 		
 		int[][] m = Matrix.fillInteger(rows, columns, 10);
 		
		System.out.println("\nMatrix:");
 		Matrix.print(m);
 
		System.out.printf("\nRow number %d:\n", k);
		Matrix.printRowInteger(m, k);
		System.out.printf("\n\nColumn number %d:\n", p);
 		Matrix.printColumnInteger(m, p);
 	}
 }
