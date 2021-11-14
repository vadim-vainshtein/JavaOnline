package classes.simple.task04.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import classes.simple.task04.controller.DepotController;

public class Main {
	
	private static DepotController depotController;
	
	public static void main(String[] args) {
		
		if(args.length == 0) {
			
			printUsage();
			return;
		}
		
		// load trains into depot
		initDepot();
		
		switch args[0] {
			
			case "-a": // print all trains
				depotController.printer.printAllTrains();
				break;
				
			case "-n": // print train by number
				
				printTrainByNumber(depotController, args);
				break;
			
			case "-s": // sort trains by number
				
				sortByNumber();
				break;
				
			case "-S" // sort trains by destination
				
				sortByDestination();
				break;
			
			default:
				
				printUsage();
		}
	}
	
	
	private static initDepot() {
		
		// creates a DepotController with a default number of trains = 5 and System.out stream as an output
		depotController = new DepotController();
		Calendar time = new GregorianCalendar();
		
		
		depotController.addTrain(
}
