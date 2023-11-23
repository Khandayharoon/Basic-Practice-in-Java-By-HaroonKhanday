package ArraysAndLogic.com;

public class ConcatenationofArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 1 };
		int resultArray [] = getConcatenation(arr);
		
		for(int i=0; i<resultArray.length;i++) {
			System.out.print(resultArray[i]+" ");
		}
	}

	public static int[] getConcatenation(int[] nums) {
		int n = nums.length;

		int[] Array2 = new int[n * 2];
		for (int i = 0; i < n; i++) {
			Array2[i] = nums[i];
			Array2[n + i] = nums[i];

		}
		return Array2;

	}
}
