
package strings.regex.task02;

import java.io.FileReader;
import java.io.IOException; 
import java.io.FileNotFoundException;

public class Task02 {
	
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("No input");
			return;
		}
		
		String text = getText(args);
		if(text == null) {
			return;
		}
		
		SimpleXMLParser parser = new SimpleXMLParser(text);
		parser.printTree();
	}
	
	private static String getText(String[] args) {
		
		FileReader fileReader;
		
		try {
			fileReader = new FileReader(args[0]);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			return null;
		}
		
		char[] buffer = new char[1024];
		StringBuilder text = new StringBuilder("");
		
		try {
			int charsRead = fileReader.read(buffer, 0, buffer.length);
			while(charsRead > 0) {
				text.append(buffer);
				charsRead = fileReader.read(buffer, 0, buffer.length);
			}
			fileReader.close();
		}
		catch(IOException e) {
			System.out.println("I/O error");
			return null;
		}
		
		return text.toString();
	}
}
