import java.util.Scanner;
import java.util.HashMap;
/**
 * Created by 6 on 2017/9/24.
 */
public class WAP_Coin_Game {
    public static void main(String args[]){
        HashMap<Integer, Integer> row = new HashMap<>();
        HashMap<Integer, Integer> col = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String[] str = new String[m];
        in.nextLine();
        int t1 = m;
        int t2 = n;
        int sum = 0;
        while(t1-->=0){
            row.put(t1,0);
        }
        while(t2-->=0){
            col.put(t2,0);
        }


        for(int i = 0; i < m; i ++){
            String shuru = in.nextLine();
            for(int j = 0; j < shuru.length(); j++){
                if(shuru.charAt(j) == 'o'){
                    row.put(i, row.get(i) + 1);
                    col.put(j, col.get(j) + 1);
                    sum++;
                }
            }
            str[i] = shuru;
        }
        int ans = in.nextInt();
        int daan = getans(str, row, col, ans, sum);
        daan = daan == Integer.MAX_VALUE ? -1 : daan;
        System.out.println(daan);
    }

    public static int getans(String[] str, HashMap<Integer, Integer> rowmap, HashMap<Integer, Integer> colmap, int k, int Chess) {
        int Removed = 0;
        int dax1 = 0, minx2 = str.length - 1, day1 = 0, miny2 = str[0].length() - 1;

        int removedMax = Chess - k;
        for(int i = 0; i < str.length; i++){
            Removed+= rowmap.get(i);
            if(Removed > removedMax){
                break;
            }
            else{
                dax1++;
            }
        }
        Removed = 0;
        for(int i = str.length - 1; i > 0; i--){
            Removed+= rowmap.get(i);
            if(Removed > removedMax){
                break;
            }
            else{
                minx2--;
            }
        }
        Removed = 0;
        for(int i = 0; i < str[0].length(); i++){
            Removed+= colmap.get(i);
            if(Removed > removedMax){
                break;
            }
            else{
                day1++;
            }
        }
        Removed = 0;
        for(int i = str[0].length() - 1; i > 0; i--){
            Removed+= colmap.get(i);
            if(Removed > removedMax){
                break;
            }
            else{
                miny2--;
            }
        }
        int minMove = Integer.MAX_VALUE;
        for(int i = 0; i < str.length && i <= dax1; i++){
            for(int j = str.length - 1; j >= i && j >= minx2; j--){
                for(int m = 0; m < str[0].length() && m<= day1; m++){
                    for(int n = str[0].length() - 1; n >= m && n >= miny2; n--){
                        int valid = checkValid(i,j,str,m,n, k);
                        if(valid == 0){
                            int curMove = getSum(str, i, j, m, n);
                            minMove = Math.min(curMove, minMove);
                        }
                        else if(valid > 0){
                            break;
                        }
                    }
                }
            }
        }
        return minMove;
    }

    public static int checkValid(int i, int j,  String[] str, int m, int n, int total){
        int Total = 0;
        for(int top = i; top <= j; top++){
            for(int left = m; left <= n; left++){
                String cur= str[top];
                if(cur.charAt(left) == 'o'){
                    Total++;
                    if(Total > total){
                        return 1;
                    }
                }
            }
        }
        if(Total < total){
            return -1;
        }
        else if(Total > total){
            return 1;
        }
        return 0;
    }
    public static int laoge(int i, int j, int k){
        int sum=0;
        for(int p = 0;p<i;p++){
            for(int q = 0;q<j;q++){
                for(int z=0;z<k;z++){
                    sum++;
                }
            }
        }
        return sum;
    }

    public static int getSum( String[] str, int i, int j, int m, int n){
        int daan = 0;
        int top = i;
        int le = m;
        int bt = str.length - 1 - j;
        int ri= str[0].length() - 1 - n;
        int lrm = Math.max(ri, le);
        int lrn = Math.min(ri, le);
        int tbm = Math.min(top, bt);
        int tbn = Math.max(top, bt);

        daan = tbm*2 + tbn + bt + lrm *2 + lrn;
        return daan;
    }
}
