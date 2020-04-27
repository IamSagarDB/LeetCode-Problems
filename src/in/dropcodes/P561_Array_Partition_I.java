package in.dropcodes;

import java.util.Arrays;
import java.util.Scanner;

/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 561. Array Partition I

Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
Note:
n is a positive integer, which is in the range of [1, 10000].
All the integers in the array will be in the range of [-10000, 10000].
 */

public class P561_Array_Partition_I {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int res = arrayPairSum(arr);
        System.out.println(res);
    }

    // LeetCode Function
    private static int arrayPairSum(int[] arr) {
        Arrays.sort(arr);
        int x = 0;
        for (int i = 0; i < arr.length; i += 2) {
            x += Math.min(arr[i], arr[i + 1]);
        }
        return x;
    }

}
