/**
 * Task 9: Count the number of small and capital letters in a string
 */

package strngs.as_string.task09;

public class Task09 {
	
	public static void main (String[] args) {
		
		String input = "There is a String. It has CAPITAL and Small letters, and some puntuation as well...";
		StringProperties props = new StringProperties(input);
		
		System.out.println("Input: " + input);
		System.out.println("Number of lower case letters: " + props.getNumberOfLowerCase());
		System.out.println("Number of upper case letters: " + props.getNumberOfUpperCase());
	}
} 

class StringProperties {
	
	private int numberOfUpperCase, numberOfLowerCase;
	private String str;
	
	StringProperties(String str) {
		this.str = str;
		numberOfUpperCase = 0;
		numberOfLowerCase = 0;
		str.chars().mapToObj(c -> (char)c).
		forEach(c -> countChar(c));
	}
	
	public int getNumberOfUpperCase() {
		return numberOfUpperCase;
	}
	
	public int getNumberOfLowerCase() {
		return numberOfLowerCase;
	}
	
	private void countChar(char c) {
		
		if(Character.isUpperCase(c)) {
			numberOfUpperCase++;
		}
		else if(Character.isLowerCase(c)) {
			numberOfLowerCase++;
		}
	}
}