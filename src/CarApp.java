import java.util.ArrayList;
import java.util.Scanner;
/*Steven Clauw 2-1-17
 * LabNumber9
 * 
 */
public class CarApp {

	public static void main(String[] args) {
		int i = 0;
		String make = "Ford";
		String model = "Flex";
		int year = 2011;
		double price = 17000.00;

		ArrayList<Car> carLot = new ArrayList<Car>();
		Car car = new Car(make, model, year, price);
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		Scanner scan = new Scanner(System.in);
		// prompt the user for how many cars they want to enter
		System.out.print("Please enter how many cars do you want to enter: ");
		// get user input and store user input in variables
		// each car take input of details: Make, model, year, price...(String, String,
		// int, double)
		// forLoop will iterate for as many cars as user inputs
		int numOfCars = scan.nextInt();
		for (i = 0; i < numOfCars; i++) {
			System.out.print("What kind of make is the car?: ");
			make = scan.next();
			System.out.print("What kind of model is the car?: ");
			model = scan.next();
			System.out.print("What year is the car?: ");
			year = scan.nextInt();
			scan.nextLine();
			System.out.print("What price is the car?: ");
			price = scan.nextDouble();
			car = new Car(make, model, year, price);
			carLot.add(car);
		}
		System.out.println("...");
		System.out.println("Current Inventory: ");
		for (i = 0; i < carLot.size(); i++) {
			System.out.println(carLot.get(i).toString());
		}

		// each iteration will prompt then get input for all details
		// print out table of cars

		scan.close();
	}

}
