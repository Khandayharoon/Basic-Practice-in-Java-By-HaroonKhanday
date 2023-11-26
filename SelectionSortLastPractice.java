package ArraysAndLogic.com;

public class SelectionSortLastPractice {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 9, 1, 0, 2, 7, 3, 6, 8 };
		selectionSort(arr);
		printSortedArray(arr);

	}

	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}

			}

			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void printSortedArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
