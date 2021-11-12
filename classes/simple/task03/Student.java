package classes.simple.task03;

public class Student {
/**
 * a class containing information about a student:
 * name, group number and performance
 */
	
	public static final int NUMBER_OF_GRADES = 5;
	private String name;
	private int group;
	private int[] grades = new int[NUMBER_OF_GRADES];
	
	public Student(String name, int group, int[] grades) throws ArrayIndexOutOfBoundsException {
		this.name = name;
		this.group = group;
		// copy an array (or a part of it) to be shure, that we have a correct number of grades
		System.arraycopy(grades, 0, this.grades, NUMBER_OF_GRADES);
	}
	
	public String getName() {
		return name;
	}
	
	public int getGroup() {
		return group;
	}
	
	public boolean isExcellent() {
		for(int grade : grades) {
			if(grade < 9) {
				return false;
			}
		}
		
		return true;
	}
}