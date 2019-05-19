package MethodOverload;

//When multiple methods have a similar tasks to perform but they perform it in a slightly different way, 
//we can keep the method names same having difference in parameters and create easy-to-understand codes. 
//When we invoke one of the overloaded methods, 
//compiler dissolves the same name ambiguity on the basis of parameters. 
//Return types may vary from method to method. 

import java.util.Scanner;

public class TestArea {

	public static void main(String[] args) {
		float r, l ,b;
		Scanner scan = new Scanner(System.in);
		Area a = new Area();
		System.out.println("Enter radius of circle: ");
		r = scan.nextFloat();
		a.area(r);
		System.out.println("\n" + "Enter length of rectangle: ");
		l = scan.nextFloat();
		System.out.println("Enter breadth of rectangle: ");
		b = scan.nextFloat();
		a.area(l,b);
	}

}
