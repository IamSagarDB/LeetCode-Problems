package in.dropcodes;
/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 242. Valid Anagram

Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?

 */

import java.util.Arrays;
import java.util.HashMap;

public class P242_Valid_Anagram {

    /*

    Method 1 : this approach is by using HashMap

    */

    // LeetCode Function
    public boolean isAnagram(String s, String t) {

        // First check if the given 2 string are equal
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        // insert string s values into HashMap
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1); // at initial set map value to zero so it will be easy to count number of key value present
        }

        // start removing each char from HashMap and check if HashMap is Empty
        for (char y : t.toCharArray()) {
            if (map.containsKey(y)) {
                int count = map.get(y);
                if (count == 1) {
                    map.remove(y);
                } else {
                    map.put(y, count - 1);
                }
            }
        }
        return map.isEmpty();
    }


    /*
    Method 2: By sorting array and comparing 2 array
     */

    public boolean iSAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
