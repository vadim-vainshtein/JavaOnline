/**
 * Task 1: There is an array of variable names in camelCase. Convert them to snake_case.
 */

package strings.as_array.task01;

public class Task01 {
	
	public static void main(String[] args) {
		
		String[] varNames = {
			"variableOne",
			"variableNumberTwo",
			"aLongVariableNameNumberThree"
		};
		
		String[] varNamesSnake = camelToSnake(varNames);
		
		System.out.println("Variable names in camelCase:");
		for(int i = 0; i < varNames.length; i++) {
			System.out.print(varNames[i] + "; ");
		}
		System.out.println("");
		
		
		
		System.out.println("\nVariable names in snakeCase:");
		for(int i = 0; i < varNamesSnake.length; i++) {
			System.out.print(varNamesSnake[i] + "; ");
		}
		System.out.println("");
	}
	
	private static String[] camelToSnake(String[] strings) {
		
		String[] stringsSnake = new String[strings.length];
		
		char[] camel; // for the original camelCase string
		char[] snake; // for the new snake_case string
		
		for(int i = 0; i < strings.length; i++) {
			
			camel = strings[i].toCharArray();
			
			// count the number of capital letters (words) in the string to know, how many underlines '_' we need to add
			int wordsCount = 0;
			for(int j = 0; j < camel.length; j++) {
				if(Character.isUpperCase(camel[j])) {
					wordsCount++;
				}
			}
			
			// copy camel[] to snake[] replacing capitals
			snake = new char[camel.length + wordsCount];
			wordsCount = 0;
			for(int j = 0; j < camel.length; j++) {
				
				if(Character.isUpperCase(camel[j])) {
					snake[j + wordsCount++] = '_';
					snake[j + wordsCount] = Character.toLowerCase(camel[j]);
				}
				else {
					snake[j + wordsCount] = camel[j];
				}
			}
			
			// save new string in the resulting array
			stringsSnake[i] = new String(snake);
		}
		
		return stringsSnake;
	}
}