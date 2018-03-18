import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by 6 on 2017/11/8.
 */
public class Leetcode_39_Combination {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<>();
        ishave(ans,tempList,candidates,target,0);
        return ans;
    }

    public void ishave(List<List<Integer>> ans, List<Integer> tempList,int[] candidates, int remain, int start){

        if(remain < 0)
            return;
        else if(remain == 0){
            ans.add(new ArrayList<Integer>(tempList));

        }
        else{
            for(int i = start; i < candidates.length; i++){
                tempList.add(candidates[i]);
                ishave(ans,tempList,candidates,remain-candidates[i],i);
                tempList.remove(tempList.size()-1);
            }
        }



    }
}
