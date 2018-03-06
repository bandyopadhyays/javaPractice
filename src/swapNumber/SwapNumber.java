package swapNumber;

public class SwapNumber {

	// swap without third veriable
	public void swap(int first, int second) {
		System.out.println("Before swapping first number is:- "+first);
		System.out.println("Before swapping second number is:- "+second);
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println("After swapping first number is:- "+first);
		System.out.println("After swapping first number is:- "+second);
	}
	
	// swap with third veriable
		public void swap1(int first, int second) {
			System.out.println("Before swapping first number is:- "+first);
			System.out.println("Before swapping second number is:- "+second);
			int temp;
			temp = first;
			first = second;
			second = temp;
			System.out.println("After swapping first number is:- "+first);
			System.out.println("After swapping first number is:- "+second);
		}

	public static void main(String[] args) {

		SwapNumber obj = new SwapNumber();
		obj.swap(10, 20);
		System.out.println();
		obj.swap1(50, 100);
	}

}
