package abstractClass;

public class Test1 extends AbstractClassOne{

	@Override
	public void run() {
		
		System.out.println("again running");
		
	}

	@Override
	void car() {
		
		System.out.println("again car");
		
	}
	
	public static void main(String[] args) {
		AbstractClassOne obj = new Test1();
		obj.car();
		obj.run();
	}

}
