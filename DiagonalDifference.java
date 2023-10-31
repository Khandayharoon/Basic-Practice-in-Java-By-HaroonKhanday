package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		List<List<Integer>> arr = new ArrayList<>();
		{
			for (int i = 0; i < rows; i++) {
				List<Integer> list = new ArrayList<Integer>();
				for (int j = 0; j < rows; j++) {
					list.add(scan.nextInt());
				}
				arr.add(list);
			}

		}
		difagonalDifference(arr);

	}

	public static void difagonalDifference(List<List<Integer>> arr) {
		int rightSum = 0;
		int leftSum = 0;
		int length = arr.size();

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (i == j) {
					rightSum = rightSum + arr.get(i).get(j);
				}
			}
		}

//		System.out.println(rightSum);
		int x = length - 1;

		for (int i = 0; i < length; i++) {
			for (int j = length - 1; j >= 0; j--) {
//				System.out.println(j + " : " + x);
				if (j == x) {
					leftSum = leftSum + arr.get(i).get(j);
//					System.out.println("Adding " + arr.get(i).get(j));
				}
			}
			x--;
		}
//		System.out.println(leftSum);

		int sum = Math.abs(leftSum - rightSum);
		System.out.println(sum);

	}

}
