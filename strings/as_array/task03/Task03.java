/**
 * Task 3: Find all the digits in a string
 */
 
package strings.as_array.task03;

import java.util.ArrayList;

public class Task03 {

	public static void main (String[] args) {
		
		String input = "A string (4) with 3 digits (8)";
		int[] digitIndices = findDigits(input);
		
		System.out.println("The string:\n" + input );
		System.out.println("Digits in the string:");
		
		for(int i = 0; i < digitIndices.length; i++) {
			System.out.println(input.charAt(digitIndices[i]) + " at the position " + digitIndices[i]);
		}
	}
	
	private static int[] findDigits(String string) {
		
		/**
		 * finds all the digits in a string
		 * @param string - a string to search for digits in
		 * @return returns an array of indices of characters containing digits
		 */
		
		char[] array = string.toCharArray();
		ArrayList<Integer> digitIndices = new ArrayList<>();
		
		for(int i = 0; i < array.length; i++) {
			// Check if the symbol is a digit, could be replaced with Character.isDigit()
			if(array[i] >= '0' && array[i] <= '9') {
				digitIndices.add(i);
			}
		}
		
		int[] result = new int[digitIndices.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = digitIndices.get(i);
		}
		
		return result;
	}
	
}