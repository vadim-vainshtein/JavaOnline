package basics.task06.point;

public class Point {
	private int x, y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int value) {
		x = value;
	}
	
	public void setY(int value) {
		y = value;
	}
	
	public boolean checkCoordinates() {
	  if((y>=0 && y<=4 && x>=-4 && x<=4) ||
	    (y<0 && y>=-3 && x>=-4 && x<=4)) {
	    return true;
	  }
	  else {
	    return false;
	  }
	}
}