import java.util.Scanner;
import java.util.Stack;

/**
 * Created by 6 on 2017/9/24.
 */
public class WAP_Linear_Structure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 0;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            if (s.equals("push_front") || s.equals("push_back")) {
                k = in.nextInt();
                if (s.equals("push_front")) {
                    s1.push(k);

                }
                if (s.equals("push_back")) {
                    s2.push(k);

                }
            }


            if (s.equals("pop_front")) {
                if(s1.size()==0) {
                    if (s2.size() == 0)
                        System.out.println("error");
                    else {
                        while (s2.size() != 0) {
                            int p2 = s2.pop();
                            s1.push(p2);
                        }
                        int p3 = s1.pop();
                        System.out.println(p3);
                    }
                }
                else {
                    int p = s1.pop();
                    System.out.println(p);
                }
            }

            if(s.equals("pop_back")){
                if(s2.size()==0) {
                    if (s1.size() == 0)
                        System.out.println("Error");
                    else {
                        while (s1.size() != 0) {
                            int p2 = s1.pop();
                            s2.push(p2);
                        }
                        int p3 = s2.pop();
                        System.out.println(p3);
                    }
                }
                else {
                    int p = s2.pop();
                    System.out.println(p);
                }
            }

            if(s.equals("reverse")){
                Stack<Integer> s3 = null;
                s3 = s2;
                s2 = s1;
                s1 = s3;
                /*
                Stack<Integer> s3 = new Stack<>();
                Stack<Integer> s4 = new Stack<>();
                while(s1.size()!=0){
                    s3.push(s1.pop());
                }
                while(s2.size()!=0){
                    s4.push(s2.pop());
                }
                while(s3.size()!=0){
                    s1.push(s4.pop());
                }
                while(s4.size()!=0){
                    s2.push(s3.pop());
                }
            }
*/
            }
            if(s.equals("max")){
                if(s1.size()==0&&s2.size()==0){
                    System.out.println("Error");
                }
                else {
                    Stack<Integer> s5 = new Stack<>();
                    Stack<Integer> s6 = new Stack<>();
                    int max = -1;
                    while (s1.size() != 0) {
                        int k1 = s1.pop();
                        s5.push(k1);
                        max = Math.max(max,k1);
                    }
                    while (s2.size() != 0) {
                        int k2 = s2.pop();
                        s6.push(k2);
                        max = Math.max(max,k2);
                    }
                    System.out.println(max);
                    while (s5.size() != 0) {
                        s1.push(s5.pop());
                    }
                    while (s6.size() != 0) {
                        s2.push(s6.pop());
                    }
                }
            }
        }
    }
}
