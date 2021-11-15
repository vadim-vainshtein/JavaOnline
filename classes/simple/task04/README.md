Task 4
======

Create a class Train containing fields: *destination*, *train number*, *departure time*.
Create an array of five elements of type Train. Add a possibility for sorting the elements by train numbers.
Add a possibility for printing information about a train by number entered by a user.
Add a possibility for sorting trains by destination, so that trains with a same destination would be sorted by a departure time.

solution
-----

### Model part:

Implemented a class Train (model/Train.java) with fields:

	int number;
	String destination;
	Calendar departureTime;

The class has also two Comparator objects used in sorting:

	Comparator COMPARE_BY_NUMBER;
	Comparator COMPARE_BY_DESTINATION;

To store the information about trains a class TrainDepot (model/TrainDepot.java) is used. It contains an ArrayList<Train> object and methods for manipulating the trains:

	addTrain(Train);
	getTrainByNumber(int);
	sortByNumber();
	sortByDestination();

### View part

A class DepotView (view/DepotView.java) is used to print the information. It is very simple and it's job is to provide a unified interface for printing:

	print();
	
The class has a public constructor

	public DepotView(PrintStream);
	
to specify a stream to use for printing. It can be stdout or, for example, a file stream.

### Controller part

A TrainDepot object is not used by as is. There is a class DepotController for manipulating TrainDepot. It contains fields:

	private TrainDepot trainDepot;
	private DepotView depotView;
	public TrainPrinter printer;

and methods:

	addTrain(int number, String destination, Calendar departureTime);
	sortByNumber();
	sortByDestination();

A TrainPrinter object (DepotController.printer) is used for printing the information. It has methods:

	printAllTrains();
	printTrainByNumber();


