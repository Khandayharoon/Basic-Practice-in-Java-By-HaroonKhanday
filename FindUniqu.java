package ArraysAndLogic.com;

public class FindUniqu {

	public static void main(String args[]) {
		int[] arr = { 2, 3, 1, 6, 3, 6, 2 };
		findUinqe(arr);
	}
		public static void findUinqe(int arr [])
		{
			int size = arr.length;
			int c;
			for(int i=0; i<size; i++) {
				c=0;
				for(int j=0; j<size;j++) {
					if(arr[i]==arr[j]) {
						c++;
					}
				}
				if(c==1)
				{
					System.out.println(arr[i]);
					return;
				}
			}
			
			System.out.println("No uniqe Element");
		}
}
