/**
 * Task 4: Make word "торт" out of parts of word "информатика" using functions for copying and concatenation
 */

package strings.as_string.task04;

public class Task04 {
	
	public static void main(String[] args) {
		
		String input = "информатика";
		String output = input.substring(7, 8).concat(input.substring(3, 5)).concat(input.substring(7, 8));
		
		System.out.println(input);
		System.out.println(output);
	}
}
