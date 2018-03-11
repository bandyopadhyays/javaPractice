package abstractClass;

public abstract class AbstractClass {

	/**
	 * A class contains 0 or any no of abstract method called abstract class.
	 * abstract class can not be final abstract method can not be final. you can
	 * not create object of abstract class.
	 * final, static, synchronized, private these are not allowed 
	 * 
	 */
	
	public final int gear = 5;
	int code = 1234;
	public abstract void run();

	abstract void car();

	public void wheel() {
		System.out.println("No.Of wheel is 4");
	}

}
