package com.dilipmaharjan.interviewprep.neetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        //Should return true
        System.out.println(isValidAnagramApproach1("anagram", "margana"));
        //Should return false
        System.out.println(isValidAnagramApproach1("anagram", "margana"));
    }

    //Assumptions: both the string are not empty and are of equal length/*/
    private static boolean isValidAnagramApproach1(String str, String str1) {

        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }
        Map<Character, Integer> map2 = new HashMap();
        for (int i = 0; i < str1.length(); i++) {
            Character c = str1.charAt(i);
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }
        for (Character c : map1.keySet()) {
            if (map2.get(c) != map1.get(c)) {
                return false;
            }
        }
        return true;
    }
}
