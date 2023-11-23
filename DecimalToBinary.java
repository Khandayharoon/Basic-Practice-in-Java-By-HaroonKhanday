package ArraysAndLogic.com;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter the number for you want the Binary value");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		DtoB(num);
		s.close();
	}

	public static void DtoB(int num) {

		long bin = 0;
		long rem = 1;
		long i = 1;

		while (num != 0) {
			rem = num % 2;
			bin = bin + (rem * i);
			i = i * 10;
			num = num / 2;
		}

		System.out.println(bin);
	}

}
