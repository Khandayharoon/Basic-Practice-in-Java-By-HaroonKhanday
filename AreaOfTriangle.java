package PracticeOnNmber;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		int base;
		System.out.println("Enter the base of a Triangle");
		Scanner s = new Scanner(System.in);
		base = s.nextInt();
		int height;
		System.out.println("Enter the Height of a Triangle");
		height = s.nextInt();

		double area = 0.5 * base * height;

		System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);

		s.close();
	}

}
