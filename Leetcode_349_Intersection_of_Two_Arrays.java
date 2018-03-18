import java.util.HashSet;
import java.util.Set;

/**
 * Created by 6 on 2017/11/1.
 */
public class Leetcode_349_Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        for(int i = 0; i < nums1.length; i++)
            res.add(nums1[i]);
        for(int j = 0; j < nums2.length; j++){
            if(res.contains(nums2[j]))
                ans.add(nums2[j]);
        }
        int[] result = new int[ans.size()];
        int k = 0;
        for(Integer nums: ans){
            result[k++] = nums;
        }
        return result;
    }
}
