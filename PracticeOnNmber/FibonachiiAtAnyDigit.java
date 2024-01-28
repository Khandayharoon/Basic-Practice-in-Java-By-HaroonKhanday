package PracticeOnNmber;

import java.util.Scanner;

public class FibonachiiAtAnyDigit {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int a = 0;
		int b = 1;
		int count = 2;

		while (count <= n) {
			int temp = b;
			b = b + a;
			a = temp;
			count++;
		}
		System.out.println("The nTh number is:-" + " " + b);
	s.close();
	}

}
