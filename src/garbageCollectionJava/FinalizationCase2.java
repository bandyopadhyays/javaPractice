package garbageCollectionJava;

public class FinalizationCase2 {
	
	/**
	 * 
	 * If you call the finalize method explicitly it will be called like regular method
	 * 
	 */
	
	public static void main(String[] args) {
		
		FinalizationCase2 obj = new FinalizationCase2();
		obj.finalize();
		obj.finalize();
		obj = null;
		System.gc();
		System.out.println("End of main");
		
	}
	
	public void finalize() {
		System.out.println("Finalize method..");
	}

}
