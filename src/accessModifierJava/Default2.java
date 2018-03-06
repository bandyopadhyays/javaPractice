package accessModifierJava;

public class Default2 {

	public static void main(String[] args) {
		Default d = new Default();
		
		// default can be access in same package non sub class
		
		System.out.println(d.a);
		d.print();
	}
}
