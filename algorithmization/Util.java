package algorithmization;

import java.lang.Math;

/**
 * Util - класс с разными методами для облегчения выполнения заданий
 */
public class Util {
 	
 	public static int[] primeNumbers(int n) {
		/**
		 * Сформировать ряд простых чисел от 2 до n
		 * @param n - число, до которого следует искать простые числа
		 * @return возвращает массив простых чисел от 2 до n
		 */
		
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
	
	
	 public static int GCD(int a, int b) {
		 /**
		  * Находит НОД чисел a и b
		  * @param a,b - натуральные числа
		  * @return Возвращает НОД(a, b)
		  */ 
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
	
	public static int LCM(int a, int b) {
		/**
		 * Находит НОК чисел a и b
		 * @param a,b - натуральные числа
		 * @return Возвращает НОК(a, b)
		 */
		return a * b / GCD(a, b);
	
	}
	
	public static double triangleArea(double a, double b, double alpha) {
		/**
		 * Вычисляет площадь треугольника по двум сторонам и углу между ними
		 * @param a - длина первой стороны
		 * @param b - второй стороны
		 * @param alpha - угол между сторонами в радианах
		 * @return Возвращает площадь треугольника
		 */
		
		return a * b * Math.sin(alpha) / 2;
	}
	
	public static double triangleAreaBySides(double a, double b, double c) {
		/**
		 * Вычисляет площадь треугольника по трём сторонам (формула Герона)
		 * @param a - длина первой стороны
		 * @param b - второй стороны
		 * @param c - третьей стороны
		 * @return Возвращает площадь треугольника
		 */
		
		double p = (a + b + c) / 2;
		return Math.sqrt (p * (p - a) * (p - b) * (p - c));
	}
	
	public static double hexagonArea(double a) {
		/**
		 * Вычисляет площадь правильного шестиугольника со стороной a
		 * @param a - длина стороны шестиугольника
		 * @return Возвращает площадь шестиугольника
		 */
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
	
	public static int sum(int[] array, int first, int count) {
		/**
		 * Вычисляет сумму элементов массива
		 * @param array - входной массив
		 * @param first - элемент, с которого начинать суммирование
		 * @param count - колическто элементов, которые необходимо просуммировать
		 * @return Возвращает сумму count элементов массива array, начиная с first
		 */
		int result = 0;
		for(int i = first; i < first + count; i++) {
			result += array[i];
		}
		
		return result;
	}
	
	public static int numberOfDigits(int n) {
		/**
		 * Считает количество разрядов числа в десятичной системе
		 * @param n - натуральное число
		 * @return Возвращает количество разрядов числа numberOfDigit
		 */
		 
		 int divider;
		 for(divider = 10; n / divider > 0; divider *= 10);
		 return divider / 10;
	}
	
	public static int[] getDigits(int n) {
		/**
		 * заполняет массив цифрами натурального числа
		 * @param n - натуральное число
		 * @return массив, содержащий цифры числа n в десятичной системе
		 */
		 int numOfDigits = numberOfDigits(n);
		 int[] digits = new int[numOfDigits];

		 for(int i = numOfDigits - 1; i >= 0; i--) {
		 	digits[i] = n % 10;
		 	n /= 10;
		 }
		 
		 return digits;
	}
		
	public static int hasMoreDigits(int a, int b) {
		/**
		 * Определяет, в каком числе больше разрядов в десятичной системе
		 * @param a - первое число
		 * @param b - второе число
		 * @return Возвращает число, в которм больше десятичных разрядов
		 */
		 
		aNumOfDigits = numberOfDigits(a);
		bNumOfDigits = numberOfDigits(b);
		if(aNumOfDigits > bNumOfDigits) {
			return a;
		}
		else if(aNumOfDigits < bNumOfDigits) {
			return b;
		}
		
		else {
			return null;
		}
	}
 }
