package garbageCollectionJava;

/**
 * 
 * Jest before destroying the object garbage collector always calls finalize method 
 * to clean up activity on that object corresponding class
 *
 */

public class FinalizationCase1 {

	public void finalize() {
		System.out.println("Finalize method of class FinalizationCase1");
	}
	
	public void print() {
		System.out.println("print method..");
	}
	
	public static void main(String[] args) {
		
		//String s1 = new String("MB");
		//System.out.println(s1);
		//s1 = null;
		FinalizationCase1 obj = new FinalizationCase1();
		obj.print();
		obj = null;
		System.gc();
		System.out.println("end of main");
		
	}
	
}

