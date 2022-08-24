package com.dilipmaharjan.interviewprep.kunal.search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 7, 8, 9, 10};
        int target = 5;
        int index = indexOfIthElement(nums, target);
        System.out.printf("Index :%d => Value: %d => target: %d", index, nums[index], target);
        System.out.println();
        int[] nums1 = {2, 3, 5, 9, 14, 18};
        System.out.println(ceiling(nums1, 19));
        char[] letters = {'c', 'd', 'e'};
        System.out.println(smallestLeter(letters, 'c'));
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(System.out::print);
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

    //ceiling of a number(greater or equal to target)

    private static int ceiling(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return target;
            } else {
                if (array[i] < target) {
                    continue;
                }
                return array[i];
            }
        }
        return array[0];
    }

    //Smallest letter
    private static char smallestLeter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
