/**
 * Task 3: Check if given word is a palindrome or not
 */

package strings.as_string.task03;

public class Task03 {
	
	public static void main (String[] args) {
		
		String input1 = "asdfdsa";
		String input2 = "assdfdsa";
		
		System.out.println("Is a word \"" + input1 + "\" a palindrome: " +
			isPalindrome(input1));
		System.out.println("Is a word \"" + input2 + "\" a palindrome: " +
			isPalindrome(input2));
	}
	
	private static boolean isPalindrome(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		return str.equals(sb.reverse().toString());
	}
}