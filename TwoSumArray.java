package ArraysAndLogic.com;

public class TwoSumArray {

	public static void main(String[] args) {
		 int nums[] = {1, 3, 5, 7, 9, 0, -2, 4};
	        int target = 9;
	        
	        int resutl []= sumOfTwoIntEqualToTarget(nums, target);
	        		
	        		for(int i=0; i<resutl.length; i++)
	        		{
	        			System.out.print(resutl[i]+" ");
	        		}

	}

	public static int[] sumOfTwoIntEqualToTarget(int[] arr, int target) {
		 
		int indices[] = new int[arr.length];
		for(int i=0; i<=arr.length; i++) {
			for(int j=0+i;j<arr.length; j++)
			{
		if(arr[i]+arr[j]==target)
		{
			indices[i] = i;
			indices[i+1]= j;
		}
		
			}

	   }

		return indices;
}
}

