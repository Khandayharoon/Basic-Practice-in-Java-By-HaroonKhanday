package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result {

	public static String sockMerchant(int n, List<Integer> ar) {

		int x1 = 0, v1 = 2, x2 = 5, v2 = 3;
		if(x1>x2) {
			return "NO";
		}
		
		for(int i=1; i<=10000; i++)
		{
			x1+=v1;
			x2+=v2;

			if (x1==x2)
			{
				
				return "YES";
			}


		}
		return "NO";

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {

		List<Integer> ar = new ArrayList<>();
		ar.add(3);
		ar.add(4);
		ar.add(21);
		ar.add(36);
		ar.add(10);
		ar.add(28);
		ar.add(35);
		ar.add(5);
		ar.add(24);
		ar.add(42);

		 Result.sockMerchant(10, ar);
//		 System.out.println("Output is " + result);
	}
}
