package classes.simple.task04.model;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Comparator;

public class Train {
	
	private int number;
	private String destination;
	private Calendar departureTime;
	
	public Train() {
		// A train number 0, to "", departing now
		this(0, "", new GregorianCalendar());
	}
	
	public Train(int number, String destination, Calendar departureTime) {
		
		this.number = number;
		this.destination = destination;
		this.departureTime = departureTime;
	}
	
	public int getNumber() { return number; }
//	public void setNumber(int number) { this.number = number; };
	
	public String getDestination() { return destination; }
//	public void setDestination(String destination) { this.destination = destination; }
	
	public Calendar getDepartureTime() { return departureTime; }
//	public void setDepartureTime(Calendar departureTime) { this.departureTime = departureTime; }
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		
		result = prime * result + number;
		result = prime * result + destination.hashCode();
		result = prime * result + departureTime.hashCode();
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) return false;
		if(this == obj) return true;
		if(this.getClass() != obj.getClass()) return false;
		
		Train other = (Train) obj;
		
		if(number != other.number) return false;
		if(!destination.equals(other.destination)) return false;
		if(!departureTime.equals(other.departureTime)) return false;
		
		return true;
	}
	
	
	public static final Comparator<Train> COMPARE_BY_NUMBER = new Comparator<Train>() {
		
		@Override
		public int compare(Train train1, Train train2) {
			
			return train1.number - train2.number;
		}
	};
	
	public static final Comparator<Train> COMPARE_BY_DESTINATION = new Comparator<Train>() {
		
		@Override
		public int compare(Train train1, Train train2) {
			
			int result = train1.destination.compareTo(train2.destination);
			
			if(result == 0) {
				return train1.departureTime.compareTo(train2.departureTime);
			}
			
			return result;
		}
	};

}
