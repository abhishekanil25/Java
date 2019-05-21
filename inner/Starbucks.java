package inner;

public class Starbucks {
	private int cap;
	private String loc;
	
	public Starbucks() {
		super();
	}

	public Starbucks(int cap, String loc) {
		super();
		this.cap = cap;
		this.loc = loc;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public void printStar() {
		System.out.println("Lacation: " + loc);
		System.out.println("Capacity: " + cap);
	}
	
	public class Cofee{
		private int price;
		private String type;
		
		public Cofee() {
			super();
		}

		public Cofee(int price, String type) {
			super();
			this.price = price;
			this.type = type;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		public void printCofee() {
			System.out.println("Type of Cofee: " + type);
			System.out.println("Price of Cofee: " + price);
		}
		
	}
}
