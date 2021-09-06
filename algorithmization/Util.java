package algorithmization;

import java.lang.Math;

/**
 * Util - класс с разными методами для облегчения выполнения заданий
 */
public class Util {
 	
 	/**
 	 * Найти ряд простых чисел от 2 до n
	 * @param n - число, до которого следует искать простые числа
	 * @return возвращает массив простых чисел от 2 до n
	 */
	public static int[] primeNumbers(int n) {
		
		массив, в котором составные индексы будут помечены false;
		boolean[] prime = new boolean[n+1];
		// для начала - все true
		for(int i = 2; i <= n; i++) {
			prime[i] = true;
		}
		
		int sqrtN = (int)Math.sqrt(n);
		int primeCount = 1;
		теперь пометим false все составные числа
		for(i = 2; i <= sqrtN; i++) {
			if(prime[i]) {
				for(int j = i + 1; j <= n; j++) {
					if(prime[j] && (j % i == 0)) {
						prime[j] = false;
					}
					else {
						primeCount++;
					}
				}
				
				
			}
		}
		
		int[] result = new int[primeCount];
		for(int i = 2, primeCount = 0; i <= n; i++) {
			if(prime[i]) {
				result[primeCount++] = i;
			}
		}
		
		return result;
	}
 }