package ArraysAndLogic.com;

public class merge2sortedArray {

	public static void main(String[] args) {
		int arr1[] = { 0, 1, 2, 3, 4 };
		int arr2[] = { 5, 6, 7, 8, 9 };
		mergeSortedArries(arr1, arr2);
	}

	public static void mergeSortedArries(int arr1[], int arr2[]) {
		int n = arr1.length;
		int m = arr2.length;

		int arr[] = new int[n + m];
		int i = 0;
		int k = 0;
		int j = 0;

		while (i < n && i < m) {
			if (arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				i++;
				k++;
			} else {
				arr[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < m) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
		for (int i1 = 0; i1 < m + n; i1++) {
			System.out.print(arr[i1] + ", ");
		}
	}

}
