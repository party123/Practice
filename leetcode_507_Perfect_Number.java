/**
 * Created by 6 on 2018/2/27.
 */
public class leetcode_507_Perfect_Number {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        if(num ==1 )return false;
        for(int i = 2; i <= Math.sqrt(num);i++){
            if(num%i == 0)
                sum+=i+num/i;
            if(sum+1>num)
                return false;
        }
        if(sum+1 == num)
            return true;
        return false;
    }
}
