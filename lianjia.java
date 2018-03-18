import java.util.Scanner;

/**
 * Created by 6 on 2017/8/21.
 */
public class lianjia {
    public static void main(String[] args) {
        int a[] = new int[1005];
        int b[] = new int[1005];
        int la[] = new int[1005];
        int i = 0;
        int j = 0;
        int n = 0;
        int x = 0;
        int y = 0;
        int t = 0;
        int s = 0;
        Scanner str = new Scanner(System.in);
        n = str.nextInt();
        for (i = 1; i <= n; i++) {
            a[i] = str.nextInt();
            b[i] = str.nextInt();
        }

        for (i = 1; i < n; i++) {
            for (j = i + 1; j <= n; j++) {
                if ((a[i] == a[j] && b[i] > b[j]) || a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                    t = b[i];
                    b[i] = b[j];
                    b[j] = t;
                }
            }
        }
        s = 1;
        la[s] = b[1];
        for(i =2 ; i<= n; i++) {
            x = 0;
            y = -1;
            for (j = 1; j <= s; j++) {
                if (la[j] > x && la[j] <= b[i]) {
                    x = la[j];
                    y = j;
                }
            }
            if (y == -1) {
                s++;
                la[s] = b[i];
            } else
                la[y] = b[i];
        }
        System.out.println(s);

    }
}

