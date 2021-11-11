/**
 * Task 1: Create a class Test1 containing two variables.
 * Add a method for displaying the variables and methods
 * for changing values of the variables. Add a method
 * that finds the sum of the variables and a method that
 * finds a maximum of the values.
 */
 
 public class Test1 {
 	
 	private int a = 0, b = 0;
 	
 	public void setA(int value) {
 		a = value;
 	}
 	
 	public void setB(int value) {
 		b = value;
 	}
 	
 	public void print() {
 		System.out.println("a = " + a + "; b = " + b);
 	}
 	
 	public int sum() {
 		return a + b;
 	}
 	
 	public int max() {
 		return a > b ? a : b;
 	}
 }