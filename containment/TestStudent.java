package containment;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		int d, m, y, id, mark;
		String name;
		System.out.println("Enter the student details(ID, Name, Marks): ");
		Scanner scan = new Scanner(System.in);
		id=scan.nextInt();
		scan.nextLine();
		name=scan.nextLine();
		mark=scan.nextInt();
		System.out.println("\n" + "Enter the date of birth of student (dd-mm-yyyy): ");
		d=scan.nextInt();
		m=scan.nextInt();
		y=scan.nextInt();
		Student s = new Student(id, name, mark, new Date(d, m, y));
		s.print();
	}

}
