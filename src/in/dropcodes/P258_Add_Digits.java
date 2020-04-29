package in.dropcodes;


/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 258. Add Digits

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
             Since 2 has only one digit, return it.
Follow up:
Could you do it without any loop/recursion in O(1) runtime?
 */
public class P258_Add_Digits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    // LeetCode Function
    public static int addDigits(int num) {
        while (num > 9) {
            num = sum(num);
        }
        return num;
    }

    public static int sum(int num) {
        String str = Integer.toString(num);
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            x = x + Character.getNumericValue(str.charAt(i));
        }
        return x;
    }
}
