package com.test.done;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {
	public static void main(String[] args) {

		List<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);

		divisibleSumPairs(6, 5, ar);
	}

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int pairs = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((ar.get(i) + ar.get(j)) % k == 0) {
					pairs++;
				}
			}
		}
		System.out.println(pairs);
		return 0;

	}

}
