/**
 * Paragraph - a class containing a String object and some information about it, for example, number of words in the string
 */

package strings.regex.task01;

class Sentence implements Comparable {
	
	private final String text;
	private final int numberOfSenteces;
	private final String DELIMETER = "[!\\.\\?]+";
	
	public Paragraph(String input) {
		text = input;
		numberOfSenteces = text.split(DELIMETER).length;
	}
	
	public String toString() {
		return text;
	}
	
	public int compareTo(Object obj) {
		Paragraph other = (Paragraph)obj;
		return numberOfSenteces - other.numberOfSenteces;
	}
	
	public static Paragraph[] buildArray(String str) {
		
		String[] strings = str.split("\n");
		Paragraph[] paragraphs = new Paragraph[strings.length];
		
		for(int i = 0; i < strings.length; i++) {
			paragraphs[i] = new Paragraph(strings[i]);
		}
		
		return paragraphs;
	}
	
	public static String arrayToString(Paragraph[] paragraphs) {
		
		StringBuilder str = new StringBuilder("");
		
		int i;
		for(i = 0; i < paragraphs.length - 1; i++) {
			str.append(paragraphs[i].toString() + "\n");
		}
		
		str.append(paragraphs[i].toString());
		
		return str.toString();
	}
}
