package genericsSimple;

public class Exam {
	Object code;

	public Exam(Object code) {
		this.code = code;
	}

	public Object getCode() {
		return code;
	}

	public void setCode(Object code) {
		this.code = code;
	}
	
	public void print() {
		System.out.println("Code Type: " + code.getClass().getSimpleName());
		System.out.println("Code: " + code);
	}
}
