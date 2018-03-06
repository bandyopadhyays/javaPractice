package accessModifierJava;

public class Protected1 {

	public static void main(String[] args) {
		// protected can be access in same package non sub class
		Protected p = new Protected();
		p.print();
	}
}
