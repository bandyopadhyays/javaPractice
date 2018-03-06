package polymorphism;

public class MethodOverloading {

	public void M1(int a, String s) {
		System.out.println(a + s);
	}
	
	public void M1(float a, String s) {
		System.out.println(a + s);
	}
	
	public void M1() {
		System.out.println("void");
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.M1();
		obj.M1(1, "abcd");
	}
}
