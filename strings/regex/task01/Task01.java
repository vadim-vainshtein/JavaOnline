/**

Task 1:

Create a text parsing application (text is stored in a string), that implements three operations:
- Sort paragraphs by the number of sentences
- Sort words in every sentence by length
- Sort words in every sentence by number of occurrences of a given character in descending order. In a case of equality sort by alphabetical order.

*/

package strings.regex.task01;

public class Task01 {
	
	public static void main (String[] args) {
		
		MyParser parser = new MyParser(getInputString(args));
		
		String paragraphsSorted = parser.sortParagraphs();
		String wordsSortedByLength = parser.sortWordsByLength();
		String wordsSortedByCharOccurrence = parser.sortWordsByCharOccurrence('x');
		
		System.out.print("Input:\n" + parser.toString() + "\n\n");
		System.out.print("Paragraphs sorted by the number of sentences:\n" + paragraphsSorted + "\n\n");
		System.out.print("Text with words sorted by length:\n" + wordsSortedByLength + "\n\n");
		System.out.print("Text with words sorted by number of occurrences of the character \'x\':\n" + wordsSortedByCharOccurrence + "\n\n");
	}
	
	private static String getInputString(String[] args) {
		// here should be a code for getting text from a file
		String text = "Paragraphxx nuxxxxmber xone. Ixt hxxxas txwo sxxxxentences.\nThe second paragraph with just one sentence.\nAnd here we have something new! Some other punctuation?";
	
		return text;
	}
}

