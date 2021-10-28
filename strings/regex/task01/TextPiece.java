/**
 * TextPiece - a class containing a String object and some information about it, for example, number of words in the string
 */

package strings.regex.task01;

class TextPiece implements Comparable {
	
	private final String text;
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
	
	public int compareTo(Object obj) {
		TextPiece other = (TextPiece)obj;
		return numberOfUnits - other.numberOfUnits;
	}
	
	public static TextPiece[] buildArray(String str, String DELIMITER, String UNIT_DELIMITER) {
		
		String[] strings = str.split(DELIMITER);
		TextPiece[] texts = new TextPiece[strings.length];
		
		for(int i = 0; i < strings.length; i++) {
			texts[i] = new TextPiece(strings[i], DELIMITER, UNIT_DELIMITER);
		}
		
		return texts;
	}
	
	public static String arrayToString(TextPiece[] texts, String DELIMITER) {
		
		StringBuilder str = new StringBuilder("");
		
		int i;
		for(i = 0; i < texts.length - 1; i++) {
			str.append(texts[i].toString() + DELIMITER);
		}
		
		str.append(texts[i].toString());
		
		return str.toString();
	}
}
