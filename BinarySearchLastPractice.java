package ArraysAndLogic.com;

public class BinarySearchLastPractice {

	public static void main(String[] args) {

		int arr[] = { 23, 45, 67, 78, 90, 123, 456, 678 };
		int num = 676;
		int result = binarySearch(arr, num);
		System.out.println(result);

	}

	public static int binarySearch(int arr[], int x) {
		int start = 0;
		int end = arr.length;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] < x) {
				start = mid + 1;
			} else if (arr[mid] > x) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;

	}

}
