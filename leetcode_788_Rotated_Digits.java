/**
 * Created by 6 on 2018/3/2.
 */
public class leetcode_788_Rotated_Digits {
    public int rotatedDigits(int N) {
        int sum = 0;
       for(int i = 1; i <= N; i++){
           if(panduan(i))
               sum++;
       }
       return sum;
    }
    public boolean panduan(int n){
        int k = 0;
        boolean ans = false;
        while(n!=0){
           if(n%10 == 2 || n%10 == 5 || n%10 == 6 || n%10 == 9)
               ans =true;
            if(n%10 == 3 || n%10 == 4 || n%10 == 7)
                return false;
            n/=10;
        }
        return ans;
    }
}
