package PracticeOnNmber;

public class SubtracttheProductandSum {

	public static void main(String[] args) {
		int n = 4421;
		int product = 1;
		int sum = 0;
		while (n > 0) {

			int rem = n % 10;
			product = product * rem;
			sum = sum + rem;
			n = n / 10;

		}
		System.out.println(product-sum);
	}

}
