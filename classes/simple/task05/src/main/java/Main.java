package classes.simple.task05;

public class Main {
	
	public static void main (String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Counter before loop: " + counter.getValue());
		
		for(int i = 0; i < 10; i++) {
			try{
				counter.increase();
			} catch (IllegalStateException e) {
				System.out.println(e.getMessage());
				break;
			}
		}
		
		System.out.println("Counter after the loop: " + counter.getValue());
		
		
		counter = new Counter(100, 200, 150);
		
		System.out.println("Counter before loop: " + counter.getValue());
		
		for(int i = 0; i < 100; i++) {
			try{
				counter.decrease();
			} catch (IllegalStateException e) {
				System.out.println(e.getMessage());
				break;
			}
		}
		
		System.out.println("Counter after the loop: " + counter.getValue());
	}
}
