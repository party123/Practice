import java.util.*;

/**
 * Created by 6 on 2017/9/5.
 */
public class Sum_15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] test = new int[n];
        for(int i = 0 ; i < n ; i++)
            test[i] = sc.nextInt();
        List<List<Integer>> ans = threeSum(test);

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int l = i+1;
            int r = nums.length - 1;
            while(l<r){
                    if(l == i) l++;
                    if(r == i) r--;
                    if(nums[l]+nums[r]==(-1)*nums[i]){
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);
                        if(!ans.contains(temp))
                            ans.add(temp);
                        while (l < r && nums[l] == nums[l+1]) l++;
                        while (l < r && nums[r] == nums[r-1]) r--;
                        l++;
                        r--;
                    }
                    if(nums[l]+nums[r]<(-1)*nums[i]){
                        l++;
                    }
                    else r--;

            }
        }
        return ans;
    }

}
