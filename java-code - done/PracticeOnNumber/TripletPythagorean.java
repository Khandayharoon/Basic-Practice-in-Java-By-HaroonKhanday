package PracticeOnNumber;

public class TripletPythagorean {

	public static void main(String[] args) {
		int num = 228;
		if (tripletPythagorean(num)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private static boolean tripletPythagorean(int num) {
		long sumOfSquares = 0;

		while (num > 0) {
			int rem = num % 10;
			sumOfSquares += (long) Math.pow(rem, 2);
			num = num / 10;
		}

		return Math.sqrt(sumOfSquares) % 1 == 0;
	}
}
