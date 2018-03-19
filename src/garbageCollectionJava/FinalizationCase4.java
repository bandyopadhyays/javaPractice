package garbageCollectionJava;

public class FinalizationCase4 {
	
	/**
	 * implicit Finalize call will be happen only once though there is multiple chance of object eligible for garbage collection.
	 */
	
	public static FinalizationCase4 s;
	
	public void print() {
		System.out.println("print method..");
	}
	
	public void finalize() {
		s = this;
		System.out.println("Finalize mthod..");
	}
	
	public static void main(String[] args) throws InterruptedException {
		FinalizationCase4 obj = new FinalizationCase4();
		obj.print();
		obj = null;
		System.gc();
		Thread.sleep(5000);
		s.print();
		s=null;
		System.gc();
		System.out.println("end of main..");
	}

}
