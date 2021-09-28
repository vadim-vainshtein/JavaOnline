/**
 * Task 2: Insert a symbol 'b' after every symbol 'a' in a given string
 */

package strings.as_string.task02;

public class Task02 {
	
	public static void main (String[] args) {
		
		String input = "a string to insert a symbol 'b' after every symbol 'a' ... a";
		String output = insertSymbols(input, 'a', 'b');
		
		System.out.println("A string before changing:\n" + input);
		System.out.println("A string after changing:\n" + output);
	}
	
	private static String insertSymbols(String input, char mark, char symbol) {
		
		StringBuilder sb = new StringBuilder(input);

		int currentIndex = sb.indexOf(Character.toString(mark), 0);
		
		while(currentIndex > -1) {
			sb.insert(++currentIndex, symbol);
			currentIndex = sb.indexOf(Character.toString(mark), currentIndex);
		}
		
		return sb.toString();
	}
}