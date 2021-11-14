package classes.simple.task04.model;

import java.util.NoSuchElementException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Calendar;

public class TrainDepot {
	
	private ArrayList<Train> trains;
	
	public TrainDepot() {
		
		trains = new ArrayList<Train>(numberOfTrains);
	}
	
	public ArrayList<Train> getTrains() {
		
		return new ArrayList<Train>(trains);
	}
	
	
	public Train getTrainByNumber(int number) throws NoSuchElementException {
		
		for(Train train : trains) {
			if(train.getNumber() == number) {
				return train;
			}
		}
		
		throw new NoSuchElementException();
	}
	
	
	public void addTrain(int number, String destination, Calendar departureTime) {
		
		// return a copy of list, let's not allow to modify the original list directly
		trains.add(new Train(number, destination, departureTime));
	}
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result;
		
		result = prime * trains.hashCode();
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) return false;
		if(this == obj) return true;
		if(this.getClass() != obj.getClass()) return false;
		
		TrainDepot other = (TrainDepot) obj;
		
		if(!trains.equals(other.trains)) return false;
		
		return true;
	}
	
	
	public void sortByNumber() {
		
		Collections.sort(trains, Train.COMPARE_BY_NUMBER);
	}
	
}
