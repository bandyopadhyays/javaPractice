package highestAndLowest;

public class HighestAndLowest {

	public void ManxAndMin(int[] input) {
		int max = input[0];
		int min = input[0];

		for (int i = 1; i < input.length; i++) {
			if (max < input[i]) {
				max = input[i];
			} else if (min > input[i]) {
				min = input[i];
			}
		}

		System.out.println("Max is:: " + max);
		System.out.println("Min is:: " + min);
	}

	public static void main(String[] args) {
		int[] input = { 1, -10, 25, 99, -77, 962, -100, 983, 999, 5, -105, 785 };
		System.out.println(input.toString());

		HighestAndLowest obj = new HighestAndLowest();
		obj.ManxAndMin(input);
	}

}
