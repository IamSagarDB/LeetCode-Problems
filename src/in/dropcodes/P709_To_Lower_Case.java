package in.dropcodes;

import java.util.Scanner;
/*
Problem - 709 To Lower Case

Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

Example 1:

Input: "Hello"
Output: "hello"
Example 2:

Input: "here"
Output: "here"
Example 3:

Input: "LOVELY"
Output: "lovely"
 */

public class P709_To_Lower_Case {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        if (str == null) {
            System.out.println(str);
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                sb.append((char) (c + 32));
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
