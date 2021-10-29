/**
 * Word - a class derived from TextPiece for sorting words by the number of occurrences of a character
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
		while(matcher.find()) {
			numberOfUnits++;
		}
	}
	
	@Override
	public int compareTo(Object obj) {
		TextPiece other = (TextPiece)obj;
		
		int result = numberOfUnits - other.numberOfUnits;
		if (result == 0) {
			return text.compareTo(other);
		}			
		
		return result;
	}	
}
