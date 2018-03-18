/**
 * Created by 6 on 2018/1/14.
 */
public class Leetcode_762_Prime_Number_of_Set_Bits_in_Binary_Representation {
    public int countPrimeSetBits(int L, int R) {
        int ans = 0;
        for(int i = L; i <= R; i++){
            if(sum(i)) ans++;
        }
        return ans;
    }

    public boolean sum(int n){
        int num = 0;
        while(n>0){
            if(n%2!=0)
                num++;
            n/=2;
        }
        if(num<2) return false;
        if(num == 2) return true;
        if(num%2==0) return false;
        for(int i = 3; i*i <= num; i+=2)
            if(num%i==0) return false;
        return true;
    }
}
