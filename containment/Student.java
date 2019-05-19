package containment;

public class Student {
	private int id;
	private String name;
	private int mark;
	private Date dob;
	
	public Student() {
	
	}

	public Student(int id, String name, int mark, Date dob) {
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public void print() {
		System.out.println("\n" + "Printing Students Details");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Mark: " + mark);
		System.out.println("Printing Date of Birth");
		dob.print();
	}
	
}
