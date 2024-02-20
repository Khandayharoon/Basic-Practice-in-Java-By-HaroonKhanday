package PracticeOnNmber;

import java.util.Scanner;

public class AreaOfCircleProgram {

	public static void main(String[] args) {

		int radius;
		System.out.println("PLease enter the Radius of Circle");
		Scanner s = new Scanner(System.in);
		radius = s.nextInt();
		double result = (Math.PI * Math.pow(radius, 2));
		System.out.println("The Area of Circle with Radius " + radius + " is : " + " " + result);

		s.close();
	}

}
