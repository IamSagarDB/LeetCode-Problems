package in.dropcodes;

import java.util.Scanner;
/*
Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 1 Tow Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]
 */

public class P1_Two_Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i< size;i++){
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();

        int[] res = twoSum(arr,target);
        for (int x : res) {
            System.out.print(x+" ");
        }
    }

    // LeetCode Function
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length;i++){
            for(int j = i+1 ; j<nums.length;j++){
                if(nums[j] == target - nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
