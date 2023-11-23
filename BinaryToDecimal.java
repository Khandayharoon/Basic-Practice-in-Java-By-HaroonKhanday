package ArraysAndLogic.com;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter the Binary value that you want to convert into Decimal");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		btoD(num);
		s.close();
	}

	public static void btoD(int num) {
		int rem;
		int dec = 0;
		int base = 1;

		while (num != 0) {
			rem = num % 10;
			dec = dec + (rem * base);
			num = num / 10;
			base = base * 2;
		}
		System.out.println(dec);
	}
}
