package ArraysAndLogic.com;

public class Largest2dcolsumrowsum {
	public static void main(String args[]) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		largestRowSum(arr);
		largestColSum(arr);
	}

	public static void largestRowSum(int arr[][]) {

		int largestRowSum = Integer.MIN_VALUE;
		int rowIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				rowSum = rowSum + arr[i][j];
			}

			if (rowSum > largestRowSum) {
				largestRowSum = rowSum;
				rowIndex = i;
			}
		}

		System.out.println("Largest Row is in " + rowIndex + "th Row and which is" + " " + largestRowSum);
	}
	
	public static void largestColSum(int arr[][]) {
		
		int largestColSum = Integer.MIN_VALUE;
		int colIndex = -1;
		for( int j=0; j<arr[0].length; j++)
		{
			int colSum  = 0;
			
			for(int i=0; i<arr.length; i++)
			{
				colSum = colSum +  arr[i][j];
			}
			
			if(colSum > largestColSum)
			{
				largestColSum = colSum;
				colIndex = j;
			}
		}
		System.out.println("Largest Colmun is in " + colIndex + "th colmun and which is" + " " + largestColSum);
	}

}
