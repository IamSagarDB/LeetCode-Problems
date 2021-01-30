package in.dropcodes;

/**
 * Author : Sagar D B (iamSagarDB)
 * github: https://github.com/iamsagardb
 * <p>
 * Problem 1431:
 *
 * Example 1:
 *
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 *
 * */

public class P1470_Shuffle_the_Array {

    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int  jump = 0;
        for(int i = 0 ; i < n ; i ++ ) {
            res[i+jump] = nums[i];
            res[i+jump+1] = nums[n+jump];
            jump++;
        }
        return  res;
    }
}
