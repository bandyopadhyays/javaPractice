package exceptionHandling;

public class TestCustomException {
	
	public static void vote (int age) throws CustomException {
		if(age > 18) {
			System.out.println("Please vote");
		} else {
			throw new CustomException("U are not aligible to vote"); 
		}
	}
	
	public static void main(String[] args) {
		try {
			vote(17);
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}

}
