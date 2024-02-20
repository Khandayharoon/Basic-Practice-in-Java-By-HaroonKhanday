package PracticeOnNmber;

import java.util.Scanner;

public class LargestAmongThreeDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int max = Math.max(a, Math.max(b, c));
		System.out.println("Largest Number is:-" + " " + max);

		s.close();
	}

}
