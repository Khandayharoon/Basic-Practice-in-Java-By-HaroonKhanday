package ArraysAndLogic.com;

public class LargestRowandColmunin2Darray {
	public static void main(String args[]) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		largest(arr);

	}

	public static void largest(int mat[][]) {

		int rowLargest = Integer.MIN_VALUE;
		int colLargest = Integer.MIN_VALUE;
		int rIndex = 0, cIndex = 0;
		for (int i = 0; i < mat.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < mat[0].length; j++) {
				rowSum += mat[i][j];
			}
			if (rowSum > rowLargest) {
				if (rowSum != 0) {
					rowLargest = rowSum;
					rIndex = i;
				}
			}
		}
		if (mat.length != 0) {
			for (int j = 0; j < mat[0].length; j++) {
				int colSum = 0;
				for (int i = 0; i < mat.length; i++) {
					colSum += mat[i][j];
				}
				if (colSum > colLargest) {
					if (colSum != 0) {
						colLargest = colSum;
						cIndex = j;
					}
				}
			}
		}
		if (rowLargest >= colLargest)
			System.out.println("row " + rIndex + " " + rowLargest);
		else
			System.out.println("column " + cIndex + " " + colLargest);
		System.out.println("while Largest row is "+ " " +rowLargest);
		System.out.println("while Largest Colmun is "+" "+colLargest);

	}
}
