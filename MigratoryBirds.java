package com.test.done;

public class MigratoryBirds {

	public static void main(String[] args) {

//		int arr[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4 };
		int arr[] = { 1 };
		int num = Integer.MAX_VALUE;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int repeat = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeat++;
				}
			}
//			System.out.println(repeat);

			if (repeat > count) {
				num = arr[i];
				count = repeat;
			} else if (repeat == count) {
				if (arr[i] < num) {
					num = arr[i];
				}
			}
		}
		System.out.println(num);

	}

}
