import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 6 on 2017/11/8.
 */
public class Leetcode_40_Combination_Sum_2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        ishave(candidates,ans,temp,target,0);
        return ans;
    }

    public void ishave(int[] candidates, List<List<Integer>> ans, List<Integer> temp,int remain, int start){
        if(remain < 0)
            return;
        else if(remain == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        else{
            for(int i = start; i < candidates.length; i++){
                if(i>start && candidates[i]==candidates[i-1]) continue;
                temp.add(candidates[i]);
                ishave(candidates,ans,temp,remain-candidates[i],i);
                temp.remove(temp.size()-1);
            }
        }
    }
}
