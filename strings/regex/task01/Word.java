/**
 * Word - a class derived from TextPiece for sorting words by the number of occurrences of a character
 * 
 */
package strings.regex.task01;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Word extends TextPiece {
	
	public Word(String text, String DELIMITER, String UNIT_DELIMITER, char c) {
		
		super(text, DELIMITER, UNIT_DELIMITER);
		//in this class we have another rule for calculating numberOfUnits than in TextPiece
		Matcher counter = Pattern.compile(String.valueOf(c)).matcher(text);
		numberOfUnits = 0;
		while(counter.find()) {
			numberOfUnits++;
		}
	}
	
	@Override
	public int compareTo(Object obj) {
		TextPiece other = (TextPiece)obj;
		
		int result = other.numberOfUnits - numberOfUnits;
		if (result == 0) {
			return other.toString().compareTo(text);
		}			
		
		return result;
	}
	
	
	public static Word[] buildArray(String str, String DELIMITER, String UNIT_DELIMITER, char c) {
		
		String[] strings = str.split(DELIMITER);
		Word[] texts = new Word[strings.length];
		Matcher punctuation = Pattern.compile(DELIMITER).matcher(str);
		
		for(int i = 0; i < strings.length; i++) {
			
			String d = "";
			if(punctuation.find()) {
				d = punctuation.group();
			}
			texts[i] = new Word(strings[i], d, UNIT_DELIMITER, c);
		}
		
		return texts;
	}
	
	
	public static String arrayToString(Word[] texts) {
		
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
