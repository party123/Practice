import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/**
 * Created by 6 on 2017/3/31.
 */
public class  Find448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List result = new ArrayList();
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            temp.put(nums[i], 1);
        }
        for (int j = 1; j <= nums.length; j++) {
            if (temp.containsKey(j) == false) {
                result.add(j);
            }
        }
        return result;
    }
}
