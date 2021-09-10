package algorithmization;

import algorithmization.Array;
import java.lang.Math;

public class Matrix {
	/** Matrix - класс для работы с матрицами.
	 * Матрица задана двумерным массивом m[rows][columns]
	 * @author Vadim Vainshtein
	 * @version 2021.09.11.1
	 */
	
	public static int[][] fillInteger(int rows, int columns, int range) {
		/** Заполняет матрицу случайными целыми числами
		 * @param rows - количество строк
		 * @param columns - количество столбцов
		 * @param range - диапазон допустимых значений [-range, range]
		 * @return возвращает указатель на созданную матрицу (двумерный массив)
		 */	
		int[][] m = new int[rows][];
		
		for(int i = 0; i < rows; i++) {
			m[i] = Array.fillInteger(columns, range);
		}
		
		return m;
	}
	
	public static int[][] fillUnsigned(int rows, int columns, int range) {
		/** Заполняет матрицу случайными неотрицательными целыми числами
		 * @param rows - количество строк
		 * @param columns - количество столбцов
		 * @param range - диапазон допустимых значений [-range, range]
		 * @return возвращает указатель на созданную матрицу (двумерный массив)
		 */	
		int[][] m = new int[rows][];
		
		for(int i = 0; i < rows; i++) {
			m[i] = Array.fillUnsigned(columns, range);
		}
		
		return m;
	}
	
	public static int[][] copy(int[][] m) {
		/**
		 * Копирует матрицу
		 * @param m - исходная матрица
		 * @return Возвращает указатель на созданную копию исходной матрицы
		 */	
		int[][] result = new int[m.length][];
		
		for(int i = 0; i < m.length; i++) {
			result[i] = new int[m[i].length];
			System.arraycopy(m[i], 0, result[i], 0, m.length);
		}
		
		return result;
	}
	
	public static void print(int[][] m) {
		/** Выводит матрицу на экран
		 * param m - матрица, которую необходимо вывести
		 */
		
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
	
	public static void printColumnInteger(int[][] m, int column) {
		/** Выводит на экран столбец целочисленной матрицы
		 * @param m - матрица
		 * @param column - номер столбца (начиная с 0)
		 */	
		for(int i = 0; i < m.length; i++) {
			System.out.printf("(%d)\n", m[i][column]);
		}
	}
	
	public static void printRowInteger(int[][] m, int row) {
		/** Выводит на экран строку целочисленной матрицы
		 * @param m - матрица
		 * @param row - номер строки (начиная с 0)
		 */	
		Array.printInteger(m[row]);
	}
	
	public static void printDiagonalInteger(int[][] m) {
		/** Выводит на экран диагональ целочисленной квадратной матрицы
		 * @param m - квадратная матрица, диагональ которой нужно вывести
		 */	
		for(int i = 0; i < m.length; i++) {
			System.out.printf("%d; ", m[i][i]);
		}
		System.out.println("");
	}
	
	public static void swapColumns(int[][] m, int col1, int col2) {
		/** Меняет столбцы местами
		 * @param m - матрица
		 * @param col1 - первый столбец
		 * @param col2 - второй столбец
		 */	
		int buffer;
		for(int i = 0; i < m.length; i++) {
			buffer = m[i][col1];
			m[i][col1] = m[i][col2];
			m[i][col2] = buffer;
		}
	}
	
	public static void swapRows(int[][] m, int row1, int row2) {
		/** Меняет строки матрицы местами. Функция не производит копирования элементов, только меняет местами указатели
		 * @param m - матрица
		 * @param row1 - первая строка
		 * @param row2 - вторая строка
		 */	
		int[] tmp = m[row1];
		m[row1] = m[row2];
		m[row2] = tmp;
		
	}
	
	public static void swapColumnElements(int[][] m, int column, int a, int b) {
		/**
		 * Меняет элементы столбца матрицы местами
		 * @param m - матрица
		 * @param column - столбец
		 * @param a - первый элемент
		 * @param b - второй элемент
		 */ 	
	 	int tmp = m[a][column];
	 	m[a][column] = m[b][column];
	 	m[b][column] = tmp;
	 }
	
	public static int columnSum(int[][] m, int column) {
		/** Вычисляет сумму элементов столбца матрицы
		 * @param m - матрица
		 * @param column - номер столбца
		 * @return возвращает сумму элементов столбца
		 */ 	
	 	int result = 0;
	 	
	 	for(int i = 0; i < m.length; i++) {
	 		result += m[i][column];
	 	}
	 	
	 	return result;
	 }
	 
	 public static void sortRows(int[][] m) {
		 /**
		  * Сортирует строки матрицы по возрастанию
		  * @param m - матрица для сортировки
		  */	 
		 for(int i = 0; i < m.length; i++) {
			 Array.sortBubble(m[i]);
		 }
	 }
	 
	 public static void sortRowsDown(int[][] m) {
		 /**
		  * Сортирует строки матрицы по убыванию
		  * @param m - матрица для сортировки
		  */	 
		 for(int i = 0; i < m.length; i++) {
			 Array.sortDownSelection(m[i]);
		 }
	 }
	 
	 public static void sortColumns(int[][] m) {
		 /**
		  * Сортирует столбцы матрицы по возрастанию
		  * @param m - матрица для сортировки
		  */	 
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
	 
	 public static void sortColumnsDown(int[][] m) {
		 /**
		  * Сортирует столбцы матрицы по убыванию
		  * @param m - матрица для сортировки
		  */	 
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
	 
	 public static void shuffle(int[][] m) {
		 /**
		  * Перемешивает элементы столбцов случайным образом
		  * @param m - матрица, элементы которой требуется перемешать
		  */	 
		 for(int i = 0; i < m[0].length; i++) {
			 for(int j = 0; j < m.length; j++) {
				  int randomElement = (int)(Math.random() * (m.length - 1));
				  swapColumnElements(m, i, j, randomElement);
			 }
		 }
	 }
	 
	 public static int max(int[][] m) {
		 /**
		  * Находит наибольший элемент матрицы
		  * @param m - матрица, в которой требуется найти максимальный элемент 
		  * @return Возвращает наибольший элемент матрицы m
		  */	 
		 int result = m[0][0];
		 
		 for(int i = 0; i < m.length; i++) {
			 for(int j = 0; j < m[i].length; j++) {
				 if(result < m[i][j]) result = m[i][j];
			 }
		 }
		 
		 return result;
	 }
	 
	public static int[][] magic(int n) {
		/**
		 * Составляет "магический квадрат"  нечётного порядка методом Лубера
		 * @param n - нечётное число >= 3
		 * @return Возвращает указатель на магический квадрат порядка n в случае успеха, и null при некорректном n
		 */
		
		if( (n % 2 == 0) || (n < 3) ) {
			return null;
		}
		
		int[][] matrix = new int[n][n];
		
		// строки и столбцы матрицы. Начинаем с середины первой строки
		int i = 0;
		int j = n / 2;
		
		// двигаемся по диагонали влево вверх
		for(int k = 1; k <= n*n; k++) {
			
			// при выходе за границу квадрата переходим на противоположный его край
			if(i < 0) i = n - 1;
			if(j < 0) j = n - 1;
			
			// если ячейка уже заполнена, вернёмся обратно и сместимся на одну строку вниз
			if(matrix[i][j] != 0) {
				i++;
				j++;
				
				// При выходе за границу возвращаемся на противоположный край
				if(i == n) i = 0;
				if(j == n) j = 0;
				
				i++;
			}
			
			matrix[i--][j--] = k;
		}			
		
		return matrix;
	}
}
