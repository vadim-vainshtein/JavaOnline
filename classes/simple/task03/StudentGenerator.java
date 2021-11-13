package classes.simple.task03;

import java.util.Random;

public class StudentGenerator {
/**
 * This class is used 	to generate a Student object with random name, group number and grades
 */
	private static Random random = new Random();
	
	public static Student generateRandomStudent() throws IllegalArgumentException {
		
		final int MIN_NAME_LENGTH = 3;
		final int MAX_NAME_LENGTH = 10;
		final int NUMBER_OF_GROUPS = 3;
		
		String name = getRandomName(MIN_NAME_LENGTH, MAX_NAME_LENGTH);
		
		// get a random group
		int group = random.nextInt(NUMBER_OF_GROUPS) + 1;
		
		int[] grades = getRandomGrades();		
		
		return  new Student(name, group, grades);
	}
	
	private static String getRandomName(int minLength, int maxLength) {
		
		int nameLength = random.nextInt(maxLength - minLength) + minLength;
		
		//build a random name
		StringBuilder name = new StringBuilder("");
		// get the first letter (Capital)
		char c = (char)(random.nextInt('Z' - 'A') + 'A');
		name.append(c);
		// get other letters
		for(int i = 0; i < nameLength - 1; i++) {
			c = (char)(random.nextInt('z' - 'a') + 'a');
			name.append(c);
		}
		
		// add initials
		name.append(' ');
		c = (char)(random.nextInt('Z' - 'A') + 'A');
		name.append(c + ".");
		c = (char)(random.nextInt('Z' - 'A') + 'A');
		name.append(c + ".");
		
		return name.toString();
	}
	
	private static int[] getRandomGrades() {
		
		boolean isExcellent = random.nextBoolean();
		//generate random grades depending on isExcellent value
		int[] grades = new int[Student.NUMBER_OF_GRADES];
		
		if(isExcellent) {
			for(int i = 0; i < grades.length; i++) {
				grades[i] = random.nextInt(2) + 9;
			}
		}
		else {
			for(int i = 0; i < grades.length; i++) {
				grades[i] = random.nextInt(10) + 1;
			}
		}
		
		return grades;
	}
}
