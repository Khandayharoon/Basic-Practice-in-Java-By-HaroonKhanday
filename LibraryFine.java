package com.test.done;

public class LibraryFine {

	public static void main(String[] args) {
		int d1 = 31;// return
		int m1 = 12;
		int y1 = 2023;

		int d2 = 1;
		int m2 = 11;
		int y2 = 2023;
		int fine = libraryFine(d1, m1, y1, d2, m2, y2);
		System.out.println(fine);
	}

	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

		int fine = 0;
		if (y1 != y2) {
			if (y1 > y2) {
				fine = 10000;
			}
		} else {
			if (m1 != m2) {
				if (m1 > m2) {
					fine = 500 * (m1 - m2);
				}
			} else {
				if (d1 - d2 > 0) {
					fine = 15 * (d1 - d2);
				}
			}
		}

		return fine;
	}
}
