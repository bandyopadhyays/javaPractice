package inhertanceAndMethodOverriding;

public class ChildClass extends ParentClass{
	
	@Override
	public void print(String input) {
		System.out.println("Child class method - " + input);
	}
	
	public static void prints(String input) {
		System.out.println("Child class static method - " + input);
	}

}
