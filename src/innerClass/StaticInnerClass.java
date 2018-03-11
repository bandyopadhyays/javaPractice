package innerClass;

public class StaticInnerClass {

	/**
	 * It can access static data members of outer class including private.
	 * Static nested class cannot access non-static (instance) data member or
	 * method.
	 */
	
	static class Inner {
		void msg() {
			System.out.println("static inner");
		}
	}
	
	public static void main(String[] args) {
		StaticInnerClass.Inner obj = new Inner();
		obj.msg();
	}

}
