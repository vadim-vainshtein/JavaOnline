package algorithmization;

import algorithmization.Array;
import java.lang.Math;

/** Matrix - класс для работы с матрицами.
 * Матрица задана двумерным массивом m[rows][columns]
 * @author Vadim Vainshtein
 * @version 2021.09.03.02
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
	
	/** Заполняет матрицу случайными неотрицательными целыми числами
	 @param rows - количество строк
	 @param columns - количество столбцов
	 @param range - диапазон допустимых значений [-range, range]
	 @return возвращает указатель на созданную матрицу (двумерный массив)
	 */
	
	public static int[][] fillUnsigned(int rows, int columns, int range) {
		
		int[][] m = new int[rows][];
		
		for(int i = 0; i < rows; i++) {
			m[i] = Array.fillUnsigned(columns, range);
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
	
	/** Меняет столбцы местами
	 * @param m - матрица
	 * @param col1 - первый столбец
	 * @param col2 - второй столбец
	 */
	public static void swapColumns(int[][] m, int col1, int col2) {
		
		int buffer;
		for(int i = 0; i < m.length; i++) {
			buffer = m[i][col1];
			m[i][col1] = m[i][col2];
			m[i][col2] = buffer;
		}
	}
	
	/**
	 * Меняет элементы столбца матрицы местами
	 * @param m - матрица
	 * @param column - столбец
	 * @param a - первый элемент
	 * @param b - второй элемент
	 */
	 
	 public static void swapColumnElements(int[][] m, int column, int a, int b) {
	 	
	 	int tmp = m[a][column];
	 	m[a][column] = m[b][column];
	 	m[b][column] = tmp;
	 }
	
	/** Вычисляет сумму элементов столбца матрицы
	 * @param m - матрица
	 * @param column - номер столбца
	 * @return возвращает сумму элементов столбца
	 */
	 
	 public static int columnSum(int[][] m, int column) {
	 	
	 	int result = 0;
	 	
	 	for(int i = 0; i < m.length; i++) {
	 		result += m[i][column];
	 	}
	 	
	 	return result;
	 }
	 
	 /**
	  * Сортирует строки матрицы по возрастанию
	  * @param m - матрица для сортировки
	  */
	 
	 public static void sortRows(int[][] m) {
		 
		 for(int i = 0; i < m.length; i++) {
			 Array.sortBubble(m[i]);
		 }
	 }
	 
	 /**
	  * Сортирует строки матрицы по убыванию
	  * @param m - матрица для сортировки
	  */
	 
	 public static void sortRowsDown(int[][] m) {
		 
		 for(int i = 0; i < m.length; i++) {
			 Array.sortDownSelection(m[i]);
		 }
	 }
	 
	 /**
	  * Сортирует столбцы матрицы по возрастанию
	  * @param m - матрица для сортировки
	  */
	 
	 public static void sortColumns(int[][] m) {
		 
		 for(int i = 0; i < m[0].length; i++) {
			 for(int j = m.length - 1; j > 0; j--) {
			 	for(int k = 0; k < j; k++) {
			 		if(m[k][i] > m[k+1][i]) {
			 			swapColumnElements(m, i, k, k+1);
			 		}
			 	}
			 }
		 }
	 }
	 
	 /**
	  * Сортирует столбцы матрицы по убыванию
	  * @param m - матрица для сортировки
	  */
	 
	 public static void sortColumnsDown(int[][] m) {
		 
		 for(int i = 0; i < m[0].length; i++) {
			 for(int j = 0; j < m.length; j++) {
			 	for(int k = m.length-1; k > j; k--) {
			 		if(m[k-1][i] < m[k][i]) {
			 			swapColumnElements(m, i, k, k-1);
			 		}
			 	}
			 }
		 }
	 }
	 
	 /**
	  * Перемешивает элементы столбцов случайным образом
	  * @param m - матрица, элементы которой требуется перемешать
	  */
	 
	 public static void shuffle(int[][] m) {
		 
		 for(int i = 0; i < m[0].length; i++) {
			 for(int j = 0; j < m.length; j++) {
				  int randomElement = (int)(Math.random() * (m.length - 1));
				  swapColumnElements(m, i, j, randomElement);
			 }
		 }
	 }
}
