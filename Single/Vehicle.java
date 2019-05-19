package Single;

public class Vehicle {
	String name, color;
	int speed;
	public Vehicle() {
		
	}
	
	void accelerate() {
		System.out.println("Accelerating Speed ...");
	}
//	public Vehicle(String name, String color, int speed) {
//		this.name = name;
//		this.color = color;
//		this.speed = speed;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	public int getSpeed() {
//		return speed;
//	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
	void print() {
		System.out.println("\n"+"Vehicle Name: " + name);
		System.out.println("Vehicle Color: " + color);
		System.out.println("Vehicle Speed: " + speed + "km/hr");
	}
}
