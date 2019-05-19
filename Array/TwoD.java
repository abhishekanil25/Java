package Array;

//When we want to store group of array as one array, 
//we go for 2D or Two - dimensional array. 
//For e.g. we want to store marks of 4 subjects for 3 students each. 
//So we either need to create 3 single arrays for 4 subjects or in other words, 
//create 3 rows having 4 columns each.
//TwoD class accepts marks for n subjects for m students from the user and prints their sum. 

import java.util.Scanner;

public class TwoD {

	public static void main(String[] args) {
		int s=0, m, n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Students");
		m = scan.nextInt();
		System.out.println("\n"+"Enter number of Subjects");
		n = scan.nextInt();
		System.out.println("\n");
		int a[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter marks for Student " + (i + 1) + " for subject " + (j + 1));
				a[i][j] = scan.nextInt();
				s = s + a[i][j];
			}
			System.out.println("Sum of marks for Student " + (i + 1) + " is " + s +"\n");
			s = 0;
		}
	}
}
