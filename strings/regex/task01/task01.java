/**

Task 1:

Create a text parsing application (text is stored in a string), that implements three operations:
- Sort paragraphs by the number of phrases
- Sort words in every phrase by length
- Sort words in every phrase by number of occurrences of a given character in descending order. In a case of equality sort by alphabetical order.

*/

//package strings.regex.task01;

public class Main {
	
	public static void main (String[] args) {
		
		MyParser parser = new MyParser(getInputString(args));
		
		String[] paragraphsSorted = parser.sortParagraphs();
		String[] wordsSortedByLength = parser.sortWordsByLength();
		String[] wordsSortedByCharOccurrence = parser.sortWordsByCharOccurrence('c');
	}
	
	private static String getInputString(String[] args) {
		// here should be code for getting text from a file
		String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean convallis feugiat feugiat. Donec laoreet, odio ut imperdiet varius, augue sapien egestas mi, eget consectetur enim massa non nunc. In accumsan vulputate neque. Nullam non nunc arcu. Mauris sit amet ullamcorper massa, et dignissim augue. Suspendisse rutrum lorem commodo dictum elementum. Etiam sit amet pulvinar nisi, ut egestas ex. Aenean vitae nulla laoreet, porttitor justo non, ultricies elit. Fusce sed ultricies libero. Maecenas posuere commodo ultricies.\nVivamus molestie dui vel sem vestibulum efficitur. Morbi sed mi a dolor tincidunt porttitor ut non lectus. Donec pulvinar nisl non ligula ornare suscipit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Mauris dapibus cursus dui.\nNullam a enim at nunc hendrerit laoreet id sit amet dolor. Aliquam erat volutpat. Curabitur ac tellus auctor, sagittis est in, finibus ex. Nunc egestas tortor et augue efficitur fringilla at in nulla. Vestibulum suscipit malesuada leo ac bibendum. Duis accumsan arcu vel tortor tempor mattis. Praesent congue a leo et aliquam. Praesent at turpis scelerisque, pellentesque nunc eu, rutrum augue. Donec ut."
	
		return text;
	}
}

class MyParser{
	
	private final String str;
	
	public MyParser(String input) {
		str = input;
	}
	
	public String[] sortParagraphs() {
	
		String[] paragraphsSorted = str.split("\n");
		int[] numberOfWords = new int[paragraphsSorted.length];
	
		for(int i = 0; i < paragraphsSorted.length; i++) {
			numberOfWords = countWords(paragraphsSorted[i]);
		}
		
		
		
		return paragraphsSorted;
	}
	
	public String[] sortWordsByLength() {
		
	}
	
	public String[] sortWordsByCharOccurrence(char c) {

	}
	
	private int countWords(String phrase) {
		
		return phrase.split("\\s+").length;
	}
}