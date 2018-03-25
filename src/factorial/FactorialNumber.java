package factorial;

public class FactorialNumber {
	
	static long result = 1;
	
	public static long factorial(long number) {
		//long result = 1;
		
		if(number >= 1){
			result = result * number;
			factorial(number - 1);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

}
