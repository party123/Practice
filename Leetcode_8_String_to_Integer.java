import java.util.Scanner;

/**
 * Created by 6 on 2017/10/13.
 */
public class Leetcode_8_String_to_Integer {
    public  static int myAtoi(String str){
        StringBuilder ss = new StringBuilder();
        str = str.trim();
        int sign = 1;
        if(str.length()==0)
            return 0;
        if(str.charAt(0)=='-')
            sign = -1;
        int i =0;
        while(str.charAt(i)>='0'&& str.charAt(i)<='9' && i<str.length()){

        }
        if(str.charAt(0)=='+'){
            if(str.length()==1) return 0;
            return Integer.valueOf(str.substring(1,str.length()));
        }
        else if (str.charAt(0)=='-'){
            if(str.length()==1) return 0;
            int a = Integer.valueOf(str.substring(1,str.length()));
            return a*(-1);
        }
        else{
            return Integer.valueOf(str);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
      //  int a = myAtoi(s);
        System.out.println(myAtoi(s));
    }
}
