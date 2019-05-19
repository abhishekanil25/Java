package containment;

//When we include Object of another class as an attribute of one class it is called as containment. 
//E.g. Student Class needs a Date of Birth field. 
//We can use the default java.lang.Date class but we can’t modify it as per our requirements. 
//Hence the best option is to create a new class Date and add attributes as needed. 

public class Date {
	private int dd;
	private int mm;
	private int yyyy;
	public Date() {
		
	}
	public Date(int dd, int mm, int yyyy) {
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYyyy() {
		return yyyy;
	}
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	public void print() {
		System.out.println(dd + "-" + mm + "-" + yyyy);
	}
	
}
