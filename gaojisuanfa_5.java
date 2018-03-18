/**
 * Created by 6 on 2017/5/25.
 */
public class gaojisuanfa_5 {
    public static void main(String[] args){
        int[] A={1,5,8,2,5,1};

        int li = -1, lj = A.length - 1, gi = -1, gj = -1;
        int lsum = Integer.MIN_VALUE, gsum = Integer.MIN_VALUE;

        for(int i=A.length -2; i>=0; i--) {
            //局部最大值发生变化，此时需要更新局部最大值和最小值
            if(A[i] > A[lj]) {
                //更新局部最大值和最小值之前，先进行判断是否需要更新全局最大最小值
                if(li != -1 && lsum > gsum) {
                    gsum = lsum;
                    gi = li;
                    gj = lj;
                }
                lj = i; //更新局部最大值
                li = -1; //初始化局部最小值
            }
            //当前值不大于局部最大值，需要判断是否更新局部最小值
            else {
                if(li == -1)
                    li = i;
                else
                    li = A[i] > A[li] ? i : li;
                lsum = A[li] + A[lj];
            }
        }
        //最终更新全局最小值和最大值
        if(lsum > gsum) {
            gi = li;
            gj = lj;
            gsum = lsum;
        }
        System.out.println(A[gi] + "," + A[gj] + "," + gsum);
    }

}
