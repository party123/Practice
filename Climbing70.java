import java.util.ArrayList;
import java.util.List;

/**
 * Created by 6 on 2017/4/1.
 */
public class Climbing70 {
    public int climbStairs(int n)
    {
        int result = 0;
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int temp1 = 2;
        int temp2 = 1;
        for(int i = 2; i<n; i++)
        {
            result = temp1 + temp2;
            temp1 = result;
            temp2 = temp1;
        }

        return result;
    }
}
