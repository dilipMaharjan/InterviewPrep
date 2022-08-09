package com.dilipmaharjan.interviewprep.neetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5};
        //should return true
        System.out.println(containsDuplicate(nums));
        int[] num = {1, 2, 3, 4, 6, 5};
        //Should return false
        System.out.println(containsDuplicate(num));
    }

    private static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
