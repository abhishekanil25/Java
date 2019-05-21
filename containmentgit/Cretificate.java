package containmentgit;

public class Cretificate {
	private String inst, cert, grade;

	public Cretificate() {
		super();
	}

	public Cretificate(String inst, String cert, String grade) {
		super();
		this.inst = inst;
		this.cert = cert;
		this.grade = grade;
	}

	public String getInst() {
		return inst;
	}

	public void setInst(String inst) {
		this.inst = inst;
	}

	public String getCert() {
		return cert;
	}

	public void setCert(String cert) {
		this.cert = cert;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void print() {
		System.out.println("Institute Name: " + inst);
		System.out.println("Certificate Name: " + cert);
		System.out.println("Grade: " + grade);
	}
}
