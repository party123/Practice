import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by 6 on 2018/3/7.
 */
public class Leetcode_406_Queue_Reconstruction_by_Height {
    public int[][] reconstructQueue(int[][] people) {
        int[][] ans = null;
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0] == b[0])
                    return a[1] - b[1];
                return b[0] - a[0];
            }
        });
        return ans;
    }
}
