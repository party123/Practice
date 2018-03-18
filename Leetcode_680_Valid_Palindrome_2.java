/**
 * Created by 6 on 2017/11/3.
 */
public class Leetcode_680_Valid_Palindrome_2 {
    public static boolean validPalindrome(String s) {
        for(int i = 0,j = s.length()-1; i < j; i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return panduan(s,i-1,j)||panduan(s,i,j+1);
            }
        }
        return true;
    }

    public static boolean panduan(String s,int i,int j){
        while(i++ < j--){
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        String s = "atbbga";
        System.out.println(validPalindrome(s));

    }
}
