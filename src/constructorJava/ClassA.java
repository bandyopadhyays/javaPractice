package constructorJava;

public class ClassA {
	
	int num;

	private ClassA(int num) {
		this.num = num;
	}
	
	
	
	public void display() {
		System.out.println(num);
	}
}
