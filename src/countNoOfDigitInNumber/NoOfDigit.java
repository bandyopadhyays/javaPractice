package countNoOfDigitInNumber;

public class NoOfDigit {
	
	public static int noOfDigit(int num) {
		int count = 0;
		while(num>0) {
			num = num/10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(noOfDigit(1115522));
	}

}
