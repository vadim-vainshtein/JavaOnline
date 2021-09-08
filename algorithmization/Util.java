package algorithmization;

import java.lang.Math;

/**
 * Util - класс с разными методами для облегчения выполнения заданий
 */
public class Util {
 	
 	/**
 	 * Сформировать ряд простых чисел от 2 до n
	 * @param n - число, до которого следует искать простые числа
	 * @return возвращает массив простых чисел от 2 до n
	 */
	public static int[] primeNumbers(int n) {
		
		// массив, в котором составные индексы будут помечены false;
		boolean[] prime = new boolean[n+1];
		// для начала - все true
		for(int i = 2; i <= n; i++) {
			prime[i] = true;
		}
		
		int sqrtN = (int)Math.sqrt(n);
		// теперь пометим false все составные числа
		for(int i = 2; i <= sqrtN; i++) {
			if(prime[i]) {
				for(int j = i + 1; j <= n; j++) {
					if(prime[j] && (j % i == 0)) {
						prime[j] = false;
					}
				}
			}
		}
		
		int primesCount = 0;
		// посчитаем простые числа
		for(int i = 2; i <= n; i++) {
			if(prime[i]) {
				primesCount++;
			}
		}
		
		// соберём простые числа вместе
		
		int[] result = new int[primesCount];		
		for(int i = 2, j = 0; i <= n; i++) {
			if(prime[i]) {
				result[j++] = i;
			}
		}
		
		return result;
	}
	
	/**
	 * Находит НОД чисел a и b
	 * @param a,b - натуральные числа
	 * @return Возвращает НОД(a, b)
	 */
	 public static int GCD(int a, int b) {
	 
		if(a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		int result = 1;
		/* будем тупо проверять все числа подряд. Можно было бы разложить на простые множители,
		 но похоже, это в сумме займёт сильно больше времени, чем простой перебор */
		for(int i = b; i > 0; i--) {
			if( (a % i == 0) && (b % i == 0) ) {
				result = i;
				break;
			}
		}
		
		return result;
	}
	
	/**
	 * Находит НОК чисел a и b
	 * @param a,b - натуральные числа
	 * @return Возвращает НОК(a, b)
	 */
	public static int LCM(int a, int b) {
	
		return a * b / GCD(a, b);
	
	}
	
	/**
	 * Вычисляет площадь треугольника по двум сторонам и углу между ними
	 * @param a - длина первой стороны
	 * @param b - второй стороны
	 * @param alpha - угол между сторонами в радианах
	 * @return Возвращает площадь треугольника
	 */
	public static double triangleArea(double a, double b, double alpha) {
		
		return a * b * Math.sin(alpha) / 2;
	}
	
	/**
	 * Вычисляет площадь правильного шестиугольника со стороной a
	 * @param a - длина стороны шестиугольника
	 * @return Возвращает площадь шестиугольника
	 */
	public static double hexagonArea(double a) {
		
		return triangleArea(a, a, Math.PI / 3) * 6;
	}
	
	public static boolean areCoprime(int[] array) {
		/**
		 * Определяет, являются ли числа в массиве взаимно простыми
		 * @param array - массив натуральных чисел
		 * @return Возвращает true, если числа в массиве попарно взаимно простые, и false, если есть хотя бы два числа, имеющих общий делитель > 1
		 */
		 
		 for(int i = 0; i < array.length - 1; i++) {
		 	for(int j = i + 1; j < array.length; j++) {
		 		if(GCD(array[i], array[j]) > 1) {
		 			return false;
		 		}
		 	}
		 }
		 
		 return true;
	}
	
	public static int[] residueClass(int mod, int from, int to, int residue) {
		/**
		 * Находит ряд чисел, сравнимых с residue по модулю mod, в пределах [from, to]
		 * @param mod - модуль
		 * @param from - нижняя граница возвращаемого подмножества класса вычетов
		 * @param to - верхняя граница возвращаемого подмножества
		 * @param residue - вычет (экземпляр класса вычетов)
		 * @return Возвращает массив, содержащий все вычеты, сравнимые с result по модулю mod, между from и to
		 */
		
		int offset = residue % mod;
		int first = from - (from % mod) + offset;
		if(offset < (from % mod)) {
			first += mod;
		}
		
		int last = to - (to % mod) + offset;
		if(offset > (to % mod)) {
			last -= mod;
		}
		 
		int[] result = new int[(last - first) / mod + 1];
		 
		for(int i = 0; i < result.length; i++) {
			result[i] = first + mod * i;
		}
		 
		return result;
	}
	
	public static int factorial(int value) {
		/**
		 *@return Возвращает факториал value
		 */
		 
		 int result = 1;
		 for(int i = 2; i <= value; i++) {
		 	result *= i;
		 }
		 
		 return result;
	}
	
	public static int sum(int[] array) {
		/**
		 * @return Возвращает сумму всех элементов массива array
		 */
		int result = 0;
		for(int i = 0; i < array.length; i++) {
			result += array[i];
		}
		
		return result;
	}
 }
