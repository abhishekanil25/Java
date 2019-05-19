package Single;

public class Car extends Vehicle{
	String geartype;
//	public Car(String name, String color, int speed, String geartype) {
//		super(name, color, speed);
//		this.geartype = geartype;
//	}
//	
//	public String getGeartype() {
//		return geartype;
//	}
//
//	public void setGeartype(String geartype) {
//		this.geartype = geartype;
//	}

	void accelerate() {
		speed = speed + 30;
		System.out.println("Speed is increasing by 30 km/hr. Now speed is " + speed + "km/hr");
	}
	void print() {
		super.print();
		System.out.println("Gear Type: " + geartype);
	}
}
