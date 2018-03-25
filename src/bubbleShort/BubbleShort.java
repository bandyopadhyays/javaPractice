package bubbleShort;

public class BubbleShort {

	public void bubbleShort(int[] input) {

		int temp = 0;
		for (int i = 0; i < input.length; i++) {			// outer for loop will loop for total no of element
			for (int j = 1; j < (input.length - i); j++) {	// inner for loop will loop from second element to last-i element
				if (input[j - 1] > input[j]) {
					temp = input[j - 1];
					input[j - 1] = input[j];
					input[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		BubbleShort obj = new BubbleShort();
		int[] input = { 3, 2, 9, 17, 690, 77, 1, 5 };

		System.out.println("Array before shorting..");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

		obj.bubbleShort(input);

		System.out.println();

		System.out.println("Array after shorting..");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
