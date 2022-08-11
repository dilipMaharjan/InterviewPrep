package com.dilipmaharjan.interviewprep.kunal.search;

public class LiearSearch {
    public static void main(String[] args) {
        /**
         * Find the index of ith element in the given array
         */
        int[] nums = {1, 2, 3, 4, 5, 6};
        //should return 4
        System.out.println(indexOfIthElement(nums, 5));
        //should return -1
        System.out.println(indexOfIthElement(nums, 15));

    }

    private static int indexOfIthElement(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
