/**
 * Created by 6 on 2018/3/2.
 */
public class Leetcode_485_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 1)
                sum++;
            else if(nums[i] == 0){
                if(sum > max)
                    max = sum;
                sum = 0;
            }
        }
        if(sum > max)
            max = sum;
        return max;
    }

    public static void main(String args[]){
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
