package classes.simple.task04.controller;

import java.util.ArrayList;
import java.util.Calendar;

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
	
		String time = String.format("%1$td %1$5tb %1$tH:%1$tM", departureTime);
		
		depotView.print(String.format(" %03d%25s\t%s", train.getNumber(), train.getDestination(), time));
	}
	
	
	private void printHeader() {
		
		depotView.print("\nTrain number\tDestination\tDeparture\n");
		depotView.print("-----------------------------------------\n");
	}
	
	
	public void printAllTrains() {
		
		depotView.print("\nTrains in the depot:\n");
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
			depotView.print("\n\n");
		} catch(NoSuchElementException e) {
			depotView.print("\nTrain number " + trainNumber + " not found\n");
		}
	}
}
