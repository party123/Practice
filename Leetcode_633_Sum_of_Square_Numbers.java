/**
 * Created by 6 on 2018/3/7.
 */
public class Leetcode_633_Sum_of_Square_Numbers {
    public static boolean judgeSquareSum(int c) {
        boolean ans = false;
        int start = 0;
        int end = new Double(Math.sqrt(c)).intValue();
        System.out.println(c);
        while(start <= end){
            if(start * start + end * end == c) {
                ans = true;
                break;
            }
            else if(start * start + end * end > c)
                end--;
            else
                start++;
            System.out.println(start+ " "+end);
        }
        return ans;
    }

    public static void main(String args[]){
        int a = 2;
        System.out.println(judgeSquareSum(a));
    }
}
