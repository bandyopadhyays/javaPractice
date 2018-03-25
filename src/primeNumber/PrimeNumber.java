package primeNumber;

public class PrimeNumber {

	public static void isPrime(int input) {
		int middleIndex = input / 2;

		boolean flag = false;
		if (input == 0 || input == 1) {
			flag = true;
		} else {
			for (int i = 2; i < middleIndex; i++) {
				if (input % i == 0) {
					flag = true;
					break;
				}
			}
		}

		if (!flag) {
			System.out.println("input "+input+" is prime");
		} else {
			System.out.println("input "+input+" is not prime");
		}
	}

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			isPrime(i);
		}
	}

}
