package ArraysAndLogic.com;

public class ElectronicsShop {
	public static void main(String args[]) {
		int [] keyboards= {3,1};
		int [] drives = {5,2,8};
		int b=10;
		int maxSpent = getMoneySpent(keyboards,drives,b);
		System.out.println(maxSpent);
		
	}
	
	  public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		  
		  
		  int maxSpending=-1;
		  for(int i=0; i<keyboards.length; i++)
		  {
			  for(int j=0; j<drives.length; j++) {
				  
				  int totalSpending = keyboards[i]+drives[j];
				  
				  if(totalSpending <= b && totalSpending >= maxSpending) {
					  maxSpending = totalSpending;
				  }
			  }
		  }
		return maxSpending;
	       
	    }
}
