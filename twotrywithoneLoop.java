package ArraysAndLogic.com;

public class twotrywithoneLoop {

	public static void main(String[] args) {
		int t =8;
		int arr[]= {4,3,5,7,2,7,1,8,0};
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]+arr[i+1]==8)
			{
				System.out.print(i + "," + (i + 1) + " & ");
			}
		}
	}

}
