package algorithmization.decomposition.task13;

public class Pair {
	/**
	 * Класс, описывающий пару чисел типа int
	 */
	
	private int a, b;
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setA(int value) {
		a = value;
	}
	
	public void setB(int value) {
		b = value;
	}
	
	public Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public String toString() {
		String str = "{" + a + ", " + b + "}";
		return str;
	}
}
