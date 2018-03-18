import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 6 on 2018/3/13.
 */
public class offer_30 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(input);
        for(int i = 0; i < k; k++){
            ans.add(input[i]);
        }
        return ans;
    }
}
