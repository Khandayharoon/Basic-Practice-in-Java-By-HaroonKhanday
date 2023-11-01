package com.test.done;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
	public static void main(String[] args) {
		List listA = new ArrayList<Integer>();
		List listB = new ArrayList<Integer>();

		listA.add(17);
		listA.add(28);
		listA.add(30);

		listB.add(99);
		listB.add(16);
		listB.add(8);

		compareTriplets(listA, listB);

	}

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		int alice = 0;
		int bob = 0;
		for (int i=0;i<a.size();i++)
		{
			if(a.get(i)>b.get(i))
			{
				alice++;
			}
			else if (a.get(i)<b.get(i))
			{
				bob++;
			}
		}
		List listResult = new ArrayList<Integer>();
		listResult.add(alice);
		listResult.add(bob);
		System.out.println(alice +" ;"+ bob);		
		return listResult;
	}
}
