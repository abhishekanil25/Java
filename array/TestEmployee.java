package array;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Employee e = new Employee();
		
		System.out.println("Enter Employee ID: ");
		e.setId(scan.nextInt());
		scan.nextLine();
		System.out.println("Enter Employee Name: ");
		e.setName(scan.nextLine());
		System.out.println("Enter Employee Salary: ");
		e.setSal(scan.nextFloat());
		System.out.println("Enter Number of Languages: ");
		String[] lang = new String[scan.nextInt()];
		scan.nextLine();
		for (int i = 0; i < lang.length; i++) {
			System.out.println("Enter Languages: ");
			lang[i] = scan.nextLine();
		}
		e.setLang(lang);
		e.print();
	}

}
