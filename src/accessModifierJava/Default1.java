package accessModifierJava;

public class Default1 extends Default{

	public static void main(String[] args) {
		Default d = new Default();
		Private p = new Private();
		
		// default can be access in different class in same package from child class
		d.print();
		d.print(500);
		
		// private can not be access from different class
		
	}
}
