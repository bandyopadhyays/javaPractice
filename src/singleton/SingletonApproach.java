package singleton;

public class SingletonApproach {

	/**
	 * create private reference of class
	 */
	private static SingletonApproach obj = null;

	/**
	 * create private constructor so that class can not have object in outside
	 * any class
	 */
	private SingletonApproach() {

	}
	
	/**
	 * 
	 * Now, create a getter method to get the instance of the class.
	 */
	public static SingletonApproach getInstance() {
		if(obj == null) {
			obj = new SingletonApproach();
		}
		
		return obj;
	}
	
	public void print() {
		System.out.println("I am singleton class...");
	}

	
}
