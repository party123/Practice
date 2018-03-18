/**
 * Created by 6 on 2017/8/31.
 */
import java.util.HashMap;
import java.util.Scanner;

    public class meituan2 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                int n = in.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++)
                    arr[i] = in.nextInt();
                int k = in.nextInt();
                int ans = maxLen(arr,k);
                if(ans>0)
                System.out.println(maxLen(arr,k));          //考虑非正常结果情况
                else
                    System.out.println(0);

            }

        }

        //思想:
        //用map来代替二维数组，将每个相加%n的结果存在map里，如果后面又出现了相同的模，说明中间加的这些数可以被n整除，相当于加了模0
        //所以用第二次出现的出现的坐标减去第一次出现的模的坐标，及为中间可整除的长度
        private static int maxLen(int[] arr,int k){
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            map.put(0,-1);
            int len = arr.length;
            int sum=0;
            int max = -1;
            for(int i=0;i<len;i++){
                sum += arr[i];
                if(map.containsKey(sum%k)){
                    if(i - map.get(sum%k) > max)
                        max = i-map.get(sum%k);
                }
                else
                    map.put(sum%k, i);
            }
            return max;
        }


    }


