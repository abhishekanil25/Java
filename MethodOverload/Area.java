package MethodOverload;

public class Area {
	double area;
	void area(float rad) {
		area = rad * rad * 3.14f;
		System.out.println("Area of Circle is:" + area);
	}
	void area(float len, float bre) {
		area = len * bre;
		System.out.println("Area of Rectangle is: " + area);
	}
}
