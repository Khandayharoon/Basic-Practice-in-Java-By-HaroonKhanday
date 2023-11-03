package com.test.done;

import java.util.Scanner;

public class CheckPrimeFunction {

	public static void main(String args[]) {
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		prime(num);
		printAllPrimes(num);
		s.close();
	}

	public static void prime(int num) {
		boolean isPrime = true;
		if (num <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(num + " " + "is prime number");
		} else {
			System.out.println(num + " " + "is Composite number");
		}
	}

	public static void printAllPrimes(int num) {
		System.out.println("Prime numbers from 2 to " + num + ":");
		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i + " is a prime number");
			}
		}
	}
}
