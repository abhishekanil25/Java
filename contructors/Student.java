package contructors;

public class Student {
	private int id;
	private String name;
	private float mark;
	public Student() {
		System.out.println("It is Default Constructor");
	}
	public Student(int id, String name, float mark) {
		System.out.println("\n" + "It is Parameterized Constructor");
		this.id = id;
		this.name = name;
		this.mark = mark;
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
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	void print() {
		System.out.println("\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "Marks: " + mark);
	}
}
