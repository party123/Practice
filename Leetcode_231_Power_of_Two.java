/**
 * Created by 6 on 2018/3/4.
 */
public class Leetcode_231_Power_of_Two {
    public static boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        int l = 1;
        int r = n;
        while(l <= r){
            int mid = l + (r - l)/2;
            System.out.println(mid);
            if(Math.pow(2,mid) == n)
                return true;
            else if(Math.pow(2,mid) > n)
                r = mid - 1;
            else l = mid + 1;
        }
       return false;
    }

    public static void main(String args[]){
        System.out.println(isPowerOfTwo(8));
    }
}
