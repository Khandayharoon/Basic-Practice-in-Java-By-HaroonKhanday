package PracticeOnNmber;

import java.util.Scanner;

public class largestNumberFrom {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int largest = Integer.MIN_VALUE;
		while (true) {
			int num = s.nextInt();

			if (num == 0) {
				break;
			} else {
				if (num > largest) {
					largest = num;
				}
			}
		}
		System.out.println(largest);
		s.close();
	}

}
