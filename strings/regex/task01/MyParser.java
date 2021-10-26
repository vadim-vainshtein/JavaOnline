/**
 * MyParser - a class for sorting paragraphs and words of a string in a way demanded by a task 1
 */

package strings.regex.task01;

import java.util.Arrays;

class MyParser {
	
	private final String str;
	
	public MyParser(String input) {
		str = input;
	}
	
	public String sortParagraphs() {
		/**
		 * Sorts paragraphs in str by the number of sentences
		 */
		
		Paragraph[] paragraphs = Paragraph.buildArray(str);
		Arrays.sort(paragraphs);
		return Paragraph.arrayToString(paragraphs);
	}
	
	public String sortWordsByLength() {
		/**
		 * Sorts words by length in every sentence
		 */
		
		return "not implemented";
	}
	
	public String sortWordsByCharOccurrence(char c) {
		return "not implemented";
	}
	
	public String toString() {
		return str;
	}
}
