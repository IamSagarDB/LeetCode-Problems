package in.dropcodes;


/**
 * Author : Sagar D B (iamSagarDB)
 * github: https://github.com/iamsagardb
 * <p>
 * Problem 1672:
 *
 * Example:
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 * Explanation:
 * 1st customer has wealth = 1 + 2 + 3 = 6
 * 2nd customer has wealth = 3 + 2 + 1 = 6
 * Both customers are considered the richest with a wealth of 6 each, so return 6.
 *
 *
 */


public class P1672_Richest_Customer_Wealth {

    public int maximumWealth(int[][] accounts) {
        int prev_richest_val = 0;
        int cur_val = 0;

        for(int[] x : accounts){

            for(int y : x){
                cur_val+=y;
            }

            if(cur_val > prev_richest_val){
                prev_richest_val = cur_val;
            }

            cur_val = 0;
        }

        return prev_richest_val;
    }
}
