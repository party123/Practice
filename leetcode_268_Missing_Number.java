/**
 * Created by 6 on 2018/2/28.
 */
public class leetcode_268_Missing_Number {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int ans = nums.length*(1+nums.length)/2;
        for(int i = 0;i < nums.length;i++)
            sum += nums[i];
        return ans - sum;
    }
}
