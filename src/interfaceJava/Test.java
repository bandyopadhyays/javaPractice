package interfaceJava;

public class Test implements TestInterfaceOne, TestInterfaceTwo {

	@Override
	public void run() {
		System.out.println("I am running");
		
	}

	@Override
	public void model() {
		System.out.println("I am BMW");
		
	}

	@Override
	public void car() {
		System.out.println("I am car");
		
	}

	public static void main(String[] args) {
		Test obj = new Test();
		
		obj.run();
		obj.model();
		obj.car();
		System.out.println(TestInterface.num);
		TestInterface.interfaceMethod();
		obj.interfaceMethod1();
	}
}
