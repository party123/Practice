/**
 * Created by 6 on 2018/3/9.
 */
public class Leetcode_204_Count_Primes {
    public int countPrimes(int n) {
        int sum = 0;
        boolean[] temp = new boolean[n];
        for(int i = 2; i < n;i++){
            if(temp[i] == false)
                sum++;
            for(int j = 2; i*j <n;j++){
                temp[i*j] = true;
            }
        }
        return sum;
    }

}
