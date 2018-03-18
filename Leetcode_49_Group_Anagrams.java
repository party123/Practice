import java.util.*;

/**
 * Created by 6 on 2018/1/12.
 */
//通过 对两个字符串进行排序 判断他们是否是经过顺序变化的字符串
public class Leetcode_49_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String s = number(strs[i]);
            if(!res.containsKey(s)){
                res.put(s,new ArrayList<String>());
            }
    //不能用else 不然上面的内容没有添加，即只出现一次的没有加入list
                res.get(s).add(strs[i]);

        }
        return new ArrayList<List<String>>(res.values());
    }

    public String number(String s){
        char[] ans = s.toCharArray();
        Arrays.sort(ans);
        return String.valueOf(ans);
    }
}
