package emp;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Deesha");
		e1.setSal(50000.0f);
				
		Employee e2 = new Employee(2, "Gunjan", 50000.0f);
				
		Employee e3 = new Employee();
		System.out.println("\nEnter Employee ID: ");
		e3.setId(scan.nextInt());
		scan.nextLine();
		System.out.println("Enter Employee Name: ");
		e3.setName(scan.nextLine());
		System.out.println("Enter Employee Salary: ");
		e3.setSal(scan.nextFloat());
		
		e1.print();
		e2.print();
		e3.print();
	}

}
