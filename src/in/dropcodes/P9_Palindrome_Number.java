package in.dropcodes;
/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 9. Palindrome Number

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true

Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Follow up:

Coud you solve it without converting the integer to a string?

 */

import java.util.*;

public class P9_Palindrome_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        boolean res = isPalindrome(x);
        System.out.println(res);
    }

    // LeetCode Function
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String rev = "";
        String str = Integer.toString(x); // convert integer to str apply logic
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equals(rev)) {
            return true;
        }
        return false;
    }
}
