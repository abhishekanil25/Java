package array;

public class Employee {
	private int id;
	private String name;
	private float sal;
	private String[] lang;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, float sal, String[] lang) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.lang = lang;
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

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public String[] getLang() {
		return lang;
	}

	public void setLang(String[] lang) {
		this.lang = lang;
	}
	
	public void print() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + sal);
		
		System.out.println("Employee Languages: ");
		for (int i = 0; i < lang.length; i++) {
			System.out.println(lang[i]);
		}
	}
}
