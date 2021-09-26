/**
 * Task 4: Find the number of numbers in a string
 */
 
package strings.as_array.task04;

public class Task04 {
	public static void main (String[] args) {
		
		String input = "324 numbers 009876 num5437bers 0897";
		int numberOfNumbers = countNumbers(input);
		
		System.out.println("Input string:\n" + input);
		System.out.println("Number of numbers in the string: " + numberOfNumbers);
	}
	
	
	private static int countNumbers(String string) {
		/**
		 * Counts the number of numbers in a string
		 * @param string - string to search for numbers
		 * @return returns the number of numbers in the string
		 */
		 
		 int numbersCount = 0;
		 char[] array = string.toCharArray();
		 
		 int i;
		 boolean isNumber;
		 for(i = 0; i < array.length; i++) {
		 	
		 	isNumber = false;
		 	while( (i < array.length) && (Character.isDigit(array[i])) ) {
		 		i++;
		 		isNumber = true;
		 	}
		 	
		 	if(isNumber) {
		 		numbersCount++;
		 	}
		 }
		 
		 return numbersCount;
	}
}