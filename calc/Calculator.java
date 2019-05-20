package calc;

public class Calculator {
	private float num1, num2, result;
		
	public Calculator() {
		
	}

	public Calculator(float num1, float num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	public void add() {
		result = num1 + num2;
	}
	public void sub() {
		result = num1 - num2;
	}
	public void mul() {
		result = num1 * num2;
	}
	public void div() {
		result = num1 / num2;
	}
	public void print() {
		System.out.println("Result: " + result);
	}
}
