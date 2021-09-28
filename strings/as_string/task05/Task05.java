/**
 * Task 5: Count the number of occurrences of letter 'a' in a given string
 */

package strings.as_string.task05;

public class Task05 {
	
	public static void main(String[] args) {
		
		String input = "an awesome string with 'a' letters inside";
		int aCount = countLetters(input, 'a');
		
		System.out.println(input);
		System.out.println("Number of 'a' letters in the string: " + aCount);
	}
	
	
	private static int countLetters(String input, char letter) {
		
		return (int)input.codePoints().filter(c -> c == letter).count();
		
	}
}
		
