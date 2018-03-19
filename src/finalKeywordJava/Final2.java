package finalKeywordJava;

public class Final2 extends Final1{

	Final2(String pan) {
		super(pan);
	}
	
	public static void main(String[] args) {
		Final2 obj = new Final2("ATKPB1868F");
		System.out.println(obj.PAN_CARD_NUMBER);
		obj.method();
	}
	

}
