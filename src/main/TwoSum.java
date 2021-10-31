package main;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 25;

        int[] result = getTwoSumIndices(nums, target);
        System.out.println("Indices of two sum");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] getTwoSumIndices(int[] nums, int target) {
        Map<Integer, Integer> data = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (data.containsKey(complement)) {
                return new int[] {data.get(complement), i};
            }
            data.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
