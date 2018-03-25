package nthPowerOfNumber;

public class NthPower {

	public static long nthMultiply(long inputNumber, int power) {
		long result = 1;

		while (power > 0) {
			result = result * inputNumber;
			power--;
		}

		return result;
	}
	
	public static int countNoOfDigit(int input) {
		int result = 0;
		while(input > 0) {
			input = input/10;
			result ++ ;
		}
		
		return result;
		
	}

	public static void armstrong(int input) {
		int length = countNoOfDigit(input);
		long result = 0;
		int armstrongInput = input;
		while(input > 0) {
			
			result = result + nthMultiply(input%10, length);
			input = input / 10;
		}
		
		if(armstrongInput == result) {
			System.out.println("YES! armstrong");
		} else {
			System.out.println("NO!");
		}
	}
	
	public static void main(String[] args) {
		
		armstrong(153);
	}
	
}
