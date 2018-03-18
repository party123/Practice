import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by 6 on 2017/11/3.
 */
public class Leetcode_561_Array_Partition_1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = nums.length-2; i >=0 ; i-=2){
        sum+=nums[i];
        }
        return sum;
    }
}
