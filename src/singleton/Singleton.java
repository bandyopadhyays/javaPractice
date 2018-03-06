package singleton;

public class Singleton {
	
	private String singleton_string;
	private static Singleton obj = null;
	Singleton() {
		singleton_string = "singleton";
	}
	
	public static Singleton getInstance() {
		if(obj == null){
			obj = new Singleton();
		}
		return obj;
	}

}
