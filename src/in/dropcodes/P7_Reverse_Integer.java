package in.dropcodes;

/**
 * Author : Sagar D B (iamSagarDB)
 * github: https://github.com/iamsagard
 * <p>
 * <p>
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: x = -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: x = 120
 * Output: 21
 * Example 4:
 * <p>
 * Input: x = 0
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 */

public class P7_Reverse_Integer {

    public static void main(String[] args) {

    }

    public int reverse(int x) {
        long rev = 0;

        if (x == 0) {
            return 0;
        }

        while (x != 0) {
            int mod = x % 10;
            rev = rev * 10 + mod;
            x = x / 10;
        }

        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) rev;
        }
    }
}
