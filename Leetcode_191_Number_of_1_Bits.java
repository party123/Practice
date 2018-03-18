import java.util.Scanner;

/**
 * Created by 6 on 2017/10/24.
 */
public class Leetcode_191_Number_of_1_Bits {
    public static int hammingWeight(int n) {
        int sum = 0;
        for(int i = n/2; i >= 0; i--){
            if(Math.pow(2,i) <= n){
                sum++;
                if(n > 0){
                    n-= Math.pow(2,i);
                }
            }
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(hammingWeight(n));
    }
}
