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
		
		Student[] students = new Student[NUMBER_OF_STUDENTS];
		
		// initialize array of Stunent objects and print them
		System.out.println("\nAll the students:\n-----------------------");
		for(int i = 0; i < students.length; i++) {
			
			try {
				students[i] = StudentGenerator.generateRandomStudent();
			} catch (IllegalArgumentException e) {
				System.out.println(e.toString());
				System.exit(-1);
			}
			
			System.out.println(students[i].toString());
		}
		
		// print excellent students
		System.out.println("\nExcellent students:\n-----------------------");
		for(Student student : students) {
			if(student.isExcellent()) {
				System.out.println(student.toString());
			}
		}
	}
}
