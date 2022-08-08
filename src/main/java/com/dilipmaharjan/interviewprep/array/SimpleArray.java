package com.dilipmaharjan.interviewprep.array;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.HashSet;

public class SimpleArray {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3}));
        System.out.println(validAnagram("anagram", "marganaa"));
        System.out.println(sumTwo(new int[]{2, 7, 11, 15}, 9));
    }

    //Contains Duplicate value
    private static boolean containsDuplicate(int[] elements) {
        HashSet<Integer> elementContainer = new HashSet<>();
        for (int i = 0; i < elements.length; i++) {
            if (elementContainer.contains(elements[i])) {
                return true;
            } else {
                elementContainer.add(elements[i]);
            }
        }
        return false;
    }

    //validate anagram
    private static boolean validAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            HashMap<Character, Integer> str1Map = new HashMap<>();
            HashMap<Character, Integer> str2Map = new HashMap<>();

            for (int i = 0; i < str1.length(); i++) {
                str1Map.put(str1.charAt(i), str1Map.get(str1.charAt(i) + 1));
                str2Map.put(str2.charAt(i), str2Map.get(str2.charAt(i) + 1));
            }
            for (int i = 0; i < str1.length(); i++) {
                if (str1Map.get(str1.charAt(i)) != str2Map.get(str1.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    //Two Sum
    private static Pair sumTwo(int[] elements, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < elements.length; i++) {
            int diff = target - elements[i];
            if (prevMap.containsKey(diff)) {
                return new Pair(prevMap.get(diff), i);
            } else {
                prevMap.put(elements[i], i);
            }
        }
        return null;
    }

}
