package Single;

public class Bike extends Vehicle {
	int stroke;
	
//	public Bike(String name, String color, int speed, int stroke) {
//		super(name, color, speed);
//		this.stroke = stroke;
//	}
//	
//	public int getStroke() {
//		return stroke;
//	}
//
//	public void setStroke(int stroke) {
//		this.stroke = stroke;
//	}

	void accelerate() {
		speed = speed + 15;
		System.out.println("Speed is increasing by 15 km/hr. Now, speed is " + speed + "km/hr");
	}
	void print() {
		super.print();
		System.out.println("Stroke: " + stroke);
	}
}
