/**
 * Sentence - a class containing a String object and some information about it, for example, number of words in the string
 */

package strings.regex.task01;

class Sentence implements Comparable {
	
	private final String text;
	private final int numberOfWords;
	private final String DELIMETER = "\\s+";
	
	public Sentence(String input) {
		text = input;
		numberOfWords = text.split(DELIMETER).length;
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
		Sentence[] sentences = new Sentence[strings.length];
		
		for(int i = 0; i < strings.length; i++) {
			sentences[i] = new Sentence(strings[i]);
		}
		
		return sentences;
	}
	
	public static String arrayToString(Sentence[] sentences) {
		
		StringBuilder str = new StringBuilder("");
		
		int i;
		for(i = 0; i < sentences.length - 1; i++) {
			str.append(sentences[i].toString() + "\n");
		}
		
		str.append(sentences[i].toString());
		
		return str.toString();
	}
}
