package Single;

//When a class extends another class, single inheritance occurs.
//Class Vehicle is the base class here and class Bike & Car is the derived class.
//Bike & Car will derive all properties of the A class.

import java.util.Scanner;

public class TestVehicle {

	public static void main(String[] args) {
		int speed;
		Car c = new Car();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Car Name: ");
		c.name = scan.nextLine();
		System.out.println("Enter Car Color: ");
		c.color = scan.nextLine();
		System.out.println("Enter Car speed: ");
		c.speed = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter gear Type: ");
		c.geartype = scan.nextLine();
		
		Bike b = new Bike();
		System.out.println("\n" + "Enter Bike Name: ");
		b.name = scan.nextLine();
		System.out.println("Enter Bike Color: ");
		b.color = scan.nextLine();
		System.out.println("Enter Bike speed: ");
		b.speed = scan.nextInt();
		System.out.println("Enter maximum stroke: ");
		b.stroke = scan.nextInt();
		
		c.print();
		c.accelerate();
		b.print();
		b.accelerate();
	}

}
