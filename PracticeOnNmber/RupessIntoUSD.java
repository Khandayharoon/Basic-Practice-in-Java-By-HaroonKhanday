package PracticeOnNmber;

import java.util.Scanner;

public class RupessIntoUSD {

	public static void main(String[] args) {
		double num;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the total number of Rupess that you want to convert:");
		num = s.nextInt();

		System.out.println((num / 83.19));

		s.close();
	}

}
