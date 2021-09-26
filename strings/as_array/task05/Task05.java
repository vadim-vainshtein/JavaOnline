/**
 * Task 5: Remove all the extra spaces from a string. Remove the spaces from the beginning and the end of the string
 */
 
package strings.as_array.task05;

public class Task05 {
	
	public static void main (String[] args) {
		
		String input = "   A  string with   a  lot    of spaces      ";
		String editedString = removeExtraSpaces(input);
		
		System.out.println("The input string:\n\"" + input + "\"");
		System.out.println("The string without extra spaces: \n\"" + editedString + "\"");
	}
	
	private static String removeExtraSpaces(String string) {
		/**
		 * Removes all the extra spaces from a string
		 * @param string - a string with extra spaces
		 * @return returns a string without the extra spaces
		 */
		 
		 char[] array = string.toCharArray();
		 //result will be saved here
		 char[] editedString = new char[array.length];
		 // the resulting array may be bigger than resulting string, so we need to save the actual length of new string
		 int editedStringLength = 0;
		 
		 int i = 0;
		 // remove the spaces from the beginning of the string
		 while(array[i] == ' ' && i < array.length) {
		 	i++;
		 }
		 
		 // remove extra spaces between the words
		 for(; i < array.length - 1; i++) {
		 	
		 	if(array[i] == ' ' && array[i + 1] == ' ') {
		 		continue;
		 	}
		 	else {
		 		editedString[editedStringLength++] = array[i];
		 	}
		 }
		 
		 //check the last symbol, and if it is not space, add it
		 if(array[array.length - 1] != ' ') {
		 	editedString[editedStringLength++] = array[array.length - 1];
		 }
		 
		 return new String(editedString, 0, editedStringLength);
	}
}