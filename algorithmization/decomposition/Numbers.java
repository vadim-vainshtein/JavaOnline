package algorithmization.decomposition;

import java.util.ArrayList;
import algorithmization.Util;

public class Numbers {
	/**
	 * Класс, хранящий массив чисел, построенных по опредлённому правилу
	 */
	 
	 // количество чисел неизвестно, будем заполнять массив по мере поступления, используем список
	 private ArrayList<Integer> numbers;
	 private static int[] digits;
	 
	 public Numbers(int n) {
	 	
	 	numbers = new ArrayList<Integer>();
	 	digits = new int[n];
	 }
	 
	 public void initDigitsAscending() {
	 	/**
	 	 * Заполняет массив числами, составленными из цифр, образующих строго возрастающую последовательность
	 	 * Использует рекурсивную функцию digitsAscending(), вызывая её для нулевого индекса массива
	 	 */
	 	 
	 	digitsAscending(0);
	 }
	 
	 
	 public void initDigitsOdd() {
	 	/**
	 	 * Заполняет массив числами, составленными из нечётных цифр
	 	 * Использует рекурсивную функцию digitsOdd(), вызывая её для нулевого индекса массива
	 	 */
	 	 
	 	digitsOdd(0);
	 }
	 
	 
	 private void digitsAscending(int index) {
	 	/**
	 	 * Метод последовательно заполняет элемент index в массиве digits цифрами, большими предущего элемента,
	 	 * и для каждой цифры рекурсивно вызывает сам себя с параметром index+1
	 	 * При вызове для последнего элемента массива добавляет число, составленное из цифр в массиве digits, в список numbers
	 	 */
	 	 
	 	 int firstDigit = (index == 0) ? 1 : digits[index - 1] + 1;
	 	 
	 	 for(int i = firstDigit; i < 10; i++) {
	 	 	
			 digits[index] = i;
			 // если имеем дело с последним разрядом - записываем полученное число
	 	 	if(index == digits.length - 1) {
				int n = Util.buildNumberFromDigits(digits);
				numbers.add(n);
	 	 	}
	 	 	// если нет, то двигаемся по разрядам дальше
	 	 	else {
				digitsAscending(index + 1);
	 	 	}
	 	 }
	 }
	 
	 
	 private void digitsOdd(int index) {
	 	/**
	 	 * Рекурсивно заполняет разряды числа (digits) нечётными цифрами, сохраняя все получающиеся числа в списке numbers
	 	 */
	 	 
	 	 for(int i = 1; i < 10; i +=2 ) {
	 	 	// если имеем дело с последним разрядом - записываем полученное число
	 	 	if(index == digits.length - 1) {
	 	 		numbers.add(Util.buildNumberFromDigits(digits));
	 	 	}
	 	 	// если нет, то двигаемся по разрядам дальше
	 	 	else {
				digitsOdd(index + 1);
	 	 	}
	 	 }
	 }
	 
	 
	 public int[] toArray() {
	 	
	 	int[] array = new int[numbers.size()];
	 	for(int i = 0; i < array.length; i++) {
	 		array[i] = numbers.get(i);
	 	}
	 	
	 	return array;
	 }
}
