package in.dropcodes;

/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 977 Squares of a Sorted Array

Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Note:
1) 1 <= A.length <= 10000
2) -10000 <= A[i] <= 10000
3) A is sorted in non-decreasing order.

 */

import java.util.Arrays;
import java.util.Scanner;

public class P977_Squares_of_a_Sorted_Array {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int size = s.nextInt(); // Array Size
        int[] arr = new int[size]; // Array to be squared
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt(); // getting array values
        }

        int[] res_arr = sortedSquares(arr);
        for (int ans : res_arr) {
            System.out.print(ans + " ");
        }
    }

    // LeetCode Function
    public static int[] sortedSquares(int[] A) {
        int res[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = A[i] * A[i];
        }
        Arrays.sort(res);
        return res;
    }
}
