package ArraysAndLogic.com;

public class RowWiseSumin2Darray {
	public static void main(String args[]) {

		int[][] arr = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		rowWiseSum(arr);
	}

	public static void rowWiseSum(int[][] arr) {

		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[0].length;j++)
			{
				sum +=arr[i][j];
			}
			System.out.println("the Row sum of"+" "+i+"th row"+" "+sum);
		}
		
	}
}
