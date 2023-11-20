package ArraysAndLogic.com;

public class PairSum {
	public static void main(String args[]) {
		int[] arr = { 1, 3, 5, 2, 6, 4, 3, 2, 4 };
		int x = 7;
		pairSum(arr, x);

	}

	public static void pairSum(int arr[], int a) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] + arr[j] == a) {
					count++;
				}
			}
		}
		System.out.println("Total pairs are "+" "+ count);
	}
}
