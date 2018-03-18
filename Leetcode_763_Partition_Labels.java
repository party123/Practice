import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by 6 on 2018/1/14.
 */
public class Leetcode_763_Partition_Labels {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();

        int[] table = new int[26];
        char[] stc = S.toCharArray();
        for(char c:stc)
            table[c-'a']++;

        int i = 0, j = 0, l = S.length(), counter = 0;
        HashSet<Character> hs = new HashSet<>();
        while(j < l){
            char c = stc[j];
            if(!hs.contains(c)){
                hs.add(c);
                counter++;
            }
            table[c-'a']--;
            j++;
            if(table[c-'a'] == 0){
                counter--;
                hs.remove(c);
            }
            if(counter == 0){
                res.add(j - i);
                i = j;
            }
        }
        return res;
    }
}
