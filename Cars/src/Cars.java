
public class Cars {
/*
 * Notes
 * INPUT Section: 
 * 		To be able to input Vehicle/Fleet info and store it.
 * 		To be able to input Current Miles and be compared for Oil Change
 * SELECTION Section:
 * 		To be able to choose a vehicle ID or TAG and the information be presented.
 * Make it interactive for user to input current miles and check if it needs change
 * To ask carID of vehicle to input miles. To check if that is part of an object
 * To store vehicles in a file database
 * Give it a graphic interface
 */
	//Instance Method
	String CarID = ""; //Identification of the car. Equals Yr+Make+Model+Vin
	int year; 
	int shortYear;
	String make;
	String model;
	String vin;
	int lastOilMiles; //Quantity of miles where the last oil change was made
	int currentMiles; // Current amount of miles
	int oilChange; //Change oil for this vehicle every certain miles
	
	
	//Constructor
	public Cars(int year, String make, String model, String vin, int lastOilMiles, int currentMiles, int oilChange) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.vin = vin;
		this.lastOilMiles = lastOilMiles;
		this.currentMiles = currentMiles;
		this.oilChange = oilChange;
	}
	
	public Cars() {
		this.year = 0;
		make = "";
		model = "";
		vin = "";
		lastOilMiles = 0;
		currentMiles = 0;
		oilChange = 0;
	}
	
	//Accessors
	public int getYear() {
		return year;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getVin() {
		return vin;
	}
	public String getCarId() {
		return CarID;
	}
	public int getLastOilMiles() {
		return lastOilMiles;
	}
	public int getCurrentMiles() {
		return currentMiles;
	}
	public int getOilChange() {
		return oilChange;
	}
	
	//Mutators
	/*public String shortYear(int year) {
		String shortYear = String.valueOf(year);
		shortYear = shortYear.substring(2);
		return shortYear;
		int year, String make, String model, String vin
	}*/
	public String makeCarID() {
		String shortYear = String.valueOf(year);
		shortYear = shortYear.substring(2);
		String shortMake = make.substring(0,1);
		String shortModel = model.substring(0,2);
		String shortVin = vin.substring(13);
		
		String carID = shortYear+shortMake+shortModel+shortVin;
		
		return carID;		
	}
	
	public void milesLeft() {
		int milesDone = this.currentMiles-this.lastOilMiles;
		if(milesDone<this.oilChange) {
			System.out.println("Oil change not needed! Missing "+(this.oilChange-milesDone)+" miles");
		}
		else if(milesDone>=this.oilChange) {
			System.out.println("OIL CHANGE NEEDED!!");
		}
	}
	/*public void retrieveCar(String x) {
		String choice = x;
		if(choice == "c1") {
			System.out.println("CarID: "+c1.makeCarID());
			System.out.println("Year: "+c1.getYear());
			System.out.println("Make: "+c1.getMake());
			System.out.println("Model: "+c1.getModel());
			System.out.println("Vin: "+c1.getVin());
		} else if(choice == "c2") {
			System.out.println("");
			System.out.println("CarID: "+c2.makeCarID());
			System.out.println("Year: "+c2.getYear());
			System.out.println("Make: "+c2.getMake());
			System.out.println("Model: "+c2.getModel());
			System.out.println("Vin: "+c2.getVin());
		} else if(choice == "c3"){
			System.out.println("");
			System.out.println("CarID: "+c3.makeCarID());
			System.out.println("Year: "+c3.getYear());
			System.out.println("Make: "+c3.getMake());
			System.out.println("Model: "+c3.getModel());
			System.out.println("Vin: "+c3.getVin());
		} else if(choice == "c4") {
			System.out.println("");
			System.out.println("CarID: "+c4.makeCarID());
			System.out.println("Year: "+c4.getYear());
			System.out.println("Make: "+c4.getMake());
			System.out.println("Model: "+c4.getModel());
			System.out.println("Vin: "+c4.getVin());
		} else {
			System.out.println("Wrong Input");
		}
	}*/

}
