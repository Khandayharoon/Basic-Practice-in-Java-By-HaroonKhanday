package ArraysAndLogic.com;

public class SortArray012 {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 0, 0, 1, 1, 2, 0, 2, 1 };
		arraySort012(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void arraySort012(int arr[]) {
		int i = 0;
		int num = arr.length;
		int pz = 0;
		int pt = num - 1;

		while (i <= pt) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[pz];
				arr[pz] = temp;
				pz++;
				i++;
			} else if (arr[i] == 1) {
				i++;
			} else {
				int temp = arr[i];
				arr[i] = arr[pt];
				arr[pt] = temp;
				pt--;
			}
		}
	}
}
