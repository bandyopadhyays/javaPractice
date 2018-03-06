package accessModifierJava;

public class Protected {
	
	protected int a = 55;
	
	protected void print() {
		System.out.println(a);
	}
	
	protected void print(int data) {
		System.out.println(data);
	}
	
	public static void main(String[] args) {
		// protected caan be access in same class
		Protected p = new Protected();
		System.out.println(p.a);
		p.print();
		p.print(555);
	}

}
