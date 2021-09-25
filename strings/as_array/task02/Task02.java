/**
 * Task 2:Replace all the occurrences of "word" with "letter" in a given string
 */

package strings.as_array.task02;

import java.util.ArrayList;

public class Task02 {
	
	public static void main (String[] args) {
		
		String original = "There is some text with word or words.";
		String replaced = replace(original, "word", "letter");
		
		System.out.println("Original string:\n" + original);
		System.out.println("New string:\n" + replaced);
	}
	
	private static String replace(String original, String pattern, String repl) {
		/**
		 * Replaces `pattern` with `repl` in the `original`
		 * @param original - a string, where to find a pattern
		 * @param pattern - a pattern to search
		 * @param repl - a string to replace pattern
		 * @return returns a new string containing original string where `pattern` is replaced with `repl`
		 */
		 
		 ArrayList<Character> container = new ArrayList<>();
		 char[] originalArr = original.toCharArray();
		 char[] patternArr = pattern.toCharArray();
		 char[] replArr = repl.toCharArray();
		 
		 int i, j, k;
		 for(i = 0, k = 0; i < originalArr.length; i++, k++) {

			// check if the pattern is at current position
		 	for(j = 0; j < patternArr.length; j++) {
		 		if(originalArr[i + j] != patternArr[j]) {
		 			break;
		 		}
		 	}
		 	
		 	// if pattern is there, replace that in the resulting string
		 	if(j == patternArr.length) {
		 		
		 		// skip the pattern in original string
		 		i += j - 1;
		 		// copy the replacement at the position of pattern
		 		for(j = 0; j < replArr.length; j++) {
		 			container.add(replArr[j]);
		 		}
		 	}
		 	
		 	else {
		 		container.add(originalArr[i]);
		 	}
		 }
		 
		 char[] result = new char[container.size()];
		 for(i = 0; i < result.length; i++) {
		 	result[i] = container.get(i);
		 }
		 
		 return new String(result);
	}
}