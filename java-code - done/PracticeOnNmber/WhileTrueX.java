package PracticeOnNmber;

import java.util.Scanner;

public class WhileTrueX {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			char ch = s.next().trim().charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '%' || ch == '/') {
				int a = s.nextInt();
				int b = s.nextInt();

				if (ch == '+') {
					System.out.println((a + b));
				}
				if (ch == '-') {
					System.out.println((a - b));
				}
				if (ch == '*') {
					System.out.println((a * b));
				}
				if (ch == '%') {
					System.out.println((a % b));
				}
				if (ch == '/') {
					if (b == 0) {
						System.out.println("Invaild operation as denomiaroter is 0");
					} else {
						System.out.println((a / b));
					}
				}
			} else if (ch == 'X' || ch == 'x') {
				System.out.println("Cant do any operations");
				break;
			}

		}
		s.close();
	}

}
