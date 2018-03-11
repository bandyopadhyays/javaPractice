package innerClass;

/**
 * 
 * It used for one time only.
 * Suppose you have one abstract class and you want to use it for one time it is better to use annanomas inner class. 
 * for example when you use new expected condition for wait. 
 *
 */

public class AnanomasInnerClass {

	public static void main(String[] args) {
		AbstractClass obj = new AbstractClass() {
			
			@Override
			public void run() {
				System.out.println("i am running");
				
			}
		};
		
		obj.run();
	}
}
