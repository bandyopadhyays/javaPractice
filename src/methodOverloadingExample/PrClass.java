package methodOverloadingExample;

/**
 * 
 * Method overloading is the static polymorphism.
 * Method name and return type should be same and argument should vary.
 * By different return type method overloading is not possible in java. 
 *
 */

public class PrClass {

	public void method() {
		System.out.println("method - with no argument");
	}
	
	/**
	 * below method is same name with method but different return type. java compiler will throw error. 
	 */
	//public String method() {
	//	
	//}
	
	public void method(String str) {
		System.out.println("method - with string argument " + str);
	}
	
	public static void method1() {
		System.out.println("static method1 with no argument");
	}
	
	public static void method1(String str) {
		System.out.println("static method1 with string argument " + str);
	}
}
