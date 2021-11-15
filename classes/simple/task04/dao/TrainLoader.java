package classes.simple.task04.dao;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.io.IOException;
import java.io.FileNotFoundException;

import classes.simple.task04.controller.DepotController;
import classes.simple.task04.exception.InvalidFileFormatException;

/**
 * a class used for loading Train objects from file to a DepotController
 */
 
public class TrainLoader {
	
	public static void loadFromFile(DepotController depotController, String fileName) 
		throws IOException, InvalidFileFormatException {
		
		Calendar time = new GregorianCalendar();
		
		Path path = Paths.get(fileName);
		Scanner scanner = new Scanner(path);
		
		while(scanner.hasNextLine()){
			
			String[] data = scanner.nextLine().split(";");
			
			if(data[0].isEmpty()) {
				break;
			}
			
			int trainNumber;
			String destination;
			
			try {
				trainNumber = Integer.parseInt(data[0].trim());
				destination = data[1].trim();
				String[] departureDate = data[2].split("/");
				String[] departureTime = data[3].split(":");
			
				int day = Integer.parseInt(departureDate[0].trim());
				int month = Integer.parseInt(departureDate[1].trim()) - 1;
				int h = Integer.parseInt(departureTime[0].trim());
				int m = Integer.parseInt(departureTime[1].trim());
						
				time = new GregorianCalendar(time.get(Calendar.YEAR), month, day, h, m);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				throw new InvalidFileFormatException("Wrong file format: " + fileName + "\n\n" + e.getMessage());
			}
			catch(NumberFormatException e) {
				throw new InvalidFileFormatException("Wrong file format: " + fileName + "\n\n" + e.getMessage());
			}
				
			depotController.addTrain(trainNumber, destination, time);
		}
		
		scanner.close();
	}
	}
}