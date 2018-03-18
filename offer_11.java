/**
 * Created by 6 on 2018/3/12.
 */
public class offer_11 {
    public double Power(double base, int exponent) {
        double ans = 1;
        int temp = exponent > 0 ? exponent : -exponent;
        while (temp-- > 0) {
            ans *= base;
        }
        if (exponent > 0)
            return ans;
        return 1.0 / ans;
    }
}
