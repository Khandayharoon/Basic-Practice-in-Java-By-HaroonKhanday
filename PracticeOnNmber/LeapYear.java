package PracticeOnNmber;

import java.util.Scanner;

public class LeapYear {

		public static void main(String [] args) {
			
			System.out.println("Please Enter the Year:");
			Scanner s = new Scanner(System.in);
			int year = s.nextInt();
			
			if(year%4==0 && year%100 !=0 || (year %400==0)) {
				System.out.println(year +" "+" is the Leap year");
			}
			else
			{
				System.out.println(year +" "+" is not Leap year");
			}
			
		s.close();	
		}
}
