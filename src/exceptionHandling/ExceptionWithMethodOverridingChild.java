package exceptionHandling;

import java.io.FileNotFoundException;

public class ExceptionWithMethodOverridingChild extends ExceptionWithMethodOverriding {

	@Override
	public void method1() throws ArrayIndexOutOfBoundsException{   // can declare unchecked exception
		System.out.println("method1 from child class");
	}
	
	@Override
	public void method2() throws FileNotFoundException {  // can declare child exception class
		System.out.println("method2 from child class");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		ExceptionWithMethodOverridingChild obj = new ExceptionWithMethodOverridingChild();
		obj.method1();
		obj.method2();
	}
}
