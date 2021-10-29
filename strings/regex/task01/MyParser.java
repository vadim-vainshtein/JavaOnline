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
	private final String SPACE_REGEX = "\\s+";
	
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
		return TextPiece.arrayToString(paragraphs);
	}
	
	public String sortWordsByLength() {
		/**
		 * Sorts words by length in every sentence
		 */
		
		//Split the text into sentences
		TextPiece[] sentences = TextPiece.buildArray(str, PUNCTUATION_REGEX, SPACE_REGEX);
		
		for(int i = 0; i < sentences.length; i++) {
			//Split every sentence into words
			TextPiece[] words = TextPiece.buildArray(sentences[i].toString(), SPACE_REGEX, "");
			Arrays.sort(words);
			// After sorting the words get them back into sentences
			sentences[i].setText(TextPiece.arrayToString(words));
		}
		
		// and build a string of sentences again
		return TextPiece.arrayToString(sentences);
	}
	
	public String sortWordsByCharOccurrence(char c) {
		
		
		
		return "not implemented";
	}
	
	public String toString() {
		return str;
	}
}
