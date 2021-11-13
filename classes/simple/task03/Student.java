package classes.simple.task03;

import java.io.Serializable;

public class Student implements Serializable {
/**
 * a class containing information about a student:
 * name, group number and performance
 */
	
	public static final int NUMBER_OF_GRADES = 5;
	private String name;
	private int group;
	private int[] grades = new int[NUMBER_OF_GRADES];
	
	public Student() {
		name = "";
		group = 0;
		for(int i = 0; i < grades.length; i++) {
			grades[i] = 0;
		}
	}
	
	public Student(String name, int group, int[] grades) throws IllegalArgumentException {
		this.name = name;
		this.group = group;
		// copy an array (or a part of it) to be shure, that we have a correct number of grades
		try {
			System.arraycopy(grades, 0, this.grades, 0, NUMBER_OF_GRADES);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException("Array grades[] too short in Student(String, int, int[])");
		}			
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
	
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder(name + "\tgroup: " + group + "\tgrades: ");
		for(int grade : grades) {
			str.append(grade + " ");
		}

		return str.toString();
	}
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		
		result = prime * result + group;
		
		for(int i = 0; i < NUMBER_OF_GRADES; i++) {
			result = prime * result + grades[i];
		}
		
		result = prime * result + name.hashCode();
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		
		if (!name.equals(other.name))
			return false;
		
		if (group != other.group)
			return false;
		
		for(int i = 0; i < NUMBER_OF_GRADES; i++) {
			if(grades[i] != other.grades[i]) {
				return false;
			}
		}
		
		return true;
	}
}
