import java.util.Scanner;

/**
 * Created by 6 on 2017/10/20.
 */
public class Leetcode_67_Add_Binary {
    public static String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int jinwei = 0;
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();
        for(int i = len1-1, j= len2-1; i >=0 || j>=0; i--,j--){
            int p1 = i<0?0:a.charAt(i)-'0';
            int p2 = j<0?0:b.charAt(j)-'0';

            int sum = p1 + p2 + jinwei;
            s.append(sum%2);
            jinwei = sum / 2;


        }
        if(jinwei !=0 )
            s.append(jinwei);

        for(int k = s.length()-1;k>=0;k--){
            t.append(s.charAt(k));
        }
        return t.toString();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String ans = addBinary(s1,s2);
        System.out.println(ans);
    }
}
