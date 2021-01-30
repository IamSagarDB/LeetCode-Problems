package in.dropcodes;

import java.util.ArrayList;
import java.util.List;


/**
 * Author : Sagar D B (iamSagarDB)
 * github: https://github.com/iamsagardb
 * <p>
 * Problem 1431: Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
 * <p>
 * For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true]
 * Explanation:
 * Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids.
 * Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
 * Kid 3 has 5 candies and this is already the greatest number of candies among the kids.
 * Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies.
 * Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
 */


public class P1431_Kids_With_the_Greatest_Number_of_Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int greatest_val = candies[0];
        List<Boolean> res = new ArrayList();

        for (int x : candies) {
            if (x > greatest_val) {
                greatest_val = x;
            }
        }

        for (int y : candies) {
            if ((y + extraCandies) >= greatest_val) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
