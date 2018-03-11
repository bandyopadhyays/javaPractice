package innerClass;

public class RegularInnerClass {

	/**
	 * If we create class inside a class without any static modifier called normal or regular inner class
	 * We can not declare static method inside inner class.
	 * if you declare static variable it should be final
	 */
	int size = 6;
	
	public void car() {
		System.out.println("car model is BMW");
	}
	
	// Inner class -> 
	
	class InneerClass {
		static final int i = 2;
		int j = 3;
		public void carModel() {
			System.out.println("s class "+ size);
		}
	}
	
	// accessing inner code from method
	public void getInner() {
		InneerClass obj = new InneerClass();
		obj.carModel();
	}
	
	// accessing inner code from main method
	public static void main(String[] args) {
		RegularInnerClass outerObj = new RegularInnerClass();
		RegularInnerClass.InneerClass objInner = outerObj.new InneerClass();
		
		outerObj.car();
		outerObj.getInner();
		objInner.carModel();
	}
	
}
