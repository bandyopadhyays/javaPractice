package reverseNumber;

public class ReverseNumber {

	public long reverse(long number) {
		long reverse = 0;

		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		long number = 123456789;
		System.out.println("Reverse of " + number + " is " + obj.reverse(number));
	}
}
