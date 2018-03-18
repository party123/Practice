import java.net.Inet4Address;
import java.util.*;

/**
 * Created by 6 on 2017/10/23.
 */
public class Leetcode_169_Majority_Element {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(h.get(nums[i])!=null){
                h.put(nums[i],h.get(nums[i])+1);
            }
            else if(h.get(nums[i])==null){
                h.put(nums[i],1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j =0;j<n;j++){
            if(h.get(nums[j])>n/2)
                return nums[j];
        }
        /*
        Iterator iter = h.entrySet().iterator();
        while(iter.hasNext()){
           Map.Entry<Integer,Integer> t = (Map.Entry<Integer, Integer>) iter.next();
            if(t.getValue()>n/3)
                ans.add(t.getKey());
        }
        */
        return 0;
    }
}
