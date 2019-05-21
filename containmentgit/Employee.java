package containmentgit;

public class Employee {
	private int id;
	private String name;
	private float sal;
	private Cretificate cert;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, float sal, Cretificate cert) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.cert = cert;
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

	public Cretificate getCert() {
		return cert;
	}

	public void setCert(Cretificate cert) {
		this.cert = cert;
	}
	
	public void print() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + sal);
		cert.print();
	}
	
	
}
