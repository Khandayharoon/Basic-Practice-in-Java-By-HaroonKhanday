package com.test;

import java.util.ArrayList;
import java.util.List;

public class Quicksort1Partition {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(7);
		arr.add(4);
		arr.add(3);
		arr.add(8);
		quickSort(arr);

	}

	public static List<Integer> quickSort(List<Integer> arr) {
		// Write your code here
		int p = arr.get(0);
		int min = 0;
		int max = arr.size() - 1;
//		List<Integer> res = [new ArrayList<Integer>();
		int res[] = new int[max + 1];
		for (int i = 1; i < arr.size(); i++) {
			if (p > arr.get(i)) {
				res[min] = arr.get(i);
				min++;
			} else if (p < arr.get(i)) {
				res[max] = arr.get(i);
				max--;
			}

		}

		res[max] = p;
		List result = new ArrayList<Integer>();
		for (int i = 0; i < res.length; i++) {
			result.add(i, res[i]);
		}

		return result;
	}

}
