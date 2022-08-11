package com.dilipmaharjan.interviewprep.kunal.array;

import java.util.Arrays;

public class SimpleArray {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        printArray(buildArray(nums));
        System.out.println();
        int[] nums1 = {1, 2, 1};
        printArray(getConcatenation(nums1));
        System.out.println();
        int[][] nums2 = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(nums2));
        int[] nums3 = {2, 5, 1, 3, 4, 7};
        printArray(shuffleArray(nums3, 3));
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(System.out::print);
    }

    //Build Array from Permutation
    private static int[] buildArray(int[] nums) {
        int[] newNum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNum[i] = nums[nums[i]];
        }
        return newNum;
    }

    //Concatenation of Array
    private static int[] getConcatenation(int[] nums) {
        int len = nums.length * 2;
        int[] newNum = new int[len];
        int counter = 0;
        while (len > counter) {
            for (int i = 0; i < nums.length; i++) {
                newNum[counter] = nums[i];
                counter++;
            }
        }
        return newNum;
    }

    //Running Sum of 1d Array
    private static int[] runningSum(int[] nums) {
        int[] newNum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            newNum[i] = sum;
        }
        return newNum;
    }

    //Richest Customer Wealth
    private static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (maxWealth < sum) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

    //shuffle array
    private static int[] shuffleArray(int[] array, int n) {
        int left = 0;
        int i = 0;
        int right = n;
        int[] newNum = new int[array.length];
        while (left < n) {
            newNum[i] = array[left];
            i++;
            left++;
            newNum[i] = array[right];
            i++;
            right++;
        }
        return newNum;
    }
}
