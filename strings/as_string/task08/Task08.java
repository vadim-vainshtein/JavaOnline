/**
 * Task 8: find the longest word in a given string
 */

package strings.as_string.task08;

public class Task08 {
	
	public static void main (String[] args) {
		
		String str = getString();
		String longestWord = getLongestWord(str);
		
		System.out.println("The longest word is: \n" + longestWord);
	}
	
	private static String getString() {
		/**
		 * returns a string from standard input
		 */
		 
		 //заглушка
		 return "A string with words";
	}
	
	private static String getLongestWord(String str) {
		/**
		 * returns the longest word of a String
		 */
		 
		 String words[] = str.split(" ");
		 int indexOfLongestWord = 0;
		 
		 for(int i = 0; i < words.length; i++) {
		 	
		 	if(words[i].length() > words[indexOfLongestWord].length()) {
		 		indexOfLongestWord = i;
		 	}
		 }
		 
		 return words[indexOfLongestWord];
	}
}