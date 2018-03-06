package accessModifierJava;

public class Default {
	
	int a = 20;
	
	void print() {
		System.out.println(a);
	}
	
	void print(int data) {
		System.out.println(data);
	}
	
	public static void main(String[] args) {
		// defauld can be access within the class
		Default d = new Default();
		System.out.println(d.a);
		d.print();
		d.print(10);
	}

}
