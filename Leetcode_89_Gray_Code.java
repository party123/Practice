import java.util.ArrayList;
import java.util.List;

/**
 * Created by 6 on 2018/3/1.
 */
public class Leetcode_89_Gray_Code {
    public static List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < 1<<n; i++){
            int temp = i^i>>1;
            System.out.println((i>>1)+" "+temp);
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String args[]){
        int n = 2;
        System.out.println(grayCode(n));
    }
}
