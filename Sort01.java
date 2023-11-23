package ArraysAndLogic.com;

public class Sort01 {
	public static void main(String args[]) {
		int []arr= {1,0,1,1,0,1,0,1};
		
		int placezerohere = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				int temp = arr[i];
				arr[i]=arr[placezerohere];
				arr[placezerohere]=temp;
				placezerohere++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
