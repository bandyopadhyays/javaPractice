package commonElementInArrayorString;

public class CommonElement {

	public void commonElement(int[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (input[i] == input[j]) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println(input[i] + " " + "at index - " + (i + 1));
			}

		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 8, 9, 5, 4, 6, 7, 1, 8, 6, 3, 77, 2, 3, 9 };
		CommonElement obj = new CommonElement();
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
		obj.commonElement(input);
	}

}
