/**
 * Task 6: Make a new string out of a given one repeating each symbol twice
 */

package strings.as_string.task06;

public class Task06 {
	
	public static void main(String[] args) {
		
		String input = "Just some string";
		String output = repeatSymbols(input);
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}
	
	private static String repeatSymbols(String input) {
		
		StringBuilder output = new StringBuilder("");
		input.codePoints().forEach(c -> output.append((char)c).append((char)c));
		// or output.append(c + "" + c), but this would create an additional String object for each char
		return output.toString();
	}
}
