package algorithmization.decomposition.task15;

import java.util.ArrayList;
import algorithmization.Util;

public class Numbers {
	/**
	 * Класс, хранящий массив чисел, цифры которых образуют строго восходящую последовательность
	 */
	 
	 // количество чисел неизвестно, будем заполнять массив по мере поступления, используем список
	 private ArrayList<Integer> numbers;
	 private static int[] digits;
	 
	 public Numbers(int n) {
	 	
	 	numbers = new ArrayList<Integer>();
	 	digits = new int[n];
	 	findNumbers(0);
	 }
	 
	 private findNumbers(int index) {
	 	/**
	 	 * метод последовательно заполняет элемент index в массиве digits цифрами, большими предущего элемента,
	 	 * и для каждой цифры рекурсивно вызывает сам себя с параметром index+1
	 	 * При вызове для последнего элемента массива добавляет число, составленное из цифр в массиве digits, в список numbers
	 	 */
	 	 
	 	 int firstDigit = index == 0 ? 1 : digits[index - 1];
	 	 
	 	 for(int i = firstDigit; i < 10; i++) {
	 	 	
	 	 	// если имеем дело с последним разрядом - записываем полученное число
	 	 	if(index == digits.length - 1) {
	 	 		numbers.add(Util.buildNumberFromDigits(digits));
	 	 	}
	 	 	// если нет, то двигаемся по разрядам дальше
	 	 	else {
	 	 		findNumbers(index + 1);
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