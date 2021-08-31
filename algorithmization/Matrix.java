package algorithmization;

import algorithmization.Array;

/** Matrix - класс для работы с матрицами.
 * Матрица задана двумерным массивом m[rows][columns]
 * @author Vadim Vainshtein
 * @version 1.09.2021
 */
public class Matrix {
	
	/** Заполняет матрицу случайными целыми числами
	 @param rows - количество строк
	 @param columns - количество столбцов
	 @param range - диапазон допустимых значений [-range, range]
	 @return возвращает указатель на созданную матрицу (двумерный массив)
	 */
	
	public static int[][] fillInteger(int rows, int columns, int range) {
		
		int[][] m = new int[rows][];
		
		for(int i = 0; i < rows; i++) {
			m[i] = Array.fillInteger(columns, range);
		}
		
		return m;
	}
	
	/** Выводит матрицу на экран
	 @param m - матрица, которую необходимо вывести
	 */
	
	public static void print(int[][] m) {
		for(int i = 0; i < m.length; i++) {
			
			System.out.print("\n(");
			for(int j = 0; j < m[i].length; j++) {
				System.out.printf("%d\t", m[i][j]);
			}
			System.out.print(")");
		}
		
		System.out.println("");
	}
	
	public static void print(double[][] m) {
		for(int i = 0; i < m.length; i++) {
			
			System.out.print("\n(");
			for(int j = 0; j < m[i].length; j++) {
				System.out.printf("%.2f\t", m[i][j]);
			}
			System.out.print(")");
		}
		
		System.out.println("");
	}
	
	/** Выводит на экран столбец целочисленной матрицы
	@param m - матрица
	@param column - номер столбца (начиная с 0)
	*/
	public static void printColumnInteger(int[][] m, int column) {
		
		for(int i = 0; i < m.length; i++) {
			System.out.printf("(%d)\n", m[i][column]);
		}
	}
	
	/** Выводит на экран строку целочисленной матрицы
	 @param m - матрица
	 @param row - номер строки (начиная с 0)
	 */
	public static void printRowInteger(int[][] m, int row) {
		
		Array.printInteger(m[row]);
	}
	
	/** Выводит на экран диагональ целочисленной квадратной матрицы
	 @param m - квадратная матрица, диагональ которой нужно вывести
	 */
	public static void printDiagonalInteger(int[][] m) {
		
		for(int i = 0; i < m.length; i++) {
			System.out.printf("%d; ", m[i][i]);
		}
		System.out.println("");
	}
}
