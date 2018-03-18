/**
 * Created by 6 on 2018/3/5.
 */
public class Leetcode_605_Can_Place_Flowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
       int sum =0;
        for(int i = 0; i < flowerbed.length -1; i++)
            if(flowerbed[i] == 1)
                flowerbed[i+1] = -1;
        for(int j = flowerbed.length-1; j > 0;j--)
            if(flowerbed[j] == 1)
                flowerbed[j-1] = -1;
        for(int k = 0; k < flowerbed.length; k++) {
            if (flowerbed[k] == 0){
                sum++;
                k++;
            }
        }
        if(sum >= n)
            return true;
        return false;
    }

    public static void main(String args[]){
        int[] f = {1,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(f,2));
    }
}
