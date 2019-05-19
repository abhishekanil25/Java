package area;

//We have an Area class having two methods, which find the area of a circle and a rectangle. 
//Both methods accept a parameter in order to calculate the respective areas.

public class Area {
	double area;
	void circle (float radius) {
		area = radius*radius*3.14f;
	}
	void rectangle (float length, float breadth) {
		area = length * breadth;
	}
	void print() {
		System.out.println("Area of shape: " + area);
	}
}
