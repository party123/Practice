import java.util.*;

/**
 * Created by 6 on 2018/1/13.
 */
public class Leetcode_438_Find_All_Anagrams_in_a_String {
    /*
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.equals(p)){
            ans.add(0);
            return ans;
        }
        int len = p.length();
        char[] p1 = p.toCharArray();
        Arrays.sort(p1);
        p = String.valueOf(p1);
        for(int i = 0; i <= s.length()-len; i++){
            if(compare(s.substring(i,i+len),p))
                ans.add(i);
        }
        return ans;
    }

    public boolean compare(String s, String t) {
            char[] s1 = s.toCharArray();
            Arrays.sort(s1);
            return(String.valueOf(s1)).equals(t);

    }
    */
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> res = new HashMap<>();
        int len = p.length();
        for (int i = 0; i < len; i++) {
            if (res.containsKey(p.charAt(i)))
                res.put(p.charAt(i), res.getOrDefault(p.charAt(i),0) + 1);
        }

        int ll = 0;
        int rr = 0;
        int sum = res.size();
        while (rr < s.length()) {
            char temp = s.charAt(rr);
            if (res.containsKey(temp)) {
                res.put(temp, res.get(temp) - 1);
                if (res.get(temp) == 0)
                    sum--;
            }
            rr++;

            if (sum == 0) {
                char temp1 = s.charAt(ll);
                if (res.containsKey(temp1)) {
                    res.put(temp1, res.get(temp1) + 1);
                    if (res.get(temp1) > 0) {
                        sum++;
                    }
                }
                if (rr - ll == len) {
                    ans.add(ll);
                }
                ll++;
            }
        }

        return ans;
    }
}
