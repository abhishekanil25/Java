package AbstractClass;

public abstract class Shape {
	private double area;
	private String name;
	public abstract void findArea();
	
	public Shape(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println("Shape Name: " + name);
		System.out.println("Area: " + area);
	}
}
