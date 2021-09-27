/**
 * Task 1: Count the maximum number of consecutive spaces in a string
 */
 
package strings.as_string.task01;

public class Task01 {
	
	public static void main (String[] args) {
		
		String input = "   A  string with   a  lot    of spaces      ";
		int maxNumOfSpaces = maxNumberOfSpacesV2(input);
		
		System.out.print("The input string: \"" + input + "\"\n");
		System.out.print("The maximum number of consecutive spaces: " + maxNumOfSpaces + "\n");
		
	}
	
	
	private static int maxNumberOfSpacesV1(String string) {
		/**
		 * returns the maximum number of consecutive spaces
		 * Version 1. Just one pass through the string, without using any special String class methods
		 */
		 
		 int i, spaceCount, maxNumOfSpaces = 0;
		 for(i = 0; i < string.length(); i++) {
		 
		 	spaceCount = 0;
		 	while(i < string.length() && string.charAt(i) == ' ') {
		 		spaceCount++;
		 		i++;
		 	}
		 	
		 	if(spaceCount > maxNumOfSpaces) {
		 		maxNumOfSpaces = spaceCount;
		 	}
		 }
		 
		 return maxNumOfSpaces;
	}
	
	private static int maxNumberOfSpacesV2(String string) {
		/**
		 * returns the maximum number of consecutive spaces
		 * Version 2: using String.indexOf() and StringBuilder
		 * Let's search the string for a substing containing 1, 2, etc., spaces.
		 * Stop, when there is no such substing
		 */
		 
		int spaceCount = 0, currentIndex = 0;
		// starting with one space
		StringBuilder spaceSequence = new StringBuilder(" ");
		
		// currentIndex is used to not scan whole the string every time
		currentIndex = string.indexOf(' ');
		
		while(currentIndex != -1) {
			spaceSequence.append(' ');
			currentIndex = string.indexOf(spaceSequence.toString(), currentIndex);
			spaceCount++;
		}
		
		return spaceCount;
	}
}
