/**
 * Created by 6 on 2018/3/1.
 */
public class Leetcode_766_Toeplitz_Matrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix == null) return false;
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[0].length;j++)
                if(matrix[i][j]!=matrix[i+1][j+1])
                    return false;
        }
        return true;
    }
}
