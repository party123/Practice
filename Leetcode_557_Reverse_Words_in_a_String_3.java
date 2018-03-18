import java.util.Stack;

/**
 * Created by 6 on 2017/11/3.
 */
public class Leetcode_557_Reverse_Words_in_a_String_3 {
    public String reverseWords(String s) {
        Stack<Character> sc = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)!=' '){
                sc.push(s.charAt(i));
            }
            else if((s.charAt(i)==' ') && sc.size()!=0){
                while(sc.size()!=0){
                    Character a = sc.pop();
                    ans.append(a);
                }
                ans.append(' ');
            }
            else if(s.charAt(i)==' ' && sc.size()==0){
                ans.append(' ');
            }

        }
        if(sc.size()!=0){
            while(sc.size()!=0){
                Character a = sc.pop();
                ans.append(a);
            }
        }
        return ans.toString();
    }
}
