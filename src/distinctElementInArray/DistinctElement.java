package distinctElementInArray;

/**
 * 
 * Input --> 1,2,3,4,9,5,8,1,9,9 OuttPut --> 1,2,3,4,9,5,8
 * 
 */

public class DistinctElement {

	public static void distinctElement(int[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (input[i] == input[j]) {
					//flag = false;
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.print(input[i] + ",");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,1,3,4,9,5,8,5,1,9,9};
		distinctElement(arr);
		
	}

}
