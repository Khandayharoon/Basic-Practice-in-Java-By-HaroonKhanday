package ArraysAndLogic.com;

import java.util.ArrayList;
import java.util.List;

public class TwoSumList {

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 7, 9, 0, -2, 4};
        int target = 9;
        List<int[]> result = twoSum(nums, target);

        for (int k = 0; k < result.size(); k++) {
            int[] pair = result.get(k);
            for (int l = 0; l < pair.length; l++) {
                System.out.print(pair[l] + ", ");
            }
            System.out.println();
        }
    }

    public static List<int[]> twoSum(int[] nums, int target) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result.add(new int[]{i, j});
                }
            }
        }

        return result;
    }
}
