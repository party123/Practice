import java.util.*;

/**
 * Created by 6 on 2017/11/2.
 */
public class Leetcode_389_Find_the_Difference {
    public static char findTheDifference(String s, String t) {
        HashMap<Character,Integer> sc = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(sc.containsKey(s.charAt(i)))
                sc.put(s.charAt(i),sc.get(s.charAt(i))+1);
            else
                sc.put(s.charAt(i),1);
        }

        for(int j = 0 ; j < t.length(); j++){
            if(sc.containsKey(t.charAt(j)) && sc.get(t.charAt(j))>0)
                sc.put(t.charAt(j),sc.get(t.charAt(j))-1);
            else
                return t.charAt(j);
        }
        for(char temp:sc.keySet()){
            if(sc.get(temp)>0)
                return temp;
        }
        return ' ';
    }

    public static void main(String args[]){
        String s1 = "abcd";
        String s2 = "abcde";
        System.out.println(findTheDifference(s1,s2));
    }
}
