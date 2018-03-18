import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 6 on 2018/3/9.
 */
public class Leetcode_66_Plus_One {
    public static int[] plusOne(int[] digits) {
       for(int i = digits.length-1 ; i >= 0; i--) {
           if (digits[i] < 9) {
               digits[i]++;
               return digits;
           }
           digits[i] = 0;
       }
       int[] ans  = new int[digits.length+1];
        ans[0] = 1;

        return ans;
    }

    public static void main(String args[]){
        int[] temp = {9,8,7,6,5,4,3,2,1,0};
        int[] ans = plusOne(temp);
        for(int i = 0; i< ans.length; i++){

        }
        //    System.out.print(ans[i]);
    }
}
