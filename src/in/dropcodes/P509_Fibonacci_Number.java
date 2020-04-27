package in.dropcodes;

import java.util.Scanner;

/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 509 Fibonacci Number

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).

Example 1:
Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

Example 3:
Input: 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

Note:
0 ≤ N ≤ 30.

 */
public class P509_Fibonacci_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = fib(n);
        System.out.println(res);
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return (fib(n - 1) + fib(n - 2));
    }
}


/*
fib recursion working
 example n = 6 ans should be 8

                                             (n-1) ans (n-2)

                                                    6
                                      /                       \
                                     5                         4
                               /             \               /       \
                              4               3             3         2
                         /        \          / \          /  \        / \
                        3           2       2   +1        2   +1     1 + 0
                    /       \      / \     / \           / \
                   2        +1    1 + 0   1 + 0         1 + 0
                  / \
                 1 + 0

                ans: (1 + 0) + 1 + (1 + 0) + (1 + 0) + 1 + (1 + 0) + 1 + (1 + 0) = 8
 */