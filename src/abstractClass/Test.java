package abstractClass;

public class Test extends AbstractClass {

	@Override
	public void run() {
		
		System.out.println("I am running");
		
	}

	@Override
	void car() {
		
		System.out.println("car");
		
	}
	
	public static void main(String[] args) {
		AbstractClass obj = new Test();
		obj.run();
		obj.car();
		System.out.println(obj.code);
		System.out.println(obj.gear);
		obj.wheel();
	}

	
	
}
