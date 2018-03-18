/**
 * Created by 6 on 2018/2/28.
 */
public class Leetcode_74_Search_a_2D_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int i = 0;
        int j = matrix[0].length -1;
        while(i < matrix.length && j>=0){
                if (matrix[i][j] == target)
                    return true;
                else if (matrix[i][j] > target){
                    j--;
                }
                else if (matrix[i][j] < target){
                    i++;
                }
            }

        return false;
    }

    public static void main(String args[]){
        int[][] matrix = new int[1][1];
         matrix[0][0] = 1;
        System.out.println(matrix[0][0]);
        System.out.println(searchMatrix(matrix,0));
    }
}
