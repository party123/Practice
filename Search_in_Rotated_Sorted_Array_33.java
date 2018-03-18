/**
 * Created by 6 on 2017/9/6.
 */
public class Search_in_Rotated_Sorted_Array_33 {
    public int search(int[] nums, int target) {
        int ans = -1;
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        while(low<high){
            int mid = (low+high)/2+1;
            if(nums[mid] == target) return mid;
            if(nums[low]<nums[mid]){
                if(nums[low]<target&&nums[mid]>target)
                    high = mid - 1;
                else low = mid +1;

            }
            if(nums[high]>nums[mid]){
                if(nums[high]>target&&nums[mid]<target)
                    low = mid + 1;
                else high = mid -1;

            }
        }
        if(nums[0]==target) return 0;
        return ans;
    }
}
