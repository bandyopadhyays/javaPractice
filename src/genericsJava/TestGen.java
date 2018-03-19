package genericsJava;

public class TestGen {
	
	public static void main(String[] args) {
		GenericsClass1<String> obj = new GenericsClass1<String>("MB");
		obj.show();
		System.out.println(obj.getObj());
		System.out.println("-------------- extent type --------------");
		GenericsClass2<Double> obj1 =  new GenericsClass2<Double>(10.15);
		obj1.show();
		System.out.println(obj1.getType());
	}

}
