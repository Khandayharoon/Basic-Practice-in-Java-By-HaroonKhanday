package Recursion;

public class CountNumberInADigit {

	public static void main(String[] args) {
		int num = 12345;
		int count = count(num);
		System.out.println(count);

	}

	public static int count(int num) {

		if (num == 0) {
			return 0;
		}

		int smallOutput = count(num / 10);
		int output = smallOutput + 1;

		return output;
	}

}
