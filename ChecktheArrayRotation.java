package ArraysAndLogic.com;


public class ChecktheArrayRotation {

	public static void main(String[] args) {
		int count=0;
		int arr[] = { 5, 6, 1, 2, 3, 4 };
		for (int i = 0; i < arr.length-1 ; i++) {
			if (arr[i] > arr[i + 1]) {
				count = i+1;
			}
		}
		System.out.println(count);
	}

}
