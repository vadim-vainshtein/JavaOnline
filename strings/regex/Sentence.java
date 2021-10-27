/**
 * Sentence - a class containing a String object and some information about it, for example, number of words in the string
 */

package strings.regex.task01;

class Sentence implements Comparable {
	
	private final String text;
	private final int numberOfSenteces;
	private final String DELIMETER = "[!\\.\\?]+";
	
	public Sentence(String input) {
		text = input;
		numberOfSenteces = text.split(DELIMETER).length;
	}
	
	public String toString() {
		return text;
	}
	
	public int compareTo(Object obj) {
		Sentence other = (Sentence)obj;
		return numberOfSenteces - other.numberOfSenteces;
	}
	
	public static Sentence[] buildArray(String str) {
		
		String[] strings = str.split("\n");
		Sentence[] paragraphs = new Sentence[strings.length];
		
		for(int i = 0; i < strings.length; i++) {
			paragraphs[i] = new Sentence(strings[i]);
		}
		
		return paragraphs;
	}
	
	public static String arrayToString(Sentence[] paragraphs) {
		
		StringBuilder str = new StringBuilder("");
		
		int i;
		for(i = 0; i < paragraphs.length - 1; i++) {
			str.append(paragraphs[i].toString() + "\n");
		}
		
		str.append(paragraphs[i].toString());
		
		return str.toString();
	}
}
