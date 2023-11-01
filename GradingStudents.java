package com.test.done;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

	public static void main(String[] args) {

		List<Integer> grading = new ArrayList<>();
		grading.add(73);
		grading.add(67);
		grading.add(38);
		grading.add(33);

		gradingStudents(grading);
	}

	public static void gradingStudents(List<Integer> grades) {

		int length = grades.size();

		for (int i = 0; i < length; i++) {
			if (grades.get(i) >= 38) {
				int rem = grades.get(i) % 5;
				if (rem >= 3) {
					grades.add(i, grades.get(i) + (5 - rem));
					grades.remove(i + 1);
				}
			}

		}
		System.out.println(grades);

	}
}
