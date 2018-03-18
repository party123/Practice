/**
 * Created by 6 on 2017/9/4.
 */
public class Container_With_Most_Water_11 {
    public int maxArea(int[] height){
        int ans = Integer.MIN_VALUE;
        int l = 0;
        int r = height.length -1;
        while(l<r){
            ans = Math.max(ans,Math.min(height[l],height[r])*(r-l));
            if(height[l]<height[r])
                l++;
            else r--;
        }

        return ans;
    }
}
