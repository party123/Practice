import java.util.Scanner;

/**
 * Created by 6 on 2017/10/18.
 */
//从后往前遍历，一直遇到不是空格的为止，然后判断是否是非空格字符，累计
public class Leetcode_58_Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        int t = 0;
        if(s.length() == 0)
            return 0;
        else{
            int j = s.length()-1;
            while(j >= 0 && s.charAt(j) == ' '){         //先判断指针是否已经小于0
                j--;
            }
            if(j<0) return 0;                           //判断是否全为空格情况
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
                t++;
            }

        }
        return t;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }
}
