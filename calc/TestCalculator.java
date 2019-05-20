package calc;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner scan = new Scanner(System.in);
				
		System.out.println("1. Addition \t 2. Subtraction \t 3. Multiplication \t 4. Division");
		System.out.println("Select your Choice: ");
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("\nDoing Addition ...");
			System.out.println("Enter First Number: ");
			c.setNum1(scan.nextFloat());
			scan.nextLine();
			System.out.println("Enter Second Number: ");
			c.setNum2(scan.nextFloat());
			c.add();
			c.print();
			break;
		case 2:
			System.out.println("\nDoing Subtraction ...");
			System.out.println("Enter First Number: ");
			c.setNum1(scan.nextFloat());
			scan.nextLine();
			System.out.println("Enter Second Number: ");
			c.setNum2(scan.nextFloat());
			c.sub();
			c.print();
			break;
		case 3:
			System.out.println("\nDoing Multiplication ...");
			System.out.println("Enter First Number: ");
			c.setNum1(scan.nextFloat());
			scan.nextLine();
			System.out.println("Enter Second Number: ");
			c.setNum2(scan.nextFloat());
			c.mul();
			c.print();
			break;
		case 4:
			System.out.println("\nDoing Division ...");
			System.out.println("Enter First Number: ");
			c.setNum1(scan.nextFloat());
			scan.nextLine();
			System.out.println("Enter Second Number: ");
			c.setNum2(scan.nextFloat());
			c.div();
			c.print();
			break;
		default:
			System.out.println("\nInvalid Option");
			break;
		}

	}

}
