import java.util.ArrayList;
import java.util.List;

/**
 * Created by 6 on 2018/1/31.
 */
public class Leetcode_118_Pascal_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        for(int i = 0;i < numRows; i++){
            temp.add(0,1);
            for(int j = 1; j < temp.size()-1; j++){
                System.out.println(j+" "+temp.get(j));
                temp.set(j,temp.get(j)+temp.get(j+1));
            }
            ans.add(new ArrayList<>(temp));
        }
        return ans;
    }

    public static void main(String args[]){
         generate(5);

    }
}
