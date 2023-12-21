package PracticeOnNmber;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num;
		int count = 2;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a + "," + b + ",");
		while (count <= num) {
			int temp = b;
			b = b + a;
			a = temp;
			System.out.print(b + ",");
			count++;
		}

		s.close();
	}

}
