import java.util.ArrayList;
import java.util.List;

/**
 * Created by 6 on 2018/3/2.
 */
public class Leetcode_784_Letter_Case_Permutation {
    public static List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        ans.add(S);
        for(int i = 0; i < S.length();i++){
            if((S.charAt(i)>='a'&&S.charAt(i)<='z') || S.charAt(i)>='A'&&S.charAt(i)<='Z'){
                int num = ans.size();
                for(int j = 0; j < num; j++){
                    String temp1 = ans.get(j);
                    char[] temp2 = temp1.toCharArray();
                    String s = null;
                    if(S.charAt(i)>='a'&&S.charAt(i)<='z') {
                        temp2[i] = (char) (temp2[i] - 32);
                        s = String.valueOf(temp2);

                    }
                    else if(S.charAt(i)>='A'&&S.charAt(i)<='Z'){
                        temp2[i] = (char) (temp2[i] + 32);
                        s = String.valueOf(temp2);

                    }
                    if(!ans.contains(s))
                        ans.add(s);
                }

            }

        }
        return ans;
    }

    public static void main(String args[]){
        String s ="xxulYjUwme";
        System.out.println(letterCasePermutation(s));
    }
}
