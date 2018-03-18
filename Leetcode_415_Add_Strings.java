/**
 * Created by 6 on 2018/3/9.
 */
public class Leetcode_415_Add_Strings {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int jinwei = 0;
        for(int i = num1.length()-1,j = num2.length()-1; i >= 0 || j>=0; i--,j--){
            int x = i < 0?0:num1.charAt(i) - '0';
            int y = j < 0?0:num2.charAt(j) - '0';
            int temp = x + y + jinwei;
            if(temp <= 9){
                ans.append((char)(temp+'0'));
                jinwei = 0;
            }
            else {
                ans.append((char)(temp - 10 +'0'));
                jinwei = 1;
            }
        }
        if(jinwei == 1)
            ans.append(jinwei);
        return ans.reverse().toString();
    }
}
