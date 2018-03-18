import java.util.Scanner;
import java.util.Stack;

/**
 * Created by 6 on 2017/10/18.
 */
//循环遍历，将左括号压入堆栈，遇到右括号弹出栈并进行判断，其中注意栈为空的情况
public class Leetcode_20_Valid_parentheses {
    public static boolean isValid(String s) {
       Stack stack = new Stack();
       for(int i = 0; i < s.length(); i++){
           char c = s.charAt(i);

           if(c == '(' || c == '{'|| c == '['){
               if(c == '(')
                   stack.push(')');
               if(c == '{')
                   stack.push('}');
               if(c == '[')
                   stack.push(']');
           }

           if(c == ')' || c == '}' || c == ']'){
               if(stack.size()!=0) {
                   char t = (char)stack.pop();

                   if (t == c)
                       continue;
                   else
                       return false;
               }
               else return false;
           }
       }
           if(stack.size() == 0)
               return true;
           else
               return false;
    }

    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        String s = n.next();
        System.out.println(isValid(s));
    }
}
