package classes.simple.task04.controller;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import classes.simple.task04.model.Train;
import classes.simple.task04.model.TrainDepot;
import classes.simple.task04.view.DepotView;

public class TrainPrinter {
	/*
	 * This class is a part of Train Depot Controller, used for all the printing tasks
	 */
	
	private DepotView depotView;
	private TrainDepot trainDepot;
	
	public TrainPrinter(DepotView depotView, TrainDepot trainDepot) {
		
		this.depotView = depotView;
		this.trainDepot = trainDepot;
	}
	
	private void printTrainInfo(Train train) {
		
		Calendar departureTime = train.getDepartureTime();
	
		int month = departureTime.get(Calendar.MONTH);
		int day = departureTime.get(Calendar.DAY_OF_MONTH);
		
		int h = departureTime.get(Calendar.HOUR);
		int m = departureTime.get(Calendar.MINUTE);
		
		String time = String.format("%d2.%d2 %d2:%d2", day, month, h, m);
		
		depotView.print(String.format("%d3", train.getNumber()) + "\t" + train.getDestination() + "\t" + time);
	}
	
	
	private void printHeader() {
		
		depotView.print("\nTrain number\tDestination\tDeparture\n");
		depotView.print("-----------------------------------------\n");
	}
	
	
	public void printAllTrains() {
		
		depotView.print("Trains in the depot:\n");
		printHeader();		
		
		ArrayList<Train> trains = trainDepot.getTrains();
		
		for(Train train : trains) {
			printTrainInfo(train);
			depotView.print("\n");
		}
	}
	
	
	public void printTrainByNumber(int trainNumber) {
		
		try {
			Train train = trainDepot.getTrainByNumber(trainNumber);
			printHeader();
			printTrainInfo(train);
		} catch(NoSuchElementException e) {
			depotView.print("\nTrain number " + trainNumber + " not found\n");
		}
	}
}
