package PracticeOnNmber;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {

		digitCount();
	}

	public static void digitCount() {
		int num;
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("please Enter any Long Number and a Digit:");
		num = s.nextInt();
		n = s.nextInt();
		int count = 0;
		while (num >0) {
			int rem = num % 10;
			if (rem == n) {
				count++;
			}
			num = num / 10;
		}
		System.out.println("The Digit of " + n + " is:-" + " " + count);
		s.close();
	}
}
