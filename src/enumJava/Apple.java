package enumJava;

public enum Apple {
	
	kashmir(30),
	wb(10),
	kerala(20),
	nagpur(25),
	unknown()
	;
	
	private final int PRICE;
	
	// constructor to initialized the value
	Apple(int price) {
		this.PRICE = price;
	}
	// over loaded constructor
	Apple() {
		this.PRICE = 0;
	}
	
	public int getPrice() {
		return PRICE;
	}

}
