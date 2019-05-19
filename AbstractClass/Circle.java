package AbstractClass;

public class Circle extends Shape {
	float rad;

	public Circle(String name, float rad) {
		super(name);
		this.rad = rad;
	}
	public void findArea() {
		setArea(3.14f*rad*rad);
	}
	public void print() {
		super.print();
		System.out.println("Radius: " + rad);
	}
}
