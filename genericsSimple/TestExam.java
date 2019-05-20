package genericsSimple;

public class TestExam {

	public static void main(String[] args) {
		Exam e1 = new Exam("Maths");
		e1.print();
		Exam e2 = new Exam (new Float (33006));
		e2.print();

	}

}
