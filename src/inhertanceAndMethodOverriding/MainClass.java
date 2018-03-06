package inhertanceAndMethodOverriding;

public class MainClass {

	public static void main(String[] args) {
		ChildClass objC = new ChildClass();
		ParentClass objP = new ParentClass();
		ParentClass objP1 = new ChildClass();
		//ChildClass objC1 =  new ParentClass();
		
		objC.print("objC");
		objP.print("objP");
		objP1.print("objP1");
	}
	
}
