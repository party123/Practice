/**
 * Created by 6 on 2017/11/2.
 */
public class Leetcode_303_Range_Sum_Query {
    int nums[];
    public Leetcode_303_Range_Sum_Query(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        if(i == 0)
            return nums[j];
        else
            return nums[j]-nums[i];
    }
}
