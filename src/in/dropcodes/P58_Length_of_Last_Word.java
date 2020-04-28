package in.dropcodes;

import java.util.*;

/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 58. Length of Last Word

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5

 */
public class P58_Length_of_Last_Word {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int res = lengthOfLastWord(str);
        System.out.println(res);
    }

    // LeetCode Function
    public static int lengthOfLastWord(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        String[] res = s.trim().split("\\s+"); // converting words into string array
        int len = res.length - 1;
        String last = res[len];
        return last.length();
    }
}
