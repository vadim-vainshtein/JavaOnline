/**
 * Task 10: A string X consists of several phrases that end with '.', '?' or '!'. Count the number of phrases.
 */
 
package strings.as_string.task10;

public class Task10 {
	
	public static void main (String[] args) {
		
		String X = "How many phrases are there in the string? Who knows! We know only that they are splitted with punctuation marks. Like this? Exactly! And like this.";
	
		System.out.println("Input:");
		System.out.println(X);
		System.out.println("\nNumber of phrases: " + countPhrases(X));
	}
	
	private static int countPhrases(String str) {
		
		PhraseCounter counter = new PhraseCounter();
		
		str.chars().mapToObj(c -> (char)c).
			forEach(c -> counter.count(c));
		
		return counter.getPhraseCount();
	}
}

class PhraseCounter {
	
	private int phraseCount;
	
	PhraseCounter() {
		phraseCount = 0;
	}
	
	public void count(char c) {
		switch (c) {
					case '.':
					case '!':
					case '?':
						phraseCount++;
				}
	}
	
	public int getPhraseCount() {
		return phraseCount;
	}
}