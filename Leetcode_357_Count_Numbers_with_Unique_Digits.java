/**
 * Created by 6 on 2018/3/7.
 */
public class Leetcode_357_Count_Numbers_with_Unique_Digits {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0)  return 1;
        if(n == 1) return 10;
        int ans = 10;
        int val = 9;
        for(int i = 2; i <= n;i++){
            val *= (9-i+2);
            ans += val;
        }
        return ans;
    }
}
