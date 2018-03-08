import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		//Creation of objects
		Cars c1 = new Cars(2014, "Ford", "Fusion","3FA6P0HD6GR160705", 23553, 26577, 4000 );
		Cars c2 = new Cars(2017, "Ford", "Mustang","1FATP8UH5H5240463", 11053, 10610, 4000 );
		Cars c3 = new Cars(2017, "Nissan", "Sentra","3N1AB7AP3HY258861", 7820, 11143, 5000 );
		Cars c4 = new Cars(2016, "Toyota", "Corolla","5YFBURHE0GP567570", 10781, 16934, 5000 );		
		
		System.out.println("Printing Car info from class...");
		System.out.println("CarID: "+c1.makeCarID());
		System.out.println("Year: "+c1.getYear());
		System.out.println("Make: "+c1.getMake());
		System.out.println("Model: "+c1.getModel());
		System.out.println("Vin: "+c1.getVin());
		c1.milesLeft();
		System.out.println("");
		System.out.println("CarID: "+c2.makeCarID());
		System.out.println("Year: "+c2.getYear());
		System.out.println("Make: "+c2.getMake());
		System.out.println("Model: "+c2.getModel());
		System.out.println("Vin: "+c2.getVin());
		c2.milesLeft();
		System.out.println("");
		System.out.println("CarID: "+c3.makeCarID());
		System.out.println("Year: "+c3.getYear());
		System.out.println("Make: "+c3.getMake());
		System.out.println("Model: "+c3.getModel());
		System.out.println("Vin: "+c3.getVin());
		c3.milesLeft();
		System.out.println("");
		System.out.println("CarID: "+c4.makeCarID());
		System.out.print(c4.getYear()+" "+c4.getMake()+" "+c4.getModel());
		System.out.println("Vin: "+c4.getVin());
		System.out.println("Oil Change Section ");
		c4.milesLeft();
		
		//Ask for vehicle
		//Ask the user for vehicle ID and bring info
		/*
		System.out.println("The information of what vehicle would you like to see?");
		System.out.println("Please input the CarID");
		String x;
		input.nextLine(x);
		x.makeCarID();
		retrieveCar(x);*/
		
		
		
		
		
		
		
		
		}

}
