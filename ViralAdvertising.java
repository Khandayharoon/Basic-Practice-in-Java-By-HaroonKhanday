package ArraysAndLogic.com;

public class ViralAdvertising {

	public static void main(String[] args) {
		
		int result = viralAdvertising(3);
		System.out.println(result);

	}
	
	 public static int viralAdvertising(int n) {
		    int shared = 5;
	        int liked = 0;
	        int cumulativeLikes = 0;

	        for (int day = 1; day <= n; day++) {
	            liked = shared / 2;
	            cumulativeLikes += liked;
	            shared = liked * 3;
	        }

	        return cumulativeLikes;
		    }


}
