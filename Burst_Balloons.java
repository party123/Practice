/**
 * Created by 6 on 2017/5/15.
 */
public class Burst_Balloons {
    public int maxCoins(int[] nums) {
        int[] num = new int[nums.length+2];
        int index = 1;
        for(int i=0;i<nums.length;i++){
                num[index++] = nums[i];
        }
        num[0] = 1;
        num[num.length-1] = 1;
        int[][] dp = new int[nums.length][nums.length];
        for(int l = 0;l<nums.length;l++){
            for(int r = l;r<nums.length;r++){
                for(int k = l+1;k<r;k++){
                    dp[l][r] = Math.max(dp[l][r],dp[l][k]+dp[k][r]+num[l]*num[k]*num[r]);
                }
            }
        }
        return dp[0][num.length-1];
    }
}
