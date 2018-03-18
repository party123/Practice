/**
 * Created by 6 on 2017/11/3.
 */
public class Leetcode_657_Judge_Route_Circle {
    public boolean judgeCircle(String moves) {
        int temp1 = 0;
        int temp2 = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i)=='U')
                temp1++;
            if(moves.charAt(i)=='D')
                temp1--;
            if(moves.charAt(i)=='L')
                temp2--;
            if(moves.charAt(i)=='R')
                temp2++;

        }
        if(temp1 == 0 && temp2 == 0)
            return true;
        return false;
    }
}
