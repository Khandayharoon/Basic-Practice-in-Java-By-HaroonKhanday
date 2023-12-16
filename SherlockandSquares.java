package ArraysAndLogic.com;

public class SherlockandSquares {

	public static void main(String[] args) {
		int count = squares(100, 1000);
		System.out.println(count);

	}

	public static int squares(int a, int b) {
		// Write your code here

		int count = 0;

		for (int i = a; i <= b; i++) {
			// Check if i is a perfect square
			int sqrt = (int) Math.sqrt(i);
			if (sqrt * sqrt == i) {
				count++;
			}
		}

		return count;
	}
}
