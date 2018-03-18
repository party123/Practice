import java.util.Arrays;

/**
 * Created by 6 on 2018/3/5.
 */
public class Leetcode_455_Assign_Cookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        int l = g.length - 1;
        int i = s.length - 1;
        while (l>=0 && i>=0){
            if(s[i]>=g[l]) {
                ans++;
                l--;
                i--;
            }
            else {
                l--;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        System.out.println(findContentChildren(g,s));
    }
}
