package innerClass;

/**
 * 
 * If inner class is declared within method called Method local inner class.
 * if you use inner class in non-static method then you can access non-static member of outer class also.
 * if you use inner class in static member then you can not use non static member of outer class. 
 *
 */
public class MethodInnerClass {
	
	static int mutiply1 = 5;
	int multiply2 = 10;
	
	public int getResult1() {
		
		class Inner {
			public int multiply(int x, int y) {
				return x*y*mutiply1*multiply2;
			}
		}
		
		Inner obj = new Inner();
		return obj.multiply(2, 5);		
	}
	
	public static int getResult2() {
		
		class Inner {
			public int multiply(int x, int y) {
				return x*y*mutiply1;
			}
		}
		
		Inner obj = new Inner();
		return obj.multiply(5,7);
	}
	
	public static void main(String[] args) {
		MethodInnerClass obj = new MethodInnerClass();
		System.out.println(obj.getResult1());
		System.out.println(MethodInnerClass.getResult2());
	}
	

}
