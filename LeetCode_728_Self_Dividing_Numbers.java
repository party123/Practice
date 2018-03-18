import java.util.ArrayList;
import java.util.List;

/**
 * Created by 6 on 2018/2/27.
 */
public class LeetCode_728_Self_Dividing_Numbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(panduan(i))
                ans.add(i);
        }
        return ans;
    }

    public static boolean panduan(int temp){
        int i = 0;
        int k = temp;
        while(temp!=0){
            i = temp % 10;
            if(i==0 || k%i != 0)
                return false;
            temp /= 10;
        }
        return true;
    }
    public static void main(String args[]){
        List<Integer> ans = new ArrayList<>();
        ans = selfDividingNumbers(1,22);
        System.out.println(ans);
    }
}
