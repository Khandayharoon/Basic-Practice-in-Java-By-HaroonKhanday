package ArraysAndLogic.com;

public class NumberofGoodPairs {

	public static void main(String[] args) {

//		int[] nums = { 1, 2, 3, 1, 1, 3 };
		int[] nums = { 1, 1, 1, 1};
		numIdenticalPairs(nums);
	}

	public static int numIdenticalPairs(int[] nums) {
		int identicalParis= 0;
		int n = nums.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++)
			{
				if(nums[i]==nums[j]) {
					identicalParis++;
					System.out.println("("+" "+nums[i]+","+" "+nums[j]+")");
				}
			}
		}
			
		
		return identicalParis;
		
		

	}
}
