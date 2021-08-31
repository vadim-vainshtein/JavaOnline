/*
 * Задача 8: Поменять местами два столбца матрицы. Номера столбцов пользователь вводит с клавиатуры
 */
 
 package algorithmization.matrices.task08;
 
 //класс для работы с матрицами
 import algorithmization.Matrix;
import java.util.Scanner;
 
 public class Main {
 	
 	public static void main(String[] args) {
 		
		int rows, columns;
		final int DEFAULT_DIMENSION = 4;
		final int RANGE = 10;
		
		try {
			rows = Integer.parseInt(args[0]);
			columns = Integer.parseInt(args[1]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.printf("No input, using default value rows, columns = %d\n", DEFAULT_DIMENSION);
			rows = columns = DEFAULT_DIMENSION;
		}
		catch (NumberFormatException e) {
			System.out.printf("Invalid input, using default value rows, columns = %d\n", DEFAULT_DIMENSION);
			rows = columns = DEFAULT_DIMENSION;
		}

		int[][] m = Matrix.fillInteger(rows, columns, RANGE);
		
		System.out.println("\nMatrix:");
		Matrix.print(m);
		
		System.out.printf("\nPlease enter numbers of the columns you want to swap (1 - %d:)", columns);
		Scanner scan = new Scanner(System.in);
		
		int col1 = scan.nextInt();
		
		while( col1 < 1 || col1 > columns) {
			System.out.printf("\nNumber out of range, please try again (1 - %d:)", columns);
			col1 = scan.nextInt();
		}
			
		int col2 = scan.nextInt();
		
		while( col2 < 1 || col2 > columns) {
			System.out.printf("\nNumber out of range, please try again (1 - %d:)", columns);
			col2 = scan.nextInt();
		}
		
		Matrix.swapColumns(m, col1 - 1, col2 - 1);

		System.out.println("\n\nColumns swapped:");
 		Matrix.print(m);
 	}
 }
