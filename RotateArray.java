package ArraysAndLogic.com;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 0, 1, 3, 2, 4 };
		int num = 4;
		int result[] = rotateArray(arr, num);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ", ");
		}
	}

	public static int[] rotateArray(int arr[], int num) {
		int[] temp = new int[num];

		for (int i = 0; i < num; i++) {
			temp[i] = arr[i];
		}

		for (int i = num; i < arr.length; i++) {
			arr[i - num] = arr[i];
		}
		for (int i = 0; i < num; i++) {
			arr[arr.length - num + i] = temp[i];
		}
		return arr;
	}
}
