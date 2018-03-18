/**
 * Created by 6 on 2017/10/18.
 */
public class Leetcode_27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int j = 0;
        int t = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val)
                nums[t++] = nums[j];
            if(nums[i] == val){
                j++;
            }

        }
        return t+1;
    }
}
