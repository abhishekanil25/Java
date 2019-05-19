package InnerClass;

public class TestCafeCoffeDay {

	public static void main(String[] args) {
		CafeCofeeDay ccd = new CafeCofeeDay("Mumbai", 50);
		CafeCofeeDay.BlackCofee bc = ccd.new BlackCofee("Vanilla", 125f);
		ccd.printCafeCofeeDay();
		bc.printBlackCofee();
	}

}
