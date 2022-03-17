package leetCode.learn;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        //input [2, 7, 11, 15], 9
        //output [0, 1]

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int compliment = target - arr[i];
            if (map.containsKey(compliment)) {
                result[0] = map.get(compliment);
                result[1] = i;
                break;
            }
            else {
                map.put(arr[i], i);
            }
        }

        for (int n : result) {
            System.out.println(n);
        }
    }
}
