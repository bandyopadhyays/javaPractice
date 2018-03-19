package genericsJava;

public class GenericsClass1 <T> {
	
	private T obj;

	public GenericsClass1(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
	
	public void show() {
		System.out.println("The type of objct: " + obj.getClass().getName());
	}

}
