package garbageCollectionJava;

public class TestGC {
	
	/**
	 * Sytem.gc() -> static method in class system.
	 * Runtime.getRunTime.gc() -> Reference method in runtime class. system.gc() internally calls this runtime gc method.
	 */

	public void print() {
		System.out.println("print method of class");
	}

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("before creating any object total memory: " + r.totalMemory());
		System.out.println("before creating any object free memory: " + r.freeMemory());

		for (int i = 0; i < 100; i++) {
			TestGC obj = new TestGC();
			System.out.println("object created");
			obj.print();
		}
		//System.out.println("after creating any object total memory: " + r.totalMemory());
		System.out.println("after creating any object free memory: " + r.freeMemory());

		System.gc();

		//System.out.println("after gc total memory: " + r.totalMemory());
		System.out.println("after gc free memory: " + r.freeMemory());
	}

}
