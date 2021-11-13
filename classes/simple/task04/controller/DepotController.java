package classes.simple.task04.controller;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import classes.simple.task04.model.Train;
import classes.simple.task04.model.TrainDepot;

public class DepotController {
	
	private TrainDepot trainDepot;
	
	public DepotController() {
		
		// Create a new depot with a default number of trains
		trainDepot = new TrainDepot();
	}
	
	public DepotController(int numberOfTrains) {
		
		trainDepot = new TrainDepot(numberOfTrains);
	}

	
	public ArrayList<Train> getTrains() {
		// returns a copy of a train list
		return trainDepot.getTrains();
	}
	
	
	public void addTrain(int number, String destination, Date departureTime) {
		
		trainDepot.addTrain(number, destination, departureTime);
	}
	
	public Train getTrainByNumber(int number) throws NoSuchElementException {
		
		ArrayList<Train> trains = trainDepot.getTrains();
		
		for(Train train : trains) {
			if(train.getNumber() == number) {
				return train;
			}
		}
		
		throw new NoSuchElementException();
	}
	
	
	
}
