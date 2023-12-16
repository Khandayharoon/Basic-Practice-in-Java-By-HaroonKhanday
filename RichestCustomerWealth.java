package ArraysAndLogic.com;

public class RichestCustomerWealth {

	public static void main(String[] args) {

		int accounts[][] = {{1,5},{7,3},{3,5}};
		int result = maximumWealth(accounts);
		System.out.println(result);

	}

	public static int maximumWealth(int[][] accounts) {
		
		int maxRow = Integer.MIN_VALUE;
		
		for(int i=0; i<accounts.length;i++)
		{
			int rowsum = 0;
			for(int j=0; j<accounts[0].length; j++)
			{
				rowsum = rowsum + accounts[i][j];
				if(rowsum > maxRow)
				{
					maxRow = rowsum;
				}
			}
		}
		return maxRow;
	}
}
