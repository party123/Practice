/**
 * Created by 6 on 2017/5/11.
 */
public class Path_Sum {
    boolean ans = false;
    boolean ans1 = false;
    boolean ans2 = false;
    public boolean hasPathSum(TreeNode root, int sum) {

        if(root == null) return false;
        boolean isleaf = root.left== null && root.right == null;
        int res = sum - root.val;
        if(res == 0 && isleaf == true) return true;
        if(root.left!=null) ans1 = hasPathSum(root.left,res);
        if(root.right!=null) ans2 = hasPathSum(root.right,res);

        return ans1 || ans2;
    }
    public static void main(String args[]){

    }
}
