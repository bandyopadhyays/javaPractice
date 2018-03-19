package garbageCollectionJava;

public class FinalizationCase3 {
	
	/**
	 * At the time of calling finalize method if there is unchecked exception JVM will ignore that. 
	 */

	public void finalize() {
		System.out.println("finalize call..");
		System.out.println(10/0);
	}
	
	public static void main(String[] args) {
		FinalizationCase3 obj = new FinalizationCase3();
		//obj.finalize();   // it will throw exception
		obj = null;
		System.gc();
		System.out.println("end of main..");
	}
}
