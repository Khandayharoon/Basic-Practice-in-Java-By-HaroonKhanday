package ArraysAndLogic.com;

public class FinalValueVariableAfterPerformingOperations {

	public static void main(String[] args) {
		
		String [] operations = {"--X","X++","X++"};
		int result = finalValueAfterOperations(operations);
		System.out.println(result);
	}

	public static int finalValueAfterOperations(String[] operations) {
		
		int x = 0;
		for(int i=0; i<operations.length; i++)
		{
			
			
			if(operations[i].charAt(1) == '+') 
			{
				x++;
			}
       else{

			 x--;
     	   }
			
//			if(operations[i]=="X++")
//			{
//				x=x+1;
//			}
//			else if (operations[i]=="X--") {
//				x=x-1;
//			}
//			else if(operations[i]=="++X") {
//				x=x+1;
//			}
//			else {
//				x=x-1;
//			}
			
//			if(operations[i]=="X++" || operations[i]=="++X")
//			{
//				x=x+1;
//			}
//			else if(operations[i]=="X--" || operations[i]=="--X")
//			{
//				x=x-1;
//			}
		}
		return x;
	}

}
