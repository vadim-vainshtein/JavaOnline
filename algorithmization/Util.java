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
	
 }
