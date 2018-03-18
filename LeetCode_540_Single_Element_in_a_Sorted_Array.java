/**
 * Created by 6 on 2018/3/4.
 */
public class LeetCode_540_Single_Element_in_a_Sorted_Array {
    public int singleNonDuplicate(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(i%2 == 0)
                sum+=nums[i];
            else
                sum-=nums[i];
        }
        if(sum >= 0)
            return sum;
        else return -sum;
    }
}
