/**
 * Created by 6 on 2018/1/30.
 */
public class leetcode_122_Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 1; i < prices.length;i++){
            if(prices[i]>prices[i-1])
                sum+=prices[i]-prices[i-1];
        }
        return sum;
    }
}
