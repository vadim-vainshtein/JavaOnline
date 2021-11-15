package classes.simple.task04.main;

import java.io.IOException;
import java.io.FileNotFoundException;

import classes.simple.task04.controller.DepotController;
import classes.simple.task04.dao.TrainLoader;

import classes.simple.task04.exception.InvalidFileFormatException;

public class Main {
	
	private static DepotController depotController;
	
	public static void main(String[] args) {
		
		if(args.length < 2) {
			
			printUsage();
			return;
		}
		
		String fileName = args[0];
		
		try {
			initDepot(fileName);
		}
		catch(IOException e) {
			System.out.println("I/O error!\n" + e.getMessage());
			return;
		}
		catch(InvalidFileFormatException e) {
			System.out.println(e.getMessage());
			return;
		}
		
		// check for options
		switch (args[1]) {
			
			case "-a": // print all trains
				depotController.printer.printAllTrains();
				break;
				
			case "-n": // print train by number
				
				try {
					printTrainByNumber(args[2]);
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Not enough arguments");
					printUsage();
					return;
				}
				catch(NumberFormatException e) {
					System.out.println("Please specify a train number");
					printUsage();
					return;
				}
				
				break;
			
			case "-s": // sort trains by number
				
				sortByNumber();
				break;
				
			case "-S": // sort trains by destination
				
				sortByDestination();
				break;
			
			default:
				
				printUsage();
		}
	}
	
	
	private static void printUsage() {
		
		System.out.println("\nUsage: <appName> <input file> -[ansS]");
		System.out.println("\n -a\t- print all trains");
		System.out.println(" -n\t- print train by number");
		System.out.println(" -s\t- sort trains by number");
		System.out.println(" -S\t- sort trains by destination\n");
		
	}
	
	
	private static void initDepot(String fileName) 
		throws IOException, InvalidFileFormatException {
		
		// creates a DepotController with a default number of trains = 5 and System.out stream as an output
		depotController = new DepotController();
		TrainLoader.loadFromFile(depotController, fileName);
	}
			
	
	private static void printTrainByNumber(String numberStr) throws NumberFormatException {
		
		int number = Integer.parseInt(numberStr);
		depotController.printer.printTrainByNumber(number);
	}
	
	
	private static void sortByNumber() {
		
		depotController.sortByNumber();
		depotController.printer.printAllTrains();
	}
	
	
	private static void sortByDestination() {
		
		depotController.sortByDestination();
		depotController.printer.printAllTrains();
	}
}
