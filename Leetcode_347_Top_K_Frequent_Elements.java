import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 6 on 2017/11/5.
 */
public class Leetcode_347_Top_K_Frequent_Elements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] ans = new List[nums.length];
        Map<Integer,Integer> temp = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(temp.containsKey(nums[i]))
                temp.put(nums[i],temp.get(nums[i])+1);
            else
                temp.put(nums[i],1);
        }

        for(int key:temp.keySet()){
            if(ans[temp.get(key)]==null)
                ans[temp.get(key)] = new ArrayList<Integer>();
            ans[temp.get(key)].add(key);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = ans.length-1; i >=0;i--){
            if(ans[i]!=null && res.size()<k){
                res.addAll(ans[i]);
            }
        }
        return res;
    }
}
