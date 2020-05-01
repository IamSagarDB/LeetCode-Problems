package in.dropcodes;

/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 20. Valid Parentheses

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true

Example 3:
Input: "(]"
Output: false

Example 4:
Input: "([)]"
Output: false

Example 5:
Input: "{[]}"
Output: true
 */

import java.util.Stack;

public class P20_Valid_Parentheses {

    public boolean isValid(String s) {
        if(s.length() % 2 != 0 ){ // this condition is to check is length os the string is even or not
            return false;
        }
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()){
            if(c == '{' ||c=='[' || c == '('){
                stack.push(c);
            }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
