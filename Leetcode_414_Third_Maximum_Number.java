import java.util.Arrays;

/**
 * Created by 6 on 2017/11/9.
 */
public class Leetcode_414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 3)
            return nums[nums.length-1];
        int temp = 1;
        int i;
        for(i = nums.length-1; i >0; i--){
            if(nums[i]!=nums[i-1])
                temp++;
            if(temp == 3)
               return nums[i-1];
        }
        return nums[nums.length-1];
    }

    public static void main(String args[]){
        int nums[] = {3,2,1};
        System.out.print(thirdMax(nums));
    }
}
