package arrayofobjects;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kindly Enter number of Employees: ");
		Employee[] e = new Employee[scan.nextInt()];
		scan.nextLine();
		for (int i = 0; i < e.length; i++) {
			e[i] = new Employee();
			System.out.println("Enter Employee ID: ");
			e[i].setId(scan.nextInt());
			scan.nextLine();
			System.out.println("Enter Employee Name: ");
			e[i].setName(scan.nextLine());
			System.out.println("Enter Employee Salary: ");
			e[i].setSal(scan.nextFloat());
		}
		for (int i = 0; i < e.length; i++) {
			e[i].print();
		}
	}

}
