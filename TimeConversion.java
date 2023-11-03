package com.test.done;

public class TimeConversion {

	public static void main(String[] args) {

		String s = "11:05:45PM";
		timeConversion(s);

	}

	public static String timeConversion(String s) {
		StringBuffer str = new StringBuffer(s);
		String[] arr = s.split(":");
		int num = Integer.parseInt(arr[0]);
		if (s.endsWith("AM")) {
			if (num==12) {
				str.replace(0, 2, "00");
			}
		} else {
			if (num < 12) {
				num = num + 12;
			}
			str.replace(0, 2, num + "");
		}

		str.replace(8, 10, " ");
//		System.out.println(str);
		return str.toString();
	}

}
