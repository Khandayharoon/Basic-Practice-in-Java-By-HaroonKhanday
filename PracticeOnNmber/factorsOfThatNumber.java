package PracticeOnNmber;

import java.util.Scanner;

public class factorsOfThatNumber {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + ", ");
			}
		}
		s.close();
	}

}
