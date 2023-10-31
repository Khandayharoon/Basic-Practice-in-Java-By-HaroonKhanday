package com.test;

public class PlusMinus {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, -1, -1 };
		float countPlus = 0.0f;
		float countMinus = 0.0f;
		float countZero = 0.0f;
		float ratioPlus = 0.0f;
		float ratioMinus = 0.0f;
		float ratioZero = 0.0f;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				countPlus++;
			} else if (arr[i] < 0) {
				countMinus++;
			} else {
				countZero++;
			}
		}
		ratioPlus = countPlus / arr.length;
		System.out.printf("%.6f", ratioPlus);
		System.out.println();

		ratioMinus = countMinus / arr.length;
		System.out.printf("%.6f", ratioMinus);
		System.out.println();

		ratioZero = countZero / arr.length;
		System.out.printf("%.6f", ratioZero);
		System.out.println();
	}

}
