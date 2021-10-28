/**
 * TextPiece - a class containing a String object and some information about it, for example, number of words in the string
 */

package strings.regex.task01;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class TextPiece implements Comparable {
	
	private String text;
	private int numberOfUnits;
	private final String DELIMITER;
	private final String UNIT_DELIMITER;
	
	public TextPiece(String input, String DELIMITER, String UNIT_DELIMITER) {
		text = input;
		this.DELIMITER = DELIMITER;
		this.UNIT_DELIMITER = UNIT_DELIMITER;
		numberOfUnits = text.split(UNIT_DELIMITER).length;
	}
	
	public String toString() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public int compareTo(Object obj) {
		TextPiece other = (TextPiece)obj;
		return numberOfUnits - other.numberOfUnits;
	}
	
	public static TextPiece[] buildArray(String str, String DELIMITER, String UNIT_DELIMITER) {
		
		String[] strings = str.split(DELIMITER);
		TextPiece[] texts = new TextPiece[strings.length];
		Matcher punctuation = Pattern.compile(DELIMITER).matcher(str);
		
		for(int i = 0; i < strings.length; i++) {
				
			String d = "";
			if(punctuation.find()) {
				d = punctuation.group();
			}
			texts[i] = new TextPiece(strings[i], d, UNIT_DELIMITER);
		}
		
		return texts;
	}
	
	public static String arrayToString(TextPiece[] texts) {
		
		StringBuilder str = new StringBuilder("");
		
		int i;
		for(i = 0; i < texts.length - 1; i++) {
			String d = texts[i].DELIMITER.isEmpty() ? " " : texts[i].DELIMITER; 
			str.append(texts[i].toString() + d);
		}
		
		String d = texts[i].DELIMITER.equals(" ") ? "" : texts[i].DELIMITER;
		str.append(texts[i].toString() + d);
				
		return str.toString();
	}
}
