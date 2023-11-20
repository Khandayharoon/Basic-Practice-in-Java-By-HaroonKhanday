package ArraysAndLogic.com;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

	public static void main(String[] args) {
		
		int [] arr = {45,67,34,78,1,2,0,3,4,6,7,888,99,3};
		linearSearchArray(arr);
		
		List<Integer> array = new ArrayList<>();
		array.add(6);
		array.add(9);
		array.add(4);
		array.add(0);
		array.add(2);
		array.add(13);
		linearSearchlist(array);

	}
	
	public static void linearSearchArray(int [] arr) {
		int x = 78;
		for(int i=0;i<arr.length;i++)
		{
			if(x==arr[i])
				System.out.println("The number is present in Array at index"+" "+i);
		}
		
	}
	
	public static void linearSearchlist(List<Integer> array) {
		int x=0;
		for(int i=0; i<array.size();i++) {
			
			if(x==array.get(i))
			{
				System.out.println("The number is present in List at index"+" "+i);
			}
		}
		
	}
	
}
