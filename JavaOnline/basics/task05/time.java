package basics.task05.time;

public class Time {

	public static String formatTime( int T ) {
		int h, m, s;
		String result = new String();

		h = T / 3600;
		m = ( T - h * 3600 ) / 60;
		s = T - h * 3600 - m * 60;
		result = h + "h " + m + "m " + s + "s";

		return result;
	}

}
