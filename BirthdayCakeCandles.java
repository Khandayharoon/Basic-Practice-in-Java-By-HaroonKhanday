package com.test;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		System.out.println("Main");

		List<Integer> candles = new ArrayList<>();
		candles.add(4);
		candles.add(7);
		candles.add(8);
		candles.add(7);
		candles.add(2);
		candles.add(8);

		birthdayCakeCandles(candles);

	}

	public static void birthdayCakeCandles(List<Integer> candles) {
		// Write your code


		int max = 0;
		int count = 1;
		int length = candles.size();

		for (int i = 0; i < length; i++) {
			if (candles.get(i) > max) {
				max = candles.get(i);
				count = 1;
			} else if (candles.get(i) == max) {
				count++;
			}
		}
	}

}
