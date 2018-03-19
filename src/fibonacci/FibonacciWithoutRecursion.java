package fibonacci;

public class FibonacciWithoutRecursion {

	public void fibonacci(int count) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;

		System.out.print(num1 + " " + num2);

		for (int i = 2; i < count; i++) {
			sum = num1 + num2;
			System.out.print(" " + sum);
			num1 = num2;
			num2 = sum;
		}
		
	}
	
	public static void main(String[] args) {
		FibonacciWithoutRecursion obj = new FibonacciWithoutRecursion();
		obj.fibonacci(10);
	}

}
