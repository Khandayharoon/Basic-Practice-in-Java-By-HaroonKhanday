package com.test.done;

public class CountingValleys {

	public static void main(String[] args) {

		String path = "UDDDUDUU";
		int steps = 8;
		countingValleys(steps, path);
	}

	public static int countingValleys(int steps, String path) {
		int valley = 0;
		int level = 0;
		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == 'U') {
				level++;
			} else {
				level--;

				if (level == -1) {
					valley++;
				}
			}
		}
		System.out.println(valley);
		return valley;

	}

}
