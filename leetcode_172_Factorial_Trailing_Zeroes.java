/**
 * Created by 6 on 2018/2/27.
 */
public class leetcode_172_Factorial_Trailing_Zeroes {
    public static int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
    public static void main(String args[]){
        System.out.println(trailingZeroes(10));
    }
}
