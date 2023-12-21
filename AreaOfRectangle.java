package PracticeOnNmber;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the Length of Rectangle: ");
		int length = s.nextInt();
		System.out.println("please enter the Width of Rectangle:  ");
		int width = s.nextInt();
		int result = areaOfRectangle(length, width);
		System.out.println("The Area of a Rectangle is:" + " " + result);
		s.close();
	}

	static int areaOfRectangle(int l, int w) {

		int area = l * w;

		return area;
		}
}
