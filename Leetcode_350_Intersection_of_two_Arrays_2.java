import java.net.Inet4Address;
import java.util.*;

/**
 * Created by 6 on 2017/11/1.
 */
public class Leetcode_350_Intersection_of_two_Arrays_2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
       List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> ans = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            if(ans.containsKey(nums1[i]))
                ans.put(nums1[i],ans.get(nums1[i])+1);
            else
                ans.put(nums1[i],1);
        }
        int sum = 0;
        for(int j = 0; j < nums2.length; j++){
            if(ans.containsKey(nums2[j]) && (ans.get(nums2[j])>0) ){
                result.add(nums2[j]);
                ans.put(nums2[j],ans.get(nums2[j])-1);

            }
        }
        int[] res = new int[result.size()];
        for(int k = 0; k < result.size(); k++){

                res[k] = result.get(k);
            }

        return res;
    }

    public static void main(String args[]){
        int a1[] = {1};
        int a2[] = {1,1};
        int a3[] = intersect(a1,a2);
        for(int j = 0; j < a3.length; j++)
        System.out.println(a3[j]);
    }

}
