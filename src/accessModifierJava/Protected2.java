package accessModifierJava;

public class Protected2 extends Protected {
	
	public static void main(String[] args) {
		// protected can be access in same package sub class
		Protected2 p = new Protected2();
		System.out.println(p.a);
	}

}
