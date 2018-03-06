package exceptionHandling;

public class TestThrow {
	
	public void test() {
		try {
			throw new Exception("Test MSG");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TestThrow obj = new TestThrow();
		obj.test();
	}

	
}
