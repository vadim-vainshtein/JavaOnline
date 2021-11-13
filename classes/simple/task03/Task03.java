/**
 * Task 3

Create a class Student with fields:

- lastname and initials
- group number
- performance (an array of five elements)

Create an array of ten elements of this type.
Add a possibility of displaying names and numbers of group
of students, whose grades are 9 or 10 only.
*/

package classes.simple.task03;

import java.util.Random;

public class Task03 {
	
	private static final int NUMBER_OF_STUDENTS = 10;
	private static Random random;
	
	public static void main (String[] args) {
		
		random = new Random();
		Student[] students = new Student[NUMBER_OF_STUDENTS];
		
		// initialize
		System.out.println("\nAll the students:\n-----------------------");
		for(int i = 0; i < students.length; i++) {
			students[i] = generateRandomStudent();
			if(students[i] == null) {
				System.out.println("Unexpected error");
				return;
			}
			students[i].print();
		}
		
		// print excellent students
		System.out.println("\nExcellent students:\n-----------------------");
		for(Student student : students) {
			if(student.isExcellent()) {
				student.print();
			}
		}
	}
	
	
	private static Student generateRandomStudent() {
		
		final int MIN_NAME_LENGTH = 3;
		final int MAX_NAME_LENGTH = 10;
		final int NUMBER_OF_GROUPS = 3;
		
		int nameLength = random.nextInt(MAX_NAME_LENGTH - MIN_NAME_LENGTH) + MIN_NAME_LENGTH;
		
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
		
		int group = random.nextInt(NUMBER_OF_GROUPS - 1) + 1;
		boolean isExcellent = random.nextBoolean();
		
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
		
		Student student;
		
		try {
			student = new Student(name.toString(), group, grades);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR");
			return null;
		}
		
		return student;
	}
}
