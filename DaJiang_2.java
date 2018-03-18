import java.util.HashMap;
import java.util.Scanner;

public class DaJiang_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int k = in.nextInt();
            long sum =0;
            int pos = 0;
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
                map.put(arr[i], 0);
            }
            for(int i=0;i<n;i++){
                map.put(arr[i],map.get(arr[i])+1);
                while(map.get(arr[i]) >k){
                    map.put(arr[pos],map.get(arr[pos])-1);
                    pos++;
                }
                sum += i-pos+1;

            }
            System.out.println(sum);
        }
    }

}
