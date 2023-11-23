package ArraysAndLogic.com;

import java.util.ArrayList;
import java.util.List;

public class MarcsCakewalk {

	public static void main(String[] args) {
		List<Integer> calorie = new ArrayList<>();
		calorie.add(7);
		calorie.add(4);
		calorie.add(9);
		calorie.add(6);
//		79
		long result =  marcsCakewalk(calorie);
		System.out.println(result);

	}

	public static long marcsCakewalk(List<Integer> calorie) {
		calorie.sort((a, b) -> b - a);
	    long miles = 0;
        long power = 0;

        for (int cal=0; cal<calorie.size(); cal++) {
            
        	miles = (long) ((miles) + calorie.get(cal) * Math.pow(2, power));
            power++;
        }

        return miles;
	}

}
