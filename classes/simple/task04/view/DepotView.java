package classes.simple.task04.view;

import java.io.PrintStream;

/*
 * class DepotView is a simple class that provides
 * a unified printing interface - method print().
 * At the moment the class supports printing through
 * a PrintStream, but it could be easily extended.
 */
 
public class DepotView {
	
	private PrintStream printStream;
	
	public DepotView() {
		
		this(System.out);
	}
	
	
	public DepotView(PrintStream ps) {
		
		printStream = ps;
	}
	
	
	public void print(String str) {
		
		printStream.print(str);
	}
}
