/**
 * Task 2: Create a class Test2 containing two variables.
 * Add a constructor with input parameters.
 * Add a constructor that initialises the class members with default values.
 * Add setters and getters.
 */
 
 public class Test2 {
 	
 	private int a, b;
 	
 	public Test2() {
 		a = 0;
 		b = 0;
 	}
 	
 	public Test2(int a, int b) {
 		this.a = a;
 		this.b = b;
 	}
 	
 	public void setA(int value) {
 		a = value;
 	}
 	
 	public void setB(int value) {
 		b = value;
 	}
 	
 	public int getA() {
 		return a;
 	}
 	 	
 	public int getB() {
 		return b;
 	}
 	
 }