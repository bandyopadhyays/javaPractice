package genericsJava;

/**
 * 
 * We can bound/extent the type parameter by extend keyword. 
 * if type parameter extend class then it can use the child class type also.
 * if type parameter extend interface it can use the implementing class type also.
 * 
 * in below example we are setting a boundation for class to accept only number type.. i.e. integer, short, long, double
 *
 */

public class GenericsClass2 <T extends Number> {
	
	private T obj;
	
	GenericsClass2 (T obj) {
		this.obj = obj;
	}
	
	public T getType() {
		return obj;
	}
	
	public void show() {
		System.out.println("Type of object is: " + obj.getClass().getName());
	}

}
