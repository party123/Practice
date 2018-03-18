/**
 * Created by 6 on 2018/2/27.
 */
public class Leetcode_69_Sqrt {
    public static int mySqrt(int x) {
        int ans = 0;
        int mid =0;
        int l = 1;
        int r = x;
        while(l <= r){
            mid = l + (r-l)/2;
            ans = x/mid;
            if(ans == mid)
                return ans;
            else if(ans < mid)
                r = mid-1;
            else
                l = mid+1;
        }
        return r;

    }

    public static void main(String args[]){
        System.out.println(mySqrt(2147395599));
    }
}
