import java.util.Scanner;
import java.util.Stack;

public class JingDong_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int ans = getSum(s);
            System.out.println(ans);

    }

    private static int getSum(String ss) {
        int con  = 1;
        Stack<Character> sk = new Stack<Character>();
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) == '(') {
                sk.push('(');
            }
            if (ss.charAt(i) == ')') {
                con  *= sk.size();
                sk.pop();
                }
            }

        return con;
    }
}
