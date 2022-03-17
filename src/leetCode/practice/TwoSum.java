package leetCode.practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = new int[2];
        Map<Integer, Integer> storeData = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int compliment = target - arr[i];
            if (storeData.containsKey(compliment)) {
                result[0] = storeData.get(compliment);
                result[1] = i;
                break;
            }
            else {
                storeData.put(arr[i], i);
            }
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}
