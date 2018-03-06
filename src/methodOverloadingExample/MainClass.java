package methodOverloadingExample;

public class MainClass {
	
	/**
	 * 
	 * you can overload main method but only String[] args argument main method will be executed. 
	 * 
	 */
	
	public static void main(String[] args) {
		
		PrClass obj = new PrClass();
		obj.method();
		obj.method("Souni");
		PrClass.method1();
		PrClass.method1("Banerjee");
		
	}
	
	public static void main(int args) {
		
		System.out.println("main 2");
		
	}
	

}
