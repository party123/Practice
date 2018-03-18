/**
 * Created by 6 on 2017/8/22.
 */
public class Maximum_Subarray_53 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len];
        int max = Integer.MIN_VALUE;
        for(int j = 0; j < len; j++)
            ans[j] = nums[j];
        for(int i = 1; i < len; i++){
            if(ans[i-1] <= 0){
                ans[i] = nums[i];
            }
            else{
                ans[i] = ans[i-1] + nums[i];
            }

        }

        for(int k = 0; k < len; k++){
            if(ans[k] > max)
                max = ans[k];
        }
        return max;
    }
}
