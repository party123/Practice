import java.util.ArrayList;

/**
 * Created by 6 on 2018/3/13.
 */
public class offer_20 {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix == null || matrix.length == 0)
            return null;
        ArrayList<Integer> ans = new ArrayList<>();
        int llen = matrix[0].length;
        int rlen = matrix.length;
        int start = 0;
        while(llen > start * 2 && rlen > start * 2){
            int end_y = rlen - start - 1;
            int end_x = llen - start - 1;
            if(start <= end_x){
                for(int i = start; i <= end_x; i++){
                    ans.add(matrix[start][i]);
                }
            }
            if(start <= end_y){
                for(int i = start + 1; i <= end_y; i++){
                    ans.add(matrix[i][end_x]);
                }
            }
            if(start < end_x && start < end_y){
                for(int i = end_x - 1; i >=start; i--){
                    ans.add(matrix[end_y][i]);
                }
            }
            if(start < end_x && start < end_y - 1){
                for(int i = end_y - 1; i >= start + 1; i--){
                    ans.add(matrix[i][start]);
                }
            }
            start++;
        }
        return ans;
    }

    public static void main(String args[]){
        int[][] temp = new int[4][4];
        int[][] temp2 = new int[1][1];
        temp2[0][0] = 1;
        int t = 1;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                temp[i][j] = t++;
            }
        }

        System.out.println(printMatrix(temp2));
    }
}
