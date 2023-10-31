package com.test;

import java.util.Scanner;

public class SubarrayDivision {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 1, 4, 2, 1 };
//		int arr[] = { 4 };
		Scanner s = new Scanner(System.in);
		int d, m;
		int count = 0;

		d = s.nextInt();
		m = s.nextInt();
		int sum = 0;

		if (m > 1) {
			for (int i = 0; i < arr.length - m; i++) {
				sum = 0;
				for (int j = i; j < i + m; j++) {
					
					sum = sum + arr[j];
				}
				if (sum == d) {
					count++;
				
				}
			}
		} else {
			sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = arr[i];
				if (sum == d) {
					count++;
				}
			}

		}

		System.out.println(count);
	}

}
