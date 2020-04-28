package in.dropcodes;

/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 26 Remove Duplicates from Sorted Array

Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
 */

import java.util.Scanner;

public class P26_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = s.nextInt();
        }
        int res = removeDuplicates(nums);
        for (int j = 0; j < res; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();
        System.out.println("array size: " + res);
    }

    //LeetCode Function
    public static int removeDuplicates(int[] nums) {
        int x = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[x] != nums[i]) {
                x++;
                nums[x] = nums[i];
            }
        }
        return x + 1;
    }
}
