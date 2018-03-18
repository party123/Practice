import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by 6 on 2017/9/16.
 */
public class wangyigame_liuliang {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = null;
        String s2 = null;
        String s6 = null;
        String s5 = null;
        HashMap<String,Integer> map = new HashMap<>();
        int s3= 0;
        int sum1 = 0;
        for(int i = 0 ; i< n;i++){
            s = sc.next();
            s2 = sc.next();
            s3 = sc.nextInt();
            sum1+=s3;
           // System.out.println(s+s2+s3);
            Double temp = 0.0;
            StringBuilder ss = new StringBuilder();
            ss.append(s.substring(6,10)+s.substring(0,2)+s.substring(3,5)+s2.substring(0,2)+s2.substring(3,5)+s2.substring(6,8));
            String s4 = ss.toString();
            map.put(s4,sum1);
       //     System.out.println(s4+" "+s3);
        }
        int m = sc.nextInt();

        for(int i = 0;i<m;i++){
            int sum = 0;
            s = sc.next();
            s2 = sc.next();
            s5 = sc.next();
            s6 = sc.next();
            // System.out.println(s+s2+s3);
            StringBuilder ss1 = new StringBuilder();
            ss1.append(s.substring(6,10)+s.substring(0,2)+s.substring(3,5)+s2.substring(0,2)+s2.substring(3,5)+s2.substring(6,8));
            String s7 = ss1.toString();
            StringBuilder ss2 = new StringBuilder();
            ss2.append(s5.substring(6,10)+s5.substring(0,2)+s5.substring(3,5)+s6.substring(0,2)+s6.substring(3,5)+s6.substring(6,8));
            String s8 = ss2.toString();
         //   System.out.println(s7+" "+s8);
            int key1 = 1;
            int key2 = 1;
            String ssss1 = null;
            String ssss2 = null;
            for(String key:map.keySet()){
                if(key1==1 && key.compareTo(s7)>0){
                   ssss1 = key;
                    key1 = 0;
                }
                if(s8.compareTo(key)>=0){
                    ssss2 = key;
                }
            }
            System.out.println(ssss1+" "+ssss2);
            if(ssss1 == null)
                System.out.println(0);
            else {
                int ans = map.get(ssss2) - map.get(ssss1);
                System.out.println(ans);
            }
        }
    }

}
