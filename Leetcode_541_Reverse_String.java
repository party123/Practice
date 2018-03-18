import java.util.Stack;

/**
 * Created by 6 on 2017/11/3.
 */
public class Leetcode_541_Reverse_String {
    public String reverseStr(String s, int k) {
        Stack<Character> sc = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < k; i++){
            sc.add(s.charAt(i));
        }
        while(sc.size()!=0){
            ans.append(sc.pop());
        }
        for(int j = k; j < s.length(); j++)
            ans.append(s.charAt(j));
        return ans.toString();
    }
}
