/**
 * Created by 6 on 2018/3/5.
 */
public class leetcode_665_Nondecreasing_Array {
    public static boolean checkPossibility(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]) {
                sum++;
                System.out.println(sum);
                if(i < nums.length - 2 && nums[i] > nums[i+2])
                    nums[i] = nums[i+1];
                else
                    nums[i+1] = nums[i];
            }
        }
            if(sum > 1)
                return false;
             return true;
    }

    public static void main(String args[]){
        int[] nums = {3,4,2,3};
        System.out.println(checkPossibility(nums));
    }

}
