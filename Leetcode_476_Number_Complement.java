/**
 * Created by 6 on 2018/3/1.
 */
public class Leetcode_476_Number_Complement {
    public int findComplement(int num) {
        int ans = num;
        int sum = 0;
        while(num!=0){
            num/=2;
            sum++;
        }
        int k = new Double((Math.pow(2,sum)-1)).intValue();
        return ans^k;
    }

    public static void main(String args[]){
        System.out.println(7^5);
        double s = 1.0;
        int a = new Double(s).intValue();
    }
}
