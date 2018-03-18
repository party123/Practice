import java.util.ArrayList;
import java.util.List;

/**
 * Created by 6 on 2018/3/1.
 */
public class leetcode_717_1bit_and_2bit_Characters {
    public boolean isOneBitCharacter(int[] bits) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < bits.length; i++){
            if(bits[i] == 0)
                ans.add(0);
            if(bits[i] == 1 && i!=bits.length-1) {
                i++;
                ans.add(1);
            }
        }
        int temp = ans.get(ans.size()-1);
        if(temp == 0) return true;
        return false;
    }

}
