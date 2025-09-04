package org.example;

import java.util.HashMap;
import java.util.Map;

public class AddTwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int lastIndexValue = target - nums[i];
            if (map.containsKey(lastIndexValue)) {
                return new int[] { map.get(lastIndexValue), i };
            }
            map.put(nums[i], i);

        }
        throw new IllegalArgumentException("No two sum solution");

    }
    public static void main(String[] args) {
        AddTwoSum obj = new AddTwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = obj.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}