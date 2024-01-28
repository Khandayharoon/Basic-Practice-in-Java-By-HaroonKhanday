package PracticeOnNmber;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Factorial(4);

	}

	private static void Factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
