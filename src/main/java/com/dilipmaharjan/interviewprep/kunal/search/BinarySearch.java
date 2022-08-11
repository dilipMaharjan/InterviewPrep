package com.dilipmaharjan.interviewprep.kunal.search;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 7, 8, 9, 10};
        int target = 5;
        int index = indexOfIthElement(nums, target);
        System.out.printf("Index :%d => Value: %d => target: %d", index, nums[index], target);
    }
    //Assumptions: Array is sorted in ascending order, array is not empty

    private static int indexOfIthElement(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
