package PracticeOnNmber;

public class MaximumAndMinimum {

	public static void main(String[] args) {

		int max = max(23, 78, 98);
		int min = min(23, 78, 98);
		System.out.println("MAX and MIN are :" + " " + max + " and " + min);
	}

	static int max(int a, int b, int c) {
		int res = Math.max(a, Math.max(b, c));
		return res;
	}

	static int min(int a, int b, int c) {
		int res = Math.min(a, Math.min(b, c));
		return res;
	}
}
