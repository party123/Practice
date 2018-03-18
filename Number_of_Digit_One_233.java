import java.util.Scanner;

/**
 * Created by 6 on 2017/8/22.
 */
public class Number_of_Digit_One_233 {
    public static int countDigitOne(int n) {
        int count = 0;
        int temp = n;
        int base = 1;
        while(temp > 0){
            int low = temp % 10;
            temp /= 10;
            count += temp * base;
            if(low > 1)
                count+=base;
            if(low == 1)
                count+=(n%base)+1;
            base*=10;
        }
        return count;
    }

    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        int ans = countDigitOne(n);
        System.out.println(ans);
    }
}
