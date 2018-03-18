/**
 * Created by 6 on 2017/11/1.
 */
public class Leetcode_343_Integer_Break {
    public int integerBreak(int n) {
        int sum  = 0;
        if(n == 2) return 1;
        if(n == 3) return 2;
        while(n>4){
            sum *= 3;
            n -= 3;
        }
        sum *= n;
        return sum;
    }
}
