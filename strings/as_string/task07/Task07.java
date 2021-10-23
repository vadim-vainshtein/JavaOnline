/**
 * Task 7: Remove all the spaces and repeated characters from a given string*
 */


package strings.as_string.task07;

public class Task07 {
	
	public static void main(String[] args) {
		
		String input = "Just some string";
		String output = removeRepeated(input);
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}
	
	private static String removeRepeated (String str) {
	
	/**
	 * Creates a new string from an existing one removing all the repeated characters
	 */
	 
		StringBuilder repeatedChars = new StringBuilder(" "); // space symbol is already there, because we need to remove all of them
		StringBuilder result = new StringBuilder();
		
		str.chars().mapToObj(c -> (char)c).forEach(
			c -> append(c, result, repeatedChars));
		
		return result.toString();
	}
	
	private static void append(char c, StringBuilder result, StringBuilder repeatedChars) {
		/**
		 * Appends a character c to the result if the character is not present in the repeatedChars sequence.
		 * After appending adds c to the repeatedChars.
		 */
		 
		 if(repeatedChars.indexOf(String.valueOf(c)) == -1) {
		 	result.append(c);
		 	repeatedChars.append(c);
		 }
	}
	
	
}
