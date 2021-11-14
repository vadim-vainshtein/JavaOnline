package classes.simple.task04.model;

import java.util.Date;

public class Train {
	
	private int number;
	private String destination;
	private Date departureTime;
	
	public Train() {
		// A train number 0, to "", departing now
		this(0, "", new Date());
	}
	
	public Train(int number, String destination, Date departureTime) {
		
		this.number = number;
		this.destination = destination;
		this.departureTime = departureTime;
	}
	
	public int getNumber() { return number; }
	public void setNumber(int number) { this.number = number; };
	
	public String getDestination() { return destination; }
	public void setDestination(String destination) { this.destination = destination; }
	
	public Date getDepartureTime() { return departureTime; }
	public void setDepartureTime(Date departureTime) { this.departureTime = departureTime; }
	
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
	
	
	public static final Comparator<Train> COMPARE_BY_TRAIN_NUMBER = new Comparator<Train>() {
		
		@Override
		public int compare(Train train1, Train train2) {
			return train1.number - train2.number;
		}
	}

}
