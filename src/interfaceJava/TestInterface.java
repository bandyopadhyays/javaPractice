package interfaceJava;

/**
 * 
 * Interface must contain at least one abstract method.
 * By default interface methods are public and abstract.
 * By default interface variables are public static final.
 * we can not create interface object. 
 * interface can have concrete default method.
 * interface can have concrete static method.
 */

public interface TestInterface {

	public static final int num = 20;
	
	public abstract void run();
	
	static void interfaceMethod() {
		System.out.println("Print static method..");
	}
	
	default void interfaceMethod1() {
		System.out.println("Print default method..");
	}
}
