package in.dropcodes;

/**
 * Author : Sagar D B (iamSagarDB)
 * github: https://github.com/iamsagardb
 * <p>
 * <p>
 * <p>
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * You may assume all the characters consist of printable ascii characters.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 * <p>
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */

public class P344_Reverse_String {

    public void reverseString(char[] s) {
        int count = 0;
        char temp;

        for (int i = s.length - 1; i >= s.length / 2; i--) {
            temp = s[i];
            s[i] = s[count];
            s[count] = temp;
            count++;
        }
    }
}
