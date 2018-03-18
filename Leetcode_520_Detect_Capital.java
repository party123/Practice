/**
 * Created by 6 on 2018/3/2.
 */
public class Leetcode_520_Detect_Capital {
    public boolean detectCapitalUse(String word) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i)>='a'&&word.charAt(i)<='z')
                sum2++;
            if(word.charAt(i)>='A'&&word.charAt(i)<='Z')
                sum1++;
        }
        if(sum1 == word.length() || sum2 == word.length() || (word.charAt(0) >= 'A' && word.charAt(0) <='Z' && sum2 == word.length()-1))
            return true;
        return false;
    }
}
