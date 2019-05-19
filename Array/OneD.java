package Array;

//When we have an array containing n number of elements, 
//we call it as 1D Array or One-dimensional array.  
//E.g. OneD class accepts n marks from the user and prints their sum. 

import java.util.Scanner;

public class OneD {

	public static void main(String[] args) {
		int s=0,n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Subjects: ");
		n=scan.nextInt();
		int a[] = new int[n];
		System.out.println("\n" + "Enter marks one by one: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			s = s + a[i];
		}
		System.out.println("\n" + "Sum of all marks is: " + s);
	}

}
