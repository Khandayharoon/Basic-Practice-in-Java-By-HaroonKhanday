package ArraysAndLogic.com;

public class TripletSum {
	public static void main(String args[]) {
		
		int[] arr = {1,2,3,4,5,6,7};
		int num = 9;
		tripletSum(arr,num);
		
	}
	
	public static void tripletSum(int [] arr ,int x) {
		
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++)
				{
					if(arr[i]+arr[j]+arr[k]==x)
					{
						count++;
					}
				}
			}
		}
		System.out.println("Total triplet sum pairs are"+" "+count);
	}
}
