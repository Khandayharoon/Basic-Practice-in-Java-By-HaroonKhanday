package PracticeOnNmber;

import java.util.Scanner;

public class HCFandLCMofTwoNumbers {

	public static void main(String[] args) {
		int a, b;
		System.out.println("Please enter two numbers");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		findHCFandLCM(a, b);
		s.close();
	}

	public static void findHCFandLCM(int a, int b) {
		int hcf = findHCF(a, b);
		int lcm = (a * b) / hcf;
		// LCM = (a * b) / HCF

		System.out.println("HCF is " + hcf);
		System.out.println("LCM is " + lcm);
	}

	public static int findHCF(int a, int b) {
		int hcf = 1;
		int smaller;
		if (a < b) {
		    smaller = a;
		} else {
		    smaller = b;
		}
//		int smaller = (a < b) ? a : b;


		for (int i = 1; i <= smaller; i++) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}

		return hcf;
	}
}
