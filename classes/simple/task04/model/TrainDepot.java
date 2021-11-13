package classes.simple.task04.model;

import java.util.ArrayList;
import java.util.Date;

public class TrainDepot {
	
	private static final int DEFAULT_NUMBER_OF_TRAINS = 5;
	
	private ArrayList<Train> trains;
	
	public TrainDepot() {
		
		this(DEFAULT_NUMBER_OF_TRAINS);
	}
	
	public TrainDepot(int numberOfTrains) throws IllegalArgumentException {
		
		try {
			trains = new ArrayList<Train>(numberOfTrains);
		} catch(IllegalArgumentException e) {
			throw new IllegalArgumentException("Invalid number of trains in TrainDepot(): " + numberOfTrains
				+ "\n " + e.toString());
		}
	}

	
	public ArrayList<Train> getTrains() {
		
		return new ArrayList<Train>(trains);
	}
	
	
	public void addTrain(int number, String destination, Date departureTime) {
		
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
	
}
