package accessModifierJava;

public class Private {
	
	private int num = 20;
	
	private void print() {
		System.out.println(num);
	}
	
	private void print(int data) {
		System.out.println(data);
	}
	
	public static void main(String[] args) {
		Private p = new Private();
		// Private can be access only within class
		
		System.out.println(p.num);
		p.print();
		p.print(777);
	
	}

}
