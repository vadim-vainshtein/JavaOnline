package classes.simple.task05;

import org.junit.*;
import static org.junit.Assert.*;

public class CounterTest {
	
	@Test
	public void testIncrease() {
		
		Counter counter = new Counter(0, Integer.MAX_VALUE, 100);
		counter.increase();
		assertEquals(101, counter.getValue());
	}
	
	@Test (expected = IllegalStateException.class)
	public void testIncreaseOverflow() {
		
		Counter counter = new Counter(0, 100, 100);
		counter.increase();
	}
	
	@Test
	public void testDecrease() {
		
		Counter counter = new Counter(0, Integer.MAX_VALUE, 100);
		counter.decrease();
		assertEquals(99, counter.getValue());
	}
	
	@Test (expected = IllegalStateException.class)
	public void testDecreaseOverflow() {
		
		Counter counter = new Counter(0, 100, 0);
		counter.decrease();
	}
}
