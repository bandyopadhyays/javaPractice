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
	
	/*
	@Override
	public void auto () {
		System.out.println("overriden method in test1 claass");
	}
	*/
	
	
	public static void main(String[] args) {
		AbstractClassOne obj = new Test1();
		obj.car();
		obj.run();
		obj.auto();
	}

}
