package classes.simple.task05;

public class Counter {
	
	private final int minValue, maxValue;
	protected int value;
	
	public Counter() {
		
		this(0, Integer.MAX_VALUE, 0);
	}
	
	public Counter(int minValue, int maxValue, int value) {
		
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.value = value;
	}
	
	public int getValue() {
		
		return value;
	}
	
	public void increase() throws IllegalStateException {
		
		if(value == maxValue) {
			throw new IllegalStateException("Counter already reached maximum, " + value);
		}
		
		value++;
	}
	
	public void decrease() throws IllegalStateException {
		
		if(value == minValue) {
			throw new IllegalStateException("Counter already reached minimum, " + value);
		}
		
		value--;
	}
}
