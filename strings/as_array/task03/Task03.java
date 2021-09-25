/**
 * Task 3: Find all the digits in a string
 */
 
package strings.as_array.task03;

public class Main {

	public static void main (String[] args) {
		
		String input = "A string (4) with 3 digits (8)";
		int[] digitIndices = findDigits(input);
		
		System.out.println("The string:\n" + input );
		System.out.println("Digits in the string:");
		
		for(int i = 0; i < digitIndices.length; i++) {
			System.out.println(input.charAt(i) + " at the position " + i);
		}
	}
	
	private static int[] findDigits(String string) {
		
		char[] array = string.toCharArray();
	}
	
}