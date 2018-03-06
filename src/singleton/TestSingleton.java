package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
		//obj.getInstance();
		//Singleton obj1 = new Singleton();
		
		FinalClass obj2 = new FinalClass();
		obj2.print();
	}
}
