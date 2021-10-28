/**
 * TextPiece - a class containing a String object and some information about it, for example, number of words in the string
 */

package strings.regex.task01;

class TextPiece implements Comparable {
	
	private final String text;
	private int numberOfUnits;
	private final String DELIMETER;
	private final String UNIT_DELIMETER;
	
	public TextPiece(String input, String DELIMETER, String UNIT_DELIMETER) {
		text = input;
		this.DELIMETER = DELIMETER;
		this.UNIT_DELIMETER = UNIT_DELIMETER;
		numberOfUnits = text.split(UNIT_DELIMETER).length;
	}
	
	public String toString() {
		return text;
	}
	
	public int compareTo(Object obj) {
		TextPiece other = (TextPiece)obj;
		return numberOfUnits - other.numberOfUnits;
	}
	
	public static TextPiece[] buildArray(String str, String DELIMETER, String UNIT_DELIMETER) {
		
		String[] strings = str.split(DELIMETER);
		TextPiece[] texts = new TextPiece[strings.length];
		
		for(int i = 0; i < strings.length; i++) {
			texts[i] = new TextPiece(strings[i], DELIMETER, UNIT_DELIMETER);
		}
		
		return texts;
	}
	
	public static String arrayToString(TextPiece[] texts, String DELIMETER) {
		
		StringBuilder str = new StringBuilder("");
		
		int i;
		for(i = 0; i < texts.length - 1; i++) {
			str.append(texts[i].toString() + DELIMETER);
		}
		
		str.append(texts[i].toString());
		
		return str.toString();
	}
}
