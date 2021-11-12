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

public class Task03 {
	
	private static final int NUMBER_OF_STUDENTS = 10;
	
	public static void main (String[] args) {
		
		Student[] students = new Students[NUMBER_OF_STUDENTS];
		
		// initialize
		for(Student student : students) {
			student = generateRandomStudent();
		}
		
		// print excellent students
		for(Student student : students) {
			if(student.isExcellent()) {
				printStudent(student);
			}
		}
	}
	
	
	private static Student generateRandomStudent() {
		
		final int MIN_NAME_LENGTH = 3;
		final int MAX_NAME_LENGTH = 15;
		
		int nameLength = (int)(Math.random() * (MAX_NAME_LENGTH - MIN_NAME_LENGTH)) + MIN_NAME_LENGTH;
		
		StringBuilder name = new StringBuilder("");
		// get the first letter (Capital)
		char c = Math.random() * ('Z' - 'A') + 'A';
		name.append(c);
		// get other letters
		for(int i = MIN_NAME_LENGTH; i < nameLength - 1; i++) {
			c = Math.random() * ('z' - 'a') + 'a';
			name.append(c);
		}
		
		int group = Math.random() * (NUMBER_OF_GROUPS - 1) + 1;
		boolean isExcellent
	}
}