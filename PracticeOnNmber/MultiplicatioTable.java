package PracticeOnNmber;

import java.util.Scanner;

public class MultiplicatioTable {

	public static void main(String[] args) {

		System.out.println("Please Enter a Number whom Multiplication Table you Want:");
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		table(num);
		s.close();
	}

	public static void table(int num) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " " + "X" + " " + i + " " + "=" + " " + (num * i));
		}
	}

}
