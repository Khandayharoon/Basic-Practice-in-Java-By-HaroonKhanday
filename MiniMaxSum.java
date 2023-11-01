package com.test.done;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {

	public static void main(String[] args) {
		
		List <Integer> sum = new ArrayList<>();
		sum.add(7);
		sum.add(69);
		sum.add(7);
		sum.add(221);
		sum.add(8974);
//		sum.add(2);
		
		miniMaxSum(sum);
		
		
	}
	public static void miniMaxSum(List<Integer> arr) {
			long minSum =  0;
			long maxSum = 0;
			long min = arr.get(0);
			long max = arr.get(0);
			for (int i=0; i<arr.size(); i++)
			{
				if (min >= arr.get(i))
				{
					min =  arr.get(i);
				}
				if (max <= arr.get(i))
				{
					max = arr.get(i);
				}
			}	
//			System.out.println( "min element " + (min));
//			System.out.println( "max element" + (max));
//			System.out.println("304 ::: 9264");
			
			long sum = 0;
			
			for (int i=0; i<arr.size();i++)
			{
				sum = sum + arr.get(i);
			}
			
			minSum = sum-max;
			maxSum = sum - min;
			System.out.println(minSum + " "+ maxSum);
			
//			System.out.println("total sum is " + (sum));
//			System.out.println("min sum is" + (sum - max));
//			System.out.println("max sum is " + (sum - min));
			
//			for (int i=0; i<arr.size()-1; i++)
//			{ 
//				if (arr.get(i)== max)
//				{
//					continue;
//				}
//				minSum = minSum + arr.get(i);
//			}
//			for (int i=0; i<arr.size(); i++)
//			{ 
//				if (arr.get(i)== min)
//				{
//					continue;
//				}
//				maxSum = maxSum + arr.get(i);
//			}
//			System.out.println(minSum);
//			System.out.println(maxSum);

	    }
}
