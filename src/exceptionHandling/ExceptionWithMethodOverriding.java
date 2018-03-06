package exceptionHandling;

/**
 * 
 * 1. If the superclass method does not declare an exception 
 * If the superclass method does not declare an exception, subclass overridden method cannot
 * declare the checked exception but it can declare unchecked exception. 
 * 
 * 2. If the superclass method declares an exception 
 * If the superclass method declares an exception, subclass overridden method can declare same, subclass exception
 * or no exception but cannot declare parent exception.
 *
 */

public class ExceptionWithMethodOverriding {

	public void method1() {
		System.out.println("method1 from parent class");
	}
	
	public void method2() throws Exception {
		System.out.println("method2 from parent class");
	}
}
