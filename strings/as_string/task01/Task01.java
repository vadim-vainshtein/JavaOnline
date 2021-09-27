/**
 * Task 1: Count the maximum number of consecutive spaces in a string
 */
 
//package strings/as_string/task01;

public class Main {
	
	public static void main (String[] args) {
		
		String input = "   A  string with   a  lot    of spaces      ";
		int maxNumOfSpaces = maxNumberOfSpacesV1(input);
		
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
		 * Version 2: using 
		 */
		 return 0;
		 
	}
}