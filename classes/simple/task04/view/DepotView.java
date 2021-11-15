package classes.simple.task04.view;

import java.io.PrintStream;

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
