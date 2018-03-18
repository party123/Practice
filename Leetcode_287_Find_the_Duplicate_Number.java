import java.util.HashMap;
import java.util.Map;

/**
 * Created by 6 on 2018/2/28.
 */
public class Leetcode_287_Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        /*哈希表法
        Map<Integer,Integer> ans =new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!ans.containsKey(nums[i]))
                ans.put(nums[i],0);
            else
                return nums[i];
        }
        return 0;
        */

        //更换位置法
        for(int i = 0;i < nums.length; i++){
            while(nums[i] != i){
                if(nums[i] == nums[nums[i]])
                    return nums[i];
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return 0;
    }
}
