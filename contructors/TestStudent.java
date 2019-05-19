package contructors;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.print();
		Student s2 = new Student(1, "Abhishek", 100);
		s2.print();
	}

}
