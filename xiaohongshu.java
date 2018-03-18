/**
 * Created by 6 on 2017/7/13.
 */
import java.util.Scanner;
public class xiaohongshu {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = 0;
        String str = null;
        num = s.nextInt();
        s.nextLine();
        str= s.nextLine();

        int len1 = 0;
        int len2 = 0;
        int len = 0;
        for(int i = 0 ; i < str.length() ; i ++ ){
            if(str.charAt(i) == '0')
                len1 ++;
            if(str.charAt(i) == '1')
                len2 ++;
        }
        len = len1 > len2?len2:len1;
        System.out.println(len*2);
    }
}
