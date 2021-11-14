package classes.simple.task04.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.io.PrintStream;

import classes.simple.task04.model.Train;
import classes.simple.task04.model.TrainDepot;
import classes.simple.task04.view.DepotView;

public class DepotController {
	
	private static final int DEFAULT_NUMBER_OF_TRAINS = 5;
	
	private TrainDepot trainDepot;
	private DepotView depotView;
	
	/*
	 * printer is an object of class TrainPrinter, implementing all the printing tasks.
	 * At the moment they are:
	 * - printAllTrains()
	 * - printTrainByNumber()
	 */
	
	public TrainPrinter printer;
	
	public DepotController() {
		
		// Create a new depot controller using System.out stream to print info
		this(System.out);
	}
	
	public DepotController(PrintStream ps) {
		
		trainDepot = new TrainDepot();
		depotView = new DepotView(ps);
		printer = new TrainPrinter(depotView, trainDepot);
	}
	
	
	public void addTrain(int number, String destination, Calendar departureTime) {
		
		trainDepot.addTrain(number, destination, departureTime);
	}
	
	
	public void sortByNumber() {
		
		trainDepot.sortByNumber();
	}
}
