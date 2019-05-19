package InnerClass;

public class CafeCofeeDay {
	String add;
	int cap;
	public CafeCofeeDay() {
		
	}
	public CafeCofeeDay(String add, int cap) {
		this.add = add;
		this.cap = cap;
	}
	void printCafeCofeeDay() {
		System.out.println("Adress of CCD: " + add);
		System.out.println("Capacity of CCD: " + cap);
	}
	class BlackCofee {
		String flavor;
		float price;
		public BlackCofee() {
			
		}
		public BlackCofee(String flavor, float price) {
			this.flavor = flavor;
			this.price = price;
		}
		void printBlackCofee() {
			System.out.println("Flavor of Black Cofee is: " + flavor);
			System.out.println("Price of Black Cofee is: " + price);
		}
	}
}
