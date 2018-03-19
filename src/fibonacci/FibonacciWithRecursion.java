package fibonacci;

public class FibonacciWithRecursion {

	static int num1 = 0;
	static int num2 = 1;
	static int num3 = 0;

	public void fibo(int count) {

		if (count > 0) {
			num3 = num2 + num1;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
			fibo(count - 1);
		}
	}

	public static void main(String[] args) {
		int count = 10;
		System.out.print(" " + num1);
		System.out.print(" " + num2);
		FibonacciWithRecursion obj = new FibonacciWithRecursion();
		obj.fibo(count - 2);
	}
}
