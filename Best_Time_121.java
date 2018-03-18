import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by 6 on 2017/7/10.
 */
public class Best_Time_121 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int len = prices.length;
        if(len == 0) return 0;
        int max = prices[len-1];
        int temp = 0;
        for(int i = len-2; i >= 0 ;i--)
        {
            temp = max - prices[i];
            if(temp > ans)
                ans = temp;
            if(prices[i] > max)
                max = prices[i];
        }

        return ans;
    }
}
