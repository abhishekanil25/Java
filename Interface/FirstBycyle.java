package Interface;

public class FirstBycyle implements Bicycle {
	int speed, gear;
	public void changeGear(int newValue) {
		gear=gear+newValue;
	}
	public void speedUp(int inc) {
		speed=speed+inc;
	}
	public void applyBreak(int dec) {
		speed=speed-dec;
	}
}
