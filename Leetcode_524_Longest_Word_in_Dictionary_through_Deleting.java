import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by 6 on 2018/3/7.
 */
public class Leetcode_524_Longest_Word_in_Dictionary_through_Deleting {
    public static String findLongestWord(String s, List<String> d) {
        if(s == "" || d.size() == 0)
            return "";
        Collections.sort(d, (a, b) -> {
            if (a.length() != b.length()) return b.length() - a.length();
            return a.compareTo(b);
        });
        int max = 0;
        int index = -1;
        for(int i = 0; i < d.size(); i++){
            String temp = d.get(i);
            if(subString(s,temp) && temp.length() > max){
                max = temp.length();
                index = i;
            }

        }
        if(index == -1)
            return "";
        return d.get(index);
    }

    public static boolean subString(String s,String t){
        int start1 = 0;
        int start2 = 0;
        int sum = 0;
        while(start1<s.length() && start2<t.length()){
            if(s.charAt(start1) == t.charAt(start2)){
        //        System.out.println(start1+" "+start2);
                sum++;
                start1++;
                start2++;
            }
            else start1++;
        }
        return sum == t.length();
    }

    public static void main(String args[]){
        String s = "abpcplea";
        List<String> t = Arrays.asList("ale","apple","monkey","plea");
        String s1 = "apple";
        List<String> t1 = Arrays.asList("zxc","vbn");
        String s2 = "aewfafwafjlwajflwajflwafj";
        List<String> t2 = Arrays.asList("apple","ewaf","awefawfwaf","awef","awefe","ewafeffewafewf");
        System.out.println(findLongestWord(s1,t1));
    }
}
