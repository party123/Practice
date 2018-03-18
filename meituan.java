import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 6 on 2017/8/31.
 */
public class meituan {
    public static void main(String[] args) {
        int n;
        int ans = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int sum = a[n-1];
        int sum1 = 0;
     //   for(int j = n-2;j >= 0; j--){
     //       sum-=a[j];
      //      if(sum<0){
      //          ans = 0;
      //          break;
     //       }
     //       sum+=a[j];
     //   }
        for(int k = 0;k < n-1 ;k++){
            sum1+=a[k];
        }
        if(sum1<a[n-1]){
            System.out.println("NO");
        }
        else
            System.out.println("YES");

    }
    }
