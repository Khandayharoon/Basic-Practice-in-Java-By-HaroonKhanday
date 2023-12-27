package PracticeOnNumber;

public class AllPrimeBetweenTwoNumbers {

	public static void main(String[] args) {
		allPrime(10, 20);
	}

	private static void allPrime(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);

		for (int i = min; i <= max; i++) {
			if (isPrime(i)) {
				System.out.print(i + ", ");
			}
		}
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
