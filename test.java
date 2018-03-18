import java.util.Scanner;

/**
 * Created by 6 on 2017/7/13.
 */
public class test {
    private static int j = 0;

    public static void main(String[] args) {
        test2(0);
        System.out.println(j);


    }

    public static void test2(int i) {
        boolean b;
        b = i < 100 | test1(3);
        b = i < 010 || test1(6);
    }

    private static boolean test1(int k) {
        j += k;
        return true;
    }
}
