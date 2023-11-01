package com.test.done;

public class DrawingBook {

	public static void main(String[] args) {
		
		
		pageCount(7, 8);
	}

	public static void pageCount(int n, int p) {
		int div = n / 2;
		int pages = 0;
		if(n==0 || p==0) {
			System.out.println(0);
		}
		if (p > div) {
			for (int i = n; i > p; i--) {
				pages = pages + 1;
			}
			
		} else {
			for (int i = 0; i < p; i++) {
				pages = pages + 1;
			}
		}
		pages = pages / 2;

		System.out.println(pages);
	}

}
