package area;

//TestArea class has the main method which will control the flow of execution. 
//We have created an object of the Area class and invoked circle() and rectangle() methods. 
//Both methods print the resulting area to the console.

import java.util.Scanner;

public class TestArea {

	public static void main (String[] args) {
//		Taking Input From User
		Scanner s = new	Scanner(System.in);
		System.out.println("Please enter the radius:");
		float rad = s.nextFloat();
		s.nextLine();
		
		Area a = new Area();
		a.circle(rad);
		a.print();
		
		System.out.println("\n" + "Please enter the length:");
		float len = s.nextFloat();
		System.out.println("Please enter the breadth:");
		float bre = s.nextFloat();
		a.rectangle(len, bre);
		a.print();
//		Passing Parameters Directly
//		a.circle(10);  
//		a.rectangle(15, 10);
	}

}
