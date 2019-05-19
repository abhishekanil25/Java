package Interface;

import java.util.Scanner;

public class TestBicycle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FirstBycyle f = new FirstBycyle();
		System.out.println("Enter gear value: ");
		f.gear=scan.nextInt();
		System.out.println("Enter speed of Bicycle: ");
		f.speed=scan.nextInt();
		f.changeGear(1);
		System.out.println("\n" + "Current Gear Value: " + f.gear);
		f.speedUp(5);
		System.out.println("Increased speed: " + f.speed);
		f.applyBreak(10);
		System.out.println("Decreased speed: " + f.speed);
	}

}
