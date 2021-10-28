/**
 * MyParser - a class for sorting paragraphs and words of a string in a way demanded by a task 1
 */

package strings.regex.task01;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class MyParser {
	
	private final String str;
	private final String PUNCTUATION_REGEX = "[!\\?\\.]";
	
	public MyParser(String input) {
		str = input;
	}
	
	public String sortParagraphs() {
		/**
		 * Sorts paragraphs in str by the number of sentences
		 */
		// Get an array of paragraphs, using end of line symbol as a delimiter. Use PUNCTUATION_REGEX to split paragraph into sentences
		TextPiece[] paragraphs = TextPiece.buildArray(str, "\n", PUNCTUATION_REGEX);
		Arrays.sort(paragraphs);
		return TextPiece.arrayToString(paragraphs, "\n");
	}
	
	public String sortWordsByLength() {
		/**
		 * Sorts words by length in every sentence
		 */
		
		StringBuilder result = new StringBuilder("");
		String[] sentences = str.split(PUNCTUATION_REGEX);
		// We need to store the punctuation to use them again in the sorted sentences
		Matcher punctuation = Pattern.compile(PUNCTUATION_REGEX+"\n").matcher(str);
		
		for(int i = 0; i < sentences.length; i++) {
			TextPiece[] words = TextPiece.buildArray(sentences[i], "\\s+", "");
			Arrays.sort(words);
			punctuation.find();
			result.append(TextPiece.arrayToString(words, " ") + str.charAt(punctuation.start()));
		}
		
		// Let's insert the end of line symbols back
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '\n') {
				result.replace(i, i+1, String.valueOf(str.charAt(i)));
			}
		}
		
		return result.toString();
	}
	
	public String sortWordsByCharOccurrence(char c) {
		return "not implemented";
	}
	
	public String toString() {
		return str;
	}
}
