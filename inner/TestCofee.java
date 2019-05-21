package inner;

public class TestCofee {

	public static void main(String[] args) {
		Starbucks star = new Starbucks(500, "Mumbai");
		Starbucks.Cofee cofee = star.new Cofee(100, "Latte"); 
		star.printStar();
		cofee.printCofee();
	}

}
