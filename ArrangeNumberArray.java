package ArraysAndLogic.com;


public class ArrangeNumberArray {

	public static void main(String args[])
	{
		int[] array = new int[10];
		array(array);
		printArray(array);
		
	}
	
	public static void array(int [] array)
	{
		int y=0;
		int x=array.length-1;
		for(int i=1;i<=array.length;i++) {
			if(i%2==0)
			{
				array[x]=i;
				x--;
			}
			else {
				array[y]=i;
				y++;
			}
		}
	}
	
	public static void printArray(int [] array)
	{
		for(int i=0; i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
