package com.test.done;

public class Tes {
	static int space = 4;

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= space; k++) {
				System.out.print(" ");
			}
			space--;
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
